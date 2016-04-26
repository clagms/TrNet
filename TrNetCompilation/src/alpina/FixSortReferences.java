package alpina;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class FixSortReferences {

	public static void main(String[] args) {

		try {
			File fXmlFile = new File(args[0]);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);

			// optional, but recommended
			// read this -
			// http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
			doc.getDocumentElement().normalize();

			System.out.println("Root element :"
					+ doc.getDocumentElement().getNodeName());

			NodeList nList = doc.getElementsByTagName("msSort");

			System.out.println("----------------------------");

			for (int temp = 0; temp < nList.getLength(); temp++) {

				Node sortNode = nList.item(temp);

				System.out.println("\nCurrent Element :"
						+ sortNode.getNodeName());

				if (sortNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) sortNode;

					Node parent = eElement.getParentNode();

					if (parent.getNodeType() == Node.ELEMENT_NODE) {
						Element pElement = (Element) parent;

						System.out.println("\nParent Element :"
								+ pElement.getNodeName());

						if (pElement.getNodeName().equals("ownedPlaceMultiset")) {
							fixPlaceSortDeclaration(
									(Element) pElement.getParentNode(),
									sortNode, doc);
						} else if (pElement.getNodeName().equals(
								"ownedArcMultiset")) {
							fixArcSortDeclaration(
									(Element) pElement.getParentNode(),
									sortNode, doc);
						}
					}

				}
			}

			NodeList nList2 = doc.getElementsByTagName("variableSort");

			for (int temp = 0; temp < nList2.getLength(); temp++) {

				Node sortNode = nList2.item(temp);

				System.out.println("\nCurrent Element :"
						+ sortNode.getNodeName());

				if (sortNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) sortNode;

					Node parent = eElement.getParentNode();

					if (parent.getNodeType() == Node.ELEMENT_NODE) {
						Element pElement = (Element) parent;

						System.out.println("\nParent Element :"
								+ pElement.getNodeName());

						if (pElement.getNodeName().equals("ownedVariables")) {
							fixVariableSortDeclaration((Element) pElement,
									sortNode, doc);
						}
					}

				}
			}

			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory
					.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			File output = new File(args[0]);
			StreamResult result = new StreamResult(output);

			System.out.println("result " + result.getSystemId());

			transformer.transform(source, result);

			System.out.println("Done");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void fixVariableSortDeclaration(Element parentNode,
			Node sortNode, Document doc) {

		String varName = parentNode.getAttribute("name");

		String sortName = varName.substring(0,
				varName.length() - "Var".length());

		Element declaration = doc.createElement("declaration");
		declaration
				.setAttribute("href", sortName + ".adt" + "#//@ownedSorts.0");
		sortNode.appendChild(declaration);

	}

	private static void fixArcSortDeclaration(Element parentNode,
			Node sortNode, Document doc) throws XPathExpressionException {
		Element place;
		if (isArcFromPlace(parentNode, doc)) {
			place = evalRef(parentNode.getAttribute("from"), doc);
		} else {
			// is an arc from a transition, to a place
			place = evalRef(parentNode.getAttribute("to"), doc);
		}

		String placeName = place.getAttribute("name");

		String sortName = placeName.substring(0,
				placeName.length() - "Place".length());

		Element declaration = doc.createElement("declaration");
		declaration
				.setAttribute("href", sortName + ".adt" + "#//@ownedSorts.0");
		sortNode.appendChild(declaration);
	}

	private static boolean isArcFromPlace(Element parentNode, Document doc)
			throws XPathExpressionException {

		Element targetNode = evalRef(parentNode.getAttribute("from"), doc);

		if (targetNode.getAttribute("xsi:type").equals("apnmm:Place")) {
			return true;
		} else {
			assert (targetNode.getAttribute("xsi:type")
					.equals("apnmm:Transition"));

			return false;
		}
	}

	private static Element evalRef(String expression, Document doc) {

		int nodeIndex = extractNodeIndex(expression);

		NodeList nList = doc.getDocumentElement().getElementsByTagName(
				"ownedNodes");

		// forces fully load of the list;
		nList.getLength();

		assert (nList.getLength() - 1 >= nodeIndex);

		return (Element) nList.item(nodeIndex);
	}

	private static int extractNodeIndex(String expression) {
		return Integer.parseInt(expression.substring(expression.length() - 1,
				expression.length()));
	}

	private static void fixPlaceSortDeclaration(Element parentNode,
			Node sortNode, Document doc) {
		String placeName = parentNode.getAttribute("name");

		String sortName = placeName.substring(0,
				placeName.length() - "Place".length());

		Element declaration = doc.createElement("declaration");
		declaration
				.setAttribute("href", sortName + ".adt" + "#//@ownedSorts.0");
		sortNode.appendChild(declaration);

		Node ownedPlaceSort = parentNode.getElementsByTagName("sort").item(0);
		Element declaration2 = doc.createElement("declaration");
		declaration2.setAttribute("href", sortName + ".adt"
				+ "#//@ownedSorts.0");
		ownedPlaceSort.appendChild(declaration2);

	}

}
