package classes_visitor;

import classes.*;
import generic.*;

import org.eclipse.emf.ecore.EObject;


import classes.CModel;
import classes.impl.CModelImpl;
import classes.NamedElement;
import classes.impl.NamedElementImpl;
import classes.Classifier;
import classes.impl.ClassifierImpl;
import classes.CClass;
import classes.impl.CClassImpl;
import classes.Attribute;
import classes.impl.AttributeImpl;
import classes.Datatype;
import classes.impl.DatatypeImpl;
import classes.TypedElement;
import classes.impl.TypedElementImpl;

import java.util.HashMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import java.util.Map;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import java.util.LinkedList;

public class ClassesInputVisitor
implements ModelPatternPublisher
{

LinkedList<ModelPatternListener> listeners;

HashMap<EObject, ModelNode> nodesMap;

public ClassesInputVisitor() {
	listeners = new LinkedList<ModelPatternListener>();
	nodesMap = new HashMap<EObject, ModelNode>(10);
}

public void registerListener(ModelPatternListener listener){
	listeners.add(listener);
}
	
public void notifyListeners(ModelPattern element){
	for (ModelPatternListener listener : listeners){
		listener.notify(element);
	}
}

public CModel load(String path){
	ClassesPackage.eINSTANCE.eClass();
	
	Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
    Map<String, Object> m = reg.getExtensionToFactoryMap();
    m.put("xmi", new XMIResourceFactoryImpl());
	
	ResourceSet resSet = new ResourceSetImpl();
	
	Resource resource = resSet.getResource(URI
        .createURI(path), true);
    
    CModel rootEClass = (CModel) resource.getContents().get(0);
    return rootEClass;
}


public void visitCModel(CModel element){
	
	ModelNode node;
	
	if (! nodesMap.containsKey(element)) {
		node = new ModelNode();
		
	if (element.getClass() == CModelImpl.class) {
			node.types.add("CModel");
	}
		
		nodesMap.put(element, node);
	} else {
		node = nodesMap.get(element);
	}
	
	ModelPattern pattern = new ModelPattern();
	pattern.nodes.add(node);
	notifyListeners(pattern);
	for (Classifier elementTarget : element.getContents() ){
		ModelEdge edge = new ModelEdge();
		edge.name = "contents";
		ModelNode nodeTarget;
		
	if (! nodesMap.containsKey(elementTarget)) {
		nodeTarget = new ModelNode();
		
	if (elementTarget.getClass() == CClassImpl.class) {
			nodeTarget.types.add("CClass");
			nodeTarget.types.add("Classifier");
			nodeTarget.types.add("NamedElement");
			nodeTarget.attributes.put("name", ((CClass) elementTarget).getName()+"");
			nodeTarget.attributes.put("abstract", ((CClass) elementTarget).isAbstract()+"");
	}
	if (elementTarget.getClass() == DatatypeImpl.class) {
			nodeTarget.types.add("Classifier");
			nodeTarget.types.add("Datatype");
			nodeTarget.types.add("NamedElement");
			nodeTarget.attributes.put("name", ((Datatype) elementTarget).getName()+"");
	}
		
		nodesMap.put(elementTarget, nodeTarget);
	} else {
		nodeTarget = nodesMap.get(elementTarget);
	}
		
		edge.source = node;
		edge.target = nodeTarget;
		
		pattern = new ModelPattern();
		pattern.nodes.add(node);
		pattern.nodes.add(nodeTarget);
		pattern.edges.add(edge);
		
		notifyListeners(pattern);
	}
for (Classifier child : element.getContents()) {
	if (child.getClass() == CClassImpl.class) {
		visitCClass((CClass)child);
	}
	if (child.getClass() == DatatypeImpl.class) {
		visitDatatype((Datatype)child);
	}
}
}
public void visitNamedElement(NamedElement element){
	
	ModelNode node;
	
	if (! nodesMap.containsKey(element)) {
		node = new ModelNode();
		
	if (element.getClass() == CClassImpl.class) {
			node.types.add("CClass");
			node.types.add("Classifier");
			node.types.add("NamedElement");
			node.attributes.put("name", ((CClass) element).getName()+"");
			node.attributes.put("abstract", ((CClass) element).isAbstract()+"");
	}
	if (element.getClass() == AttributeImpl.class) {
			node.types.add("TypedElement");
			node.types.add("NamedElement");
			node.types.add("Attribute");
			node.attributes.put("name", ((Attribute) element).getName()+"");
			node.attributes.put("isMany", ((Attribute) element).isIsMany()+"");
	}
	if (element.getClass() == DatatypeImpl.class) {
			node.types.add("Classifier");
			node.types.add("Datatype");
			node.types.add("NamedElement");
			node.attributes.put("name", ((Datatype) element).getName()+"");
	}
		
		nodesMap.put(element, node);
	} else {
		node = nodesMap.get(element);
	}
	
	ModelPattern pattern = new ModelPattern();
	pattern.nodes.add(node);
	notifyListeners(pattern);
}
public void visitClassifier(Classifier element){
	
	ModelNode node;
	
	if (! nodesMap.containsKey(element)) {
		node = new ModelNode();
		
	if (element.getClass() == CClassImpl.class) {
			node.types.add("CClass");
			node.types.add("Classifier");
			node.types.add("NamedElement");
			node.attributes.put("name", ((CClass) element).getName()+"");
			node.attributes.put("abstract", ((CClass) element).isAbstract()+"");
	}
	if (element.getClass() == DatatypeImpl.class) {
			node.types.add("Classifier");
			node.types.add("Datatype");
			node.types.add("NamedElement");
			node.attributes.put("name", ((Datatype) element).getName()+"");
	}
		
		nodesMap.put(element, node);
	} else {
		node = nodesMap.get(element);
	}
	
	ModelPattern pattern = new ModelPattern();
	pattern.nodes.add(node);
	notifyListeners(pattern);
}
public void visitCClass(CClass element){
	
	ModelNode node;
	
	if (! nodesMap.containsKey(element)) {
		node = new ModelNode();
		
	if (element.getClass() == CClassImpl.class) {
			node.types.add("CClass");
			node.types.add("Classifier");
			node.types.add("NamedElement");
			node.attributes.put("name", ((CClass) element).getName()+"");
			node.attributes.put("abstract", ((CClass) element).isAbstract()+"");
	}
		
		nodesMap.put(element, node);
	} else {
		node = nodesMap.get(element);
	}
	
	ModelPattern pattern = new ModelPattern();
	pattern.nodes.add(node);
	notifyListeners(pattern);
	if (element.getExtends() != null) {
		CClass elementTarget = element.getExtends();
		ModelEdge modelEdge = new ModelEdge();
		modelEdge.name = "extends";
		ModelNode nodeTarget;
		
	if (! nodesMap.containsKey(elementTarget)) {
		nodeTarget = new ModelNode();
		
	if (elementTarget.getClass() == CClassImpl.class) {
			nodeTarget.types.add("CClass");
			nodeTarget.types.add("Classifier");
			nodeTarget.types.add("NamedElement");
			nodeTarget.attributes.put("name", ((CClass) elementTarget).getName()+"");
			nodeTarget.attributes.put("abstract", ((CClass) elementTarget).isAbstract()+"");
	}
		
		nodesMap.put(elementTarget, nodeTarget);
	} else {
		nodeTarget = nodesMap.get(elementTarget);
	}
		
		modelEdge.source = node;
		modelEdge.target = nodeTarget;
		pattern = new ModelPattern();
		pattern.nodes.add(node);
		pattern.nodes.add(nodeTarget);
		pattern.edges.add(modelEdge);
		
		notifyListeners(pattern);
	}
	for (CClass elementTarget : element.getSuper() ){
		ModelEdge edge = new ModelEdge();
		edge.name = "super";
		ModelNode nodeTarget;
		
	if (! nodesMap.containsKey(elementTarget)) {
		nodeTarget = new ModelNode();
		
	if (elementTarget.getClass() == CClassImpl.class) {
			nodeTarget.types.add("CClass");
			nodeTarget.types.add("Classifier");
			nodeTarget.types.add("NamedElement");
			nodeTarget.attributes.put("name", ((CClass) elementTarget).getName()+"");
			nodeTarget.attributes.put("abstract", ((CClass) elementTarget).isAbstract()+"");
	}
		
		nodesMap.put(elementTarget, nodeTarget);
	} else {
		nodeTarget = nodesMap.get(elementTarget);
	}
		
		edge.source = node;
		edge.target = nodeTarget;
		
		pattern = new ModelPattern();
		pattern.nodes.add(node);
		pattern.nodes.add(nodeTarget);
		pattern.edges.add(edge);
		
		notifyListeners(pattern);
	}
	for (Attribute elementTarget : element.getAttributes() ){
		ModelEdge edge = new ModelEdge();
		edge.name = "attributes";
		ModelNode nodeTarget;
		
	if (! nodesMap.containsKey(elementTarget)) {
		nodeTarget = new ModelNode();
		
	if (elementTarget.getClass() == AttributeImpl.class) {
			nodeTarget.types.add("TypedElement");
			nodeTarget.types.add("NamedElement");
			nodeTarget.types.add("Attribute");
			nodeTarget.attributes.put("name", ((Attribute) elementTarget).getName()+"");
			nodeTarget.attributes.put("isMany", ((Attribute) elementTarget).isIsMany()+"");
	}
		
		nodesMap.put(elementTarget, nodeTarget);
	} else {
		nodeTarget = nodesMap.get(elementTarget);
	}
		
		edge.source = node;
		edge.target = nodeTarget;
		
		pattern = new ModelPattern();
		pattern.nodes.add(node);
		pattern.nodes.add(nodeTarget);
		pattern.edges.add(edge);
		
		notifyListeners(pattern);
	}
for (Attribute child : element.getAttributes()) {
	if (child.getClass() == AttributeImpl.class) {
		visitAttribute((Attribute)child);
	}
}
}
public void visitAttribute(Attribute element){
	
	ModelNode node;
	
	if (! nodesMap.containsKey(element)) {
		node = new ModelNode();
		
	if (element.getClass() == AttributeImpl.class) {
			node.types.add("TypedElement");
			node.types.add("NamedElement");
			node.types.add("Attribute");
			node.attributes.put("name", ((Attribute) element).getName()+"");
			node.attributes.put("isMany", ((Attribute) element).isIsMany()+"");
	}
		
		nodesMap.put(element, node);
	} else {
		node = nodesMap.get(element);
	}
	
	ModelPattern pattern = new ModelPattern();
	pattern.nodes.add(node);
	notifyListeners(pattern);
	if (element.getType() != null) {
		Classifier elementTarget = element.getType();
		ModelEdge modelEdge = new ModelEdge();
		modelEdge.name = "type";
		ModelNode nodeTarget;
		
	if (! nodesMap.containsKey(elementTarget)) {
		nodeTarget = new ModelNode();
		
	if (elementTarget.getClass() == CClassImpl.class) {
			nodeTarget.types.add("CClass");
			nodeTarget.types.add("Classifier");
			nodeTarget.types.add("NamedElement");
			nodeTarget.attributes.put("name", ((CClass) elementTarget).getName()+"");
			nodeTarget.attributes.put("abstract", ((CClass) elementTarget).isAbstract()+"");
	}
	if (elementTarget.getClass() == DatatypeImpl.class) {
			nodeTarget.types.add("Classifier");
			nodeTarget.types.add("Datatype");
			nodeTarget.types.add("NamedElement");
			nodeTarget.attributes.put("name", ((Datatype) elementTarget).getName()+"");
	}
		
		nodesMap.put(elementTarget, nodeTarget);
	} else {
		nodeTarget = nodesMap.get(elementTarget);
	}
		
		modelEdge.source = node;
		modelEdge.target = nodeTarget;
		pattern = new ModelPattern();
		pattern.nodes.add(node);
		pattern.nodes.add(nodeTarget);
		pattern.edges.add(modelEdge);
		
		notifyListeners(pattern);
	}
}
public void visitDatatype(Datatype element){
	
	ModelNode node;
	
	if (! nodesMap.containsKey(element)) {
		node = new ModelNode();
		
	if (element.getClass() == DatatypeImpl.class) {
			node.types.add("Classifier");
			node.types.add("Datatype");
			node.types.add("NamedElement");
			node.attributes.put("name", ((Datatype) element).getName()+"");
	}
		
		nodesMap.put(element, node);
	} else {
		node = nodesMap.get(element);
	}
	
	ModelPattern pattern = new ModelPattern();
	pattern.nodes.add(node);
	notifyListeners(pattern);
}
public void visitTypedElement(TypedElement element){
	
	ModelNode node;
	
	if (! nodesMap.containsKey(element)) {
		node = new ModelNode();
		
	if (element.getClass() == AttributeImpl.class) {
			node.types.add("TypedElement");
			node.types.add("NamedElement");
			node.types.add("Attribute");
			node.attributes.put("name", ((Attribute) element).getName()+"");
			node.attributes.put("isMany", ((Attribute) element).isIsMany()+"");
	}
		
		nodesMap.put(element, node);
	} else {
		node = nodesMap.get(element);
	}
	
	ModelPattern pattern = new ModelPattern();
	pattern.nodes.add(node);
	notifyListeners(pattern);
	if (element.getType() != null) {
		Classifier elementTarget = element.getType();
		ModelEdge modelEdge = new ModelEdge();
		modelEdge.name = "type";
		ModelNode nodeTarget;
		
	if (! nodesMap.containsKey(elementTarget)) {
		nodeTarget = new ModelNode();
		
	if (elementTarget.getClass() == CClassImpl.class) {
			nodeTarget.types.add("CClass");
			nodeTarget.types.add("Classifier");
			nodeTarget.types.add("NamedElement");
			nodeTarget.attributes.put("name", ((CClass) elementTarget).getName()+"");
			nodeTarget.attributes.put("abstract", ((CClass) elementTarget).isAbstract()+"");
	}
	if (elementTarget.getClass() == DatatypeImpl.class) {
			nodeTarget.types.add("Classifier");
			nodeTarget.types.add("Datatype");
			nodeTarget.types.add("NamedElement");
			nodeTarget.attributes.put("name", ((Datatype) elementTarget).getName()+"");
	}
		
		nodesMap.put(elementTarget, nodeTarget);
	} else {
		nodeTarget = nodesMap.get(elementTarget);
	}
		
		modelEdge.source = node;
		modelEdge.target = nodeTarget;
		pattern = new ModelPattern();
		pattern.nodes.add(node);
		pattern.nodes.add(nodeTarget);
		pattern.edges.add(modelEdge);
		
		notifyListeners(pattern);
	}
}


}
