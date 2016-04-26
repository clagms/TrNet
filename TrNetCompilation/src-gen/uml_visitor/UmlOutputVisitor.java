package uml_visitor;

import uml.*;
import generic.*;

import uml.Package;
import uml.Activity;
import uml.ActivityPartition;
import uml.ActivityGroup;
import uml.Behavior;
import uml.EncapsulatedClassifier;
import uml.StructuredClassifier;
import uml.Type;
import uml.TemplateableElement;
import uml.Classifier;
import uml.Namespace;
import uml.BehavioredClassifier;
import uml.Class;
import uml.OpaqueExpression;
import uml.ValueSpecification;
import uml.TypedElement;
import uml.PackageableElement;
import uml.NamedElement;
import uml.ParameterableElement;
import uml.Element;
import uml.OpaqueAction;
import uml.RedefinableElement;
import uml.ActivityNode;
import uml.ExecutableNode;
import uml.ControlNode;
import uml.Action;
import uml.ObjectNode;
import uml.ActivityParameterNode;
import uml.JoinNode;
import uml.InitialNode;
import uml.DecisionNode;
import uml.ForkNode;
import uml.FinalNode;
import uml.ActivityFinalNode;
import uml.ActivityEdge;
import uml.ObjectFlow;
import uml.ControlFlow;
import uml.RootPackage;

import java.io.IOException;
import java.util.Collections;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import java.util.Map;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class UmlOutputVisitor
implements ModelPatternListener
{
	
	HashSet<ModelNode> PackageSet;
	HashMap<ModelNode, Package> modelNode2Package;
	HashSet<ModelNode> ActivitySet;
	HashMap<ModelNode, Activity> modelNode2Activity;
	HashSet<ModelNode> ActivityPartitionSet;
	HashMap<ModelNode, ActivityPartition> modelNode2ActivityPartition;
	HashSet<ModelNode> ActivityGroupSet;
	HashMap<ModelNode, ActivityGroup> modelNode2ActivityGroup;
	HashSet<ModelNode> BehaviorSet;
	HashMap<ModelNode, Behavior> modelNode2Behavior;
	HashSet<ModelNode> EncapsulatedClassifierSet;
	HashMap<ModelNode, EncapsulatedClassifier> modelNode2EncapsulatedClassifier;
	HashSet<ModelNode> StructuredClassifierSet;
	HashMap<ModelNode, StructuredClassifier> modelNode2StructuredClassifier;
	HashSet<ModelNode> TypeSet;
	HashMap<ModelNode, Type> modelNode2Type;
	HashSet<ModelNode> TemplateableElementSet;
	HashMap<ModelNode, TemplateableElement> modelNode2TemplateableElement;
	HashSet<ModelNode> ClassifierSet;
	HashMap<ModelNode, Classifier> modelNode2Classifier;
	HashSet<ModelNode> NamespaceSet;
	HashMap<ModelNode, Namespace> modelNode2Namespace;
	HashSet<ModelNode> BehavioredClassifierSet;
	HashMap<ModelNode, BehavioredClassifier> modelNode2BehavioredClassifier;
	HashSet<ModelNode> ClassSet;
	HashMap<ModelNode, Class> modelNode2Class;
	HashSet<ModelNode> OpaqueExpressionSet;
	HashMap<ModelNode, OpaqueExpression> modelNode2OpaqueExpression;
	HashSet<ModelNode> ValueSpecificationSet;
	HashMap<ModelNode, ValueSpecification> modelNode2ValueSpecification;
	HashSet<ModelNode> TypedElementSet;
	HashMap<ModelNode, TypedElement> modelNode2TypedElement;
	HashSet<ModelNode> PackageableElementSet;
	HashMap<ModelNode, PackageableElement> modelNode2PackageableElement;
	HashSet<ModelNode> NamedElementSet;
	HashMap<ModelNode, NamedElement> modelNode2NamedElement;
	HashSet<ModelNode> ParameterableElementSet;
	HashMap<ModelNode, ParameterableElement> modelNode2ParameterableElement;
	HashSet<ModelNode> ElementSet;
	HashMap<ModelNode, Element> modelNode2Element;
	HashSet<ModelNode> OpaqueActionSet;
	HashMap<ModelNode, OpaqueAction> modelNode2OpaqueAction;
	HashSet<ModelNode> RedefinableElementSet;
	HashMap<ModelNode, RedefinableElement> modelNode2RedefinableElement;
	HashSet<ModelNode> ActivityNodeSet;
	HashMap<ModelNode, ActivityNode> modelNode2ActivityNode;
	HashSet<ModelNode> ExecutableNodeSet;
	HashMap<ModelNode, ExecutableNode> modelNode2ExecutableNode;
	HashSet<ModelNode> ControlNodeSet;
	HashMap<ModelNode, ControlNode> modelNode2ControlNode;
	HashSet<ModelNode> ActionSet;
	HashMap<ModelNode, Action> modelNode2Action;
	HashSet<ModelNode> ObjectNodeSet;
	HashMap<ModelNode, ObjectNode> modelNode2ObjectNode;
	HashSet<ModelNode> ActivityParameterNodeSet;
	HashMap<ModelNode, ActivityParameterNode> modelNode2ActivityParameterNode;
	HashSet<ModelNode> JoinNodeSet;
	HashMap<ModelNode, JoinNode> modelNode2JoinNode;
	HashSet<ModelNode> InitialNodeSet;
	HashMap<ModelNode, InitialNode> modelNode2InitialNode;
	HashSet<ModelNode> DecisionNodeSet;
	HashMap<ModelNode, DecisionNode> modelNode2DecisionNode;
	HashSet<ModelNode> ForkNodeSet;
	HashMap<ModelNode, ForkNode> modelNode2ForkNode;
	HashSet<ModelNode> FinalNodeSet;
	HashMap<ModelNode, FinalNode> modelNode2FinalNode;
	HashSet<ModelNode> ActivityFinalNodeSet;
	HashMap<ModelNode, ActivityFinalNode> modelNode2ActivityFinalNode;
	HashSet<ModelNode> ActivityEdgeSet;
	HashMap<ModelNode, ActivityEdge> modelNode2ActivityEdge;
	HashSet<ModelNode> ObjectFlowSet;
	HashMap<ModelNode, ObjectFlow> modelNode2ObjectFlow;
	HashSet<ModelNode> ControlFlowSet;
	HashMap<ModelNode, ControlFlow> modelNode2ControlFlow;
	HashSet<ModelNode> RootPackageSet;
	HashMap<ModelNode, RootPackage> modelNode2RootPackage;
	HashMap<ModelNode, LinkedList<ModelPattern>> PackagePackagedElementPackageableElementMap;
	HashMap<ModelNode, LinkedList<ModelPattern>> ActivityNodeActivityNodeMap;
	HashMap<ModelNode, LinkedList<ModelPattern>> ActivityEdgeActivityEdgeMap;
	HashMap<ModelNode, LinkedList<ModelPattern>> ActivityGroupActivityGroupMap;
	HashMap<ModelNode, LinkedList<ModelPattern>> ActivityPartitionNodeActivityNodeMap;
	HashMap<ModelNode, LinkedList<ModelPattern>> ActivityPartitionEdgeActivityEdgeMap;
	HashMap<ModelNode, LinkedList<ModelPattern>> TypedElementTypeTypeMap;
	HashMap<ModelNode, LinkedList<ModelPattern>> ActivityNodeOutgoingActivityEdgeMap;
	HashMap<ModelNode, LinkedList<ModelPattern>> ActivityNodeIncomingActivityEdgeMap;
	HashMap<ModelNode, LinkedList<ModelPattern>> ActivityEdgeSourceActivityNodeMap;
	HashMap<ModelNode, LinkedList<ModelPattern>> ActivityEdgeTargetActivityNodeMap;
	HashMap<ModelNode, LinkedList<ModelPattern>> ActivityEdgeGuardValueSpecificationMap;
	HashMap<ModelNode, LinkedList<ModelPattern>> RootPackagePackagedElementPackageableElementMap;
	
	public UmlOutputVisitor() {
	PackageSet = new HashSet<ModelNode>(10);
	modelNode2Package = new HashMap<ModelNode, Package>(10);
	ActivitySet = new HashSet<ModelNode>(10);
	modelNode2Activity = new HashMap<ModelNode, Activity>(10);
	ActivityPartitionSet = new HashSet<ModelNode>(10);
	modelNode2ActivityPartition = new HashMap<ModelNode, ActivityPartition>(10);
	ActivityGroupSet = new HashSet<ModelNode>(10);
	modelNode2ActivityGroup = new HashMap<ModelNode, ActivityGroup>(10);
	BehaviorSet = new HashSet<ModelNode>(10);
	modelNode2Behavior = new HashMap<ModelNode, Behavior>(10);
	EncapsulatedClassifierSet = new HashSet<ModelNode>(10);
	modelNode2EncapsulatedClassifier = new HashMap<ModelNode, EncapsulatedClassifier>(10);
	StructuredClassifierSet = new HashSet<ModelNode>(10);
	modelNode2StructuredClassifier = new HashMap<ModelNode, StructuredClassifier>(10);
	TypeSet = new HashSet<ModelNode>(10);
	modelNode2Type = new HashMap<ModelNode, Type>(10);
	TemplateableElementSet = new HashSet<ModelNode>(10);
	modelNode2TemplateableElement = new HashMap<ModelNode, TemplateableElement>(10);
	ClassifierSet = new HashSet<ModelNode>(10);
	modelNode2Classifier = new HashMap<ModelNode, Classifier>(10);
	NamespaceSet = new HashSet<ModelNode>(10);
	modelNode2Namespace = new HashMap<ModelNode, Namespace>(10);
	BehavioredClassifierSet = new HashSet<ModelNode>(10);
	modelNode2BehavioredClassifier = new HashMap<ModelNode, BehavioredClassifier>(10);
	ClassSet = new HashSet<ModelNode>(10);
	modelNode2Class = new HashMap<ModelNode, Class>(10);
	OpaqueExpressionSet = new HashSet<ModelNode>(10);
	modelNode2OpaqueExpression = new HashMap<ModelNode, OpaqueExpression>(10);
	ValueSpecificationSet = new HashSet<ModelNode>(10);
	modelNode2ValueSpecification = new HashMap<ModelNode, ValueSpecification>(10);
	TypedElementSet = new HashSet<ModelNode>(10);
	modelNode2TypedElement = new HashMap<ModelNode, TypedElement>(10);
	PackageableElementSet = new HashSet<ModelNode>(10);
	modelNode2PackageableElement = new HashMap<ModelNode, PackageableElement>(10);
	NamedElementSet = new HashSet<ModelNode>(10);
	modelNode2NamedElement = new HashMap<ModelNode, NamedElement>(10);
	ParameterableElementSet = new HashSet<ModelNode>(10);
	modelNode2ParameterableElement = new HashMap<ModelNode, ParameterableElement>(10);
	ElementSet = new HashSet<ModelNode>(10);
	modelNode2Element = new HashMap<ModelNode, Element>(10);
	OpaqueActionSet = new HashSet<ModelNode>(10);
	modelNode2OpaqueAction = new HashMap<ModelNode, OpaqueAction>(10);
	RedefinableElementSet = new HashSet<ModelNode>(10);
	modelNode2RedefinableElement = new HashMap<ModelNode, RedefinableElement>(10);
	ActivityNodeSet = new HashSet<ModelNode>(10);
	modelNode2ActivityNode = new HashMap<ModelNode, ActivityNode>(10);
	ExecutableNodeSet = new HashSet<ModelNode>(10);
	modelNode2ExecutableNode = new HashMap<ModelNode, ExecutableNode>(10);
	ControlNodeSet = new HashSet<ModelNode>(10);
	modelNode2ControlNode = new HashMap<ModelNode, ControlNode>(10);
	ActionSet = new HashSet<ModelNode>(10);
	modelNode2Action = new HashMap<ModelNode, Action>(10);
	ObjectNodeSet = new HashSet<ModelNode>(10);
	modelNode2ObjectNode = new HashMap<ModelNode, ObjectNode>(10);
	ActivityParameterNodeSet = new HashSet<ModelNode>(10);
	modelNode2ActivityParameterNode = new HashMap<ModelNode, ActivityParameterNode>(10);
	JoinNodeSet = new HashSet<ModelNode>(10);
	modelNode2JoinNode = new HashMap<ModelNode, JoinNode>(10);
	InitialNodeSet = new HashSet<ModelNode>(10);
	modelNode2InitialNode = new HashMap<ModelNode, InitialNode>(10);
	DecisionNodeSet = new HashSet<ModelNode>(10);
	modelNode2DecisionNode = new HashMap<ModelNode, DecisionNode>(10);
	ForkNodeSet = new HashSet<ModelNode>(10);
	modelNode2ForkNode = new HashMap<ModelNode, ForkNode>(10);
	FinalNodeSet = new HashSet<ModelNode>(10);
	modelNode2FinalNode = new HashMap<ModelNode, FinalNode>(10);
	ActivityFinalNodeSet = new HashSet<ModelNode>(10);
	modelNode2ActivityFinalNode = new HashMap<ModelNode, ActivityFinalNode>(10);
	ActivityEdgeSet = new HashSet<ModelNode>(10);
	modelNode2ActivityEdge = new HashMap<ModelNode, ActivityEdge>(10);
	ObjectFlowSet = new HashSet<ModelNode>(10);
	modelNode2ObjectFlow = new HashMap<ModelNode, ObjectFlow>(10);
	ControlFlowSet = new HashSet<ModelNode>(10);
	modelNode2ControlFlow = new HashMap<ModelNode, ControlFlow>(10);
	RootPackageSet = new HashSet<ModelNode>(10);
	modelNode2RootPackage = new HashMap<ModelNode, RootPackage>(10);
	PackagePackagedElementPackageableElementMap = new HashMap<ModelNode, LinkedList<ModelPattern>>(10);
	ActivityNodeActivityNodeMap = new HashMap<ModelNode, LinkedList<ModelPattern>>(10);
	ActivityEdgeActivityEdgeMap = new HashMap<ModelNode, LinkedList<ModelPattern>>(10);
	ActivityGroupActivityGroupMap = new HashMap<ModelNode, LinkedList<ModelPattern>>(10);
	ActivityPartitionNodeActivityNodeMap = new HashMap<ModelNode, LinkedList<ModelPattern>>(10);
	ActivityPartitionEdgeActivityEdgeMap = new HashMap<ModelNode, LinkedList<ModelPattern>>(10);
	TypedElementTypeTypeMap = new HashMap<ModelNode, LinkedList<ModelPattern>>(10);
	ActivityNodeOutgoingActivityEdgeMap = new HashMap<ModelNode, LinkedList<ModelPattern>>(10);
	ActivityNodeIncomingActivityEdgeMap = new HashMap<ModelNode, LinkedList<ModelPattern>>(10);
	ActivityEdgeSourceActivityNodeMap = new HashMap<ModelNode, LinkedList<ModelPattern>>(10);
	ActivityEdgeTargetActivityNodeMap = new HashMap<ModelNode, LinkedList<ModelPattern>>(10);
	ActivityEdgeGuardValueSpecificationMap = new HashMap<ModelNode, LinkedList<ModelPattern>>(10);
	RootPackagePackagedElementPackageableElementMap = new HashMap<ModelNode, LinkedList<ModelPattern>>(10);
	}
	
	public void store(RootPackage element, String path) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(URI.createURI(path));

		resource.getContents().add(element);

		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	public void notify(ModelPattern element){
		if (element.nodes.size() == 1 && element.edges.size() == 0) {
	{
		ModelNode node = element.nodes.get(0);
		if (
		node.types.contains("Package") ||
		false ) {
				node.types.add("ParameterableElement");
	ParameterableElementSet.add(node);
				node.types.add("PackageableElement");
	PackageableElementSet.add(node);
				node.types.add("Element");
	ElementSet.add(node);
				node.types.add("Namespace");
	NamespaceSet.add(node);
				node.types.add("TemplateableElement");
	TemplateableElementSet.add(node);
				node.types.add("NamedElement");
	NamedElementSet.add(node);
				node.types.add("Package");
	PackageSet.add(node);
		}
	}
	{
		ModelNode node = element.nodes.get(0);
		if (
		node.types.contains("Activity") ||
		false ) {
				node.types.add("Class");
	ClassSet.add(node);
				node.types.add("ParameterableElement");
	ParameterableElementSet.add(node);
				node.types.add("PackageableElement");
	PackageableElementSet.add(node);
				node.types.add("EncapsulatedClassifier");
	EncapsulatedClassifierSet.add(node);
				node.types.add("Element");
	ElementSet.add(node);
				node.types.add("Namespace");
	NamespaceSet.add(node);
				node.types.add("Type");
	TypeSet.add(node);
				node.types.add("Activity");
	ActivitySet.add(node);
				node.types.add("Classifier");
	ClassifierSet.add(node);
				node.types.add("StructuredClassifier");
	StructuredClassifierSet.add(node);
				node.types.add("Behavior");
	BehaviorSet.add(node);
				node.types.add("TemplateableElement");
	TemplateableElementSet.add(node);
				node.types.add("NamedElement");
	NamedElementSet.add(node);
				node.types.add("RedefinableElement");
	RedefinableElementSet.add(node);
				node.types.add("BehavioredClassifier");
	BehavioredClassifierSet.add(node);
		}
	}
	{
		ModelNode node = element.nodes.get(0);
		if (
		node.types.contains("ActivityPartition") ||
		false ) {
				node.types.add("ActivityGroup");
	ActivityGroupSet.add(node);
				node.types.add("Element");
	ElementSet.add(node);
				node.types.add("NamedElement");
	NamedElementSet.add(node);
				node.types.add("ActivityPartition");
	ActivityPartitionSet.add(node);
		}
	}
	{
		ModelNode node = element.nodes.get(0);
		if (
		node.types.contains("ActivityPartition") ||
		node.types.contains("ActivityGroup") ||
		false ) {
				node.types.add("ActivityGroup");
	ActivityGroupSet.add(node);
				node.types.add("Element");
	ElementSet.add(node);
		}
	}
	{
		ModelNode node = element.nodes.get(0);
		if (
		node.types.contains("Activity") ||
		node.types.contains("Behavior") ||
		false ) {
				node.types.add("Class");
	ClassSet.add(node);
				node.types.add("ParameterableElement");
	ParameterableElementSet.add(node);
				node.types.add("PackageableElement");
	PackageableElementSet.add(node);
				node.types.add("EncapsulatedClassifier");
	EncapsulatedClassifierSet.add(node);
				node.types.add("Element");
	ElementSet.add(node);
				node.types.add("Namespace");
	NamespaceSet.add(node);
				node.types.add("Type");
	TypeSet.add(node);
				node.types.add("Classifier");
	ClassifierSet.add(node);
				node.types.add("StructuredClassifier");
	StructuredClassifierSet.add(node);
				node.types.add("Behavior");
	BehaviorSet.add(node);
				node.types.add("TemplateableElement");
	TemplateableElementSet.add(node);
				node.types.add("NamedElement");
	NamedElementSet.add(node);
				node.types.add("RedefinableElement");
	RedefinableElementSet.add(node);
				node.types.add("BehavioredClassifier");
	BehavioredClassifierSet.add(node);
		}
	}
	{
		ModelNode node = element.nodes.get(0);
		if (
		node.types.contains("Activity") ||
		node.types.contains("Behavior") ||
		node.types.contains("EncapsulatedClassifier") ||
		node.types.contains("Class") ||
		false ) {
				node.types.add("Classifier");
	ClassifierSet.add(node);
				node.types.add("StructuredClassifier");
	StructuredClassifierSet.add(node);
				node.types.add("ParameterableElement");
	ParameterableElementSet.add(node);
				node.types.add("PackageableElement");
	PackageableElementSet.add(node);
				node.types.add("EncapsulatedClassifier");
	EncapsulatedClassifierSet.add(node);
				node.types.add("Element");
	ElementSet.add(node);
				node.types.add("Namespace");
	NamespaceSet.add(node);
				node.types.add("Type");
	TypeSet.add(node);
				node.types.add("TemplateableElement");
	TemplateableElementSet.add(node);
				node.types.add("NamedElement");
	NamedElementSet.add(node);
				node.types.add("RedefinableElement");
	RedefinableElementSet.add(node);
		}
	}
	{
		ModelNode node = element.nodes.get(0);
		if (
		node.types.contains("Activity") ||
		node.types.contains("Behavior") ||
		node.types.contains("EncapsulatedClassifier") ||
		node.types.contains("StructuredClassifier") ||
		node.types.contains("Class") ||
		false ) {
				node.types.add("Classifier");
	ClassifierSet.add(node);
				node.types.add("StructuredClassifier");
	StructuredClassifierSet.add(node);
				node.types.add("ParameterableElement");
	ParameterableElementSet.add(node);
				node.types.add("PackageableElement");
	PackageableElementSet.add(node);
				node.types.add("Element");
	ElementSet.add(node);
				node.types.add("Namespace");
	NamespaceSet.add(node);
				node.types.add("Type");
	TypeSet.add(node);
				node.types.add("TemplateableElement");
	TemplateableElementSet.add(node);
				node.types.add("NamedElement");
	NamedElementSet.add(node);
				node.types.add("RedefinableElement");
	RedefinableElementSet.add(node);
		}
	}
	{
		ModelNode node = element.nodes.get(0);
		if (
		node.types.contains("Activity") ||
		node.types.contains("Behavior") ||
		node.types.contains("EncapsulatedClassifier") ||
		node.types.contains("StructuredClassifier") ||
		node.types.contains("Type") ||
		node.types.contains("Classifier") ||
		node.types.contains("BehavioredClassifier") ||
		node.types.contains("Class") ||
		false ) {
				node.types.add("ParameterableElement");
	ParameterableElementSet.add(node);
				node.types.add("PackageableElement");
	PackageableElementSet.add(node);
				node.types.add("Element");
	ElementSet.add(node);
				node.types.add("Type");
	TypeSet.add(node);
				node.types.add("NamedElement");
	NamedElementSet.add(node);
		}
	}
	{
		ModelNode node = element.nodes.get(0);
		if (
		node.types.contains("Package") ||
		node.types.contains("Activity") ||
		node.types.contains("Behavior") ||
		node.types.contains("EncapsulatedClassifier") ||
		node.types.contains("StructuredClassifier") ||
		node.types.contains("TemplateableElement") ||
		node.types.contains("Classifier") ||
		node.types.contains("BehavioredClassifier") ||
		node.types.contains("Class") ||
		false ) {
				node.types.add("Element");
	ElementSet.add(node);
				node.types.add("TemplateableElement");
	TemplateableElementSet.add(node);
		}
	}
	{
		ModelNode node = element.nodes.get(0);
		if (
		node.types.contains("Activity") ||
		node.types.contains("Behavior") ||
		node.types.contains("EncapsulatedClassifier") ||
		node.types.contains("StructuredClassifier") ||
		node.types.contains("Classifier") ||
		node.types.contains("BehavioredClassifier") ||
		node.types.contains("Class") ||
		false ) {
				node.types.add("Classifier");
	ClassifierSet.add(node);
				node.types.add("ParameterableElement");
	ParameterableElementSet.add(node);
				node.types.add("PackageableElement");
	PackageableElementSet.add(node);
				node.types.add("Element");
	ElementSet.add(node);
				node.types.add("Namespace");
	NamespaceSet.add(node);
				node.types.add("Type");
	TypeSet.add(node);
				node.types.add("TemplateableElement");
	TemplateableElementSet.add(node);
				node.types.add("NamedElement");
	NamedElementSet.add(node);
				node.types.add("RedefinableElement");
	RedefinableElementSet.add(node);
		}
	}
	{
		ModelNode node = element.nodes.get(0);
		if (
		node.types.contains("Package") ||
		node.types.contains("Activity") ||
		node.types.contains("Behavior") ||
		node.types.contains("EncapsulatedClassifier") ||
		node.types.contains("StructuredClassifier") ||
		node.types.contains("Classifier") ||
		node.types.contains("Namespace") ||
		node.types.contains("BehavioredClassifier") ||
		node.types.contains("Class") ||
		false ) {
				node.types.add("Element");
	ElementSet.add(node);
				node.types.add("Namespace");
	NamespaceSet.add(node);
				node.types.add("NamedElement");
	NamedElementSet.add(node);
		}
	}
	{
		ModelNode node = element.nodes.get(0);
		if (
		node.types.contains("Activity") ||
		node.types.contains("Behavior") ||
		node.types.contains("BehavioredClassifier") ||
		node.types.contains("Class") ||
		false ) {
				node.types.add("Classifier");
	ClassifierSet.add(node);
				node.types.add("ParameterableElement");
	ParameterableElementSet.add(node);
				node.types.add("PackageableElement");
	PackageableElementSet.add(node);
				node.types.add("Element");
	ElementSet.add(node);
				node.types.add("Namespace");
	NamespaceSet.add(node);
				node.types.add("Type");
	TypeSet.add(node);
				node.types.add("TemplateableElement");
	TemplateableElementSet.add(node);
				node.types.add("NamedElement");
	NamedElementSet.add(node);
				node.types.add("RedefinableElement");
	RedefinableElementSet.add(node);
				node.types.add("BehavioredClassifier");
	BehavioredClassifierSet.add(node);
		}
	}
	{
		ModelNode node = element.nodes.get(0);
		if (
		node.types.contains("Activity") ||
		node.types.contains("Behavior") ||
		node.types.contains("Class") ||
		false ) {
				node.types.add("Class");
	ClassSet.add(node);
				node.types.add("ParameterableElement");
	ParameterableElementSet.add(node);
				node.types.add("PackageableElement");
	PackageableElementSet.add(node);
				node.types.add("EncapsulatedClassifier");
	EncapsulatedClassifierSet.add(node);
				node.types.add("Element");
	ElementSet.add(node);
				node.types.add("Namespace");
	NamespaceSet.add(node);
				node.types.add("Type");
	TypeSet.add(node);
				node.types.add("Classifier");
	ClassifierSet.add(node);
				node.types.add("StructuredClassifier");
	StructuredClassifierSet.add(node);
				node.types.add("TemplateableElement");
	TemplateableElementSet.add(node);
				node.types.add("NamedElement");
	NamedElementSet.add(node);
				node.types.add("RedefinableElement");
	RedefinableElementSet.add(node);
				node.types.add("BehavioredClassifier");
	BehavioredClassifierSet.add(node);
		}
	}
	{
		ModelNode node = element.nodes.get(0);
		if (
		node.types.contains("OpaqueExpression") ||
		false ) {
				node.types.add("ValueSpecification");
	ValueSpecificationSet.add(node);
				node.types.add("ParameterableElement");
	ParameterableElementSet.add(node);
				node.types.add("PackageableElement");
	PackageableElementSet.add(node);
				node.types.add("Element");
	ElementSet.add(node);
				node.types.add("OpaqueExpression");
	OpaqueExpressionSet.add(node);
				node.types.add("NamedElement");
	NamedElementSet.add(node);
				node.types.add("TypedElement");
	TypedElementSet.add(node);
		}
	}
	{
		ModelNode node = element.nodes.get(0);
		if (
		node.types.contains("OpaqueExpression") ||
		node.types.contains("ValueSpecification") ||
		false ) {
				node.types.add("ValueSpecification");
	ValueSpecificationSet.add(node);
				node.types.add("ParameterableElement");
	ParameterableElementSet.add(node);
				node.types.add("PackageableElement");
	PackageableElementSet.add(node);
				node.types.add("Element");
	ElementSet.add(node);
				node.types.add("NamedElement");
	NamedElementSet.add(node);
				node.types.add("TypedElement");
	TypedElementSet.add(node);
		}
	}
	{
		ModelNode node = element.nodes.get(0);
		if (
		node.types.contains("OpaqueExpression") ||
		node.types.contains("ValueSpecification") ||
		node.types.contains("TypedElement") ||
		node.types.contains("ObjectNode") ||
		node.types.contains("ActivityParameterNode") ||
		false ) {
				node.types.add("Element");
	ElementSet.add(node);
				node.types.add("NamedElement");
	NamedElementSet.add(node);
				node.types.add("TypedElement");
	TypedElementSet.add(node);
		}
	}
	{
		ModelNode node = element.nodes.get(0);
		if (
		node.types.contains("Package") ||
		node.types.contains("Activity") ||
		node.types.contains("Behavior") ||
		node.types.contains("EncapsulatedClassifier") ||
		node.types.contains("StructuredClassifier") ||
		node.types.contains("Type") ||
		node.types.contains("Classifier") ||
		node.types.contains("BehavioredClassifier") ||
		node.types.contains("Class") ||
		node.types.contains("OpaqueExpression") ||
		node.types.contains("ValueSpecification") ||
		node.types.contains("PackageableElement") ||
		false ) {
				node.types.add("ParameterableElement");
	ParameterableElementSet.add(node);
				node.types.add("PackageableElement");
	PackageableElementSet.add(node);
				node.types.add("Element");
	ElementSet.add(node);
				node.types.add("NamedElement");
	NamedElementSet.add(node);
		}
	}
	{
		ModelNode node = element.nodes.get(0);
		if (
		node.types.contains("Package") ||
		node.types.contains("Activity") ||
		node.types.contains("ActivityPartition") ||
		node.types.contains("Behavior") ||
		node.types.contains("EncapsulatedClassifier") ||
		node.types.contains("StructuredClassifier") ||
		node.types.contains("Type") ||
		node.types.contains("Classifier") ||
		node.types.contains("Namespace") ||
		node.types.contains("BehavioredClassifier") ||
		node.types.contains("Class") ||
		node.types.contains("OpaqueExpression") ||
		node.types.contains("ValueSpecification") ||
		node.types.contains("TypedElement") ||
		node.types.contains("PackageableElement") ||
		node.types.contains("NamedElement") ||
		node.types.contains("OpaqueAction") ||
		node.types.contains("RedefinableElement") ||
		node.types.contains("ActivityNode") ||
		node.types.contains("ExecutableNode") ||
		node.types.contains("ControlNode") ||
		node.types.contains("Action") ||
		node.types.contains("ObjectNode") ||
		node.types.contains("ActivityParameterNode") ||
		node.types.contains("JoinNode") ||
		node.types.contains("InitialNode") ||
		node.types.contains("DecisionNode") ||
		node.types.contains("ForkNode") ||
		node.types.contains("FinalNode") ||
		node.types.contains("ActivityFinalNode") ||
		node.types.contains("ActivityEdge") ||
		node.types.contains("ObjectFlow") ||
		node.types.contains("ControlFlow") ||
		false ) {
				node.types.add("Element");
	ElementSet.add(node);
				node.types.add("NamedElement");
	NamedElementSet.add(node);
		}
	}
	{
		ModelNode node = element.nodes.get(0);
		if (
		node.types.contains("Package") ||
		node.types.contains("Activity") ||
		node.types.contains("Behavior") ||
		node.types.contains("EncapsulatedClassifier") ||
		node.types.contains("StructuredClassifier") ||
		node.types.contains("Type") ||
		node.types.contains("Classifier") ||
		node.types.contains("BehavioredClassifier") ||
		node.types.contains("Class") ||
		node.types.contains("OpaqueExpression") ||
		node.types.contains("ValueSpecification") ||
		node.types.contains("PackageableElement") ||
		node.types.contains("ParameterableElement") ||
		false ) {
				node.types.add("ParameterableElement");
	ParameterableElementSet.add(node);
				node.types.add("Element");
	ElementSet.add(node);
		}
	}
	{
		ModelNode node = element.nodes.get(0);
		if (
		node.types.contains("Package") ||
		node.types.contains("Activity") ||
		node.types.contains("ActivityPartition") ||
		node.types.contains("ActivityGroup") ||
		node.types.contains("Behavior") ||
		node.types.contains("EncapsulatedClassifier") ||
		node.types.contains("StructuredClassifier") ||
		node.types.contains("Type") ||
		node.types.contains("TemplateableElement") ||
		node.types.contains("Classifier") ||
		node.types.contains("Namespace") ||
		node.types.contains("BehavioredClassifier") ||
		node.types.contains("Class") ||
		node.types.contains("OpaqueExpression") ||
		node.types.contains("ValueSpecification") ||
		node.types.contains("TypedElement") ||
		node.types.contains("PackageableElement") ||
		node.types.contains("NamedElement") ||
		node.types.contains("ParameterableElement") ||
		node.types.contains("Element") ||
		node.types.contains("OpaqueAction") ||
		node.types.contains("RedefinableElement") ||
		node.types.contains("ActivityNode") ||
		node.types.contains("ExecutableNode") ||
		node.types.contains("ControlNode") ||
		node.types.contains("Action") ||
		node.types.contains("ObjectNode") ||
		node.types.contains("ActivityParameterNode") ||
		node.types.contains("JoinNode") ||
		node.types.contains("InitialNode") ||
		node.types.contains("DecisionNode") ||
		node.types.contains("ForkNode") ||
		node.types.contains("FinalNode") ||
		node.types.contains("ActivityFinalNode") ||
		node.types.contains("ActivityEdge") ||
		node.types.contains("ObjectFlow") ||
		node.types.contains("ControlFlow") ||
		false ) {
				node.types.add("Element");
	ElementSet.add(node);
		}
	}
	{
		ModelNode node = element.nodes.get(0);
		if (
		node.types.contains("OpaqueAction") ||
		false ) {
				node.types.add("Action");
	ActionSet.add(node);
				node.types.add("ExecutableNode");
	ExecutableNodeSet.add(node);
				node.types.add("Element");
	ElementSet.add(node);
				node.types.add("OpaqueAction");
	OpaqueActionSet.add(node);
				node.types.add("NamedElement");
	NamedElementSet.add(node);
				node.types.add("RedefinableElement");
	RedefinableElementSet.add(node);
				node.types.add("ActivityNode");
	ActivityNodeSet.add(node);
		}
	}
	{
		ModelNode node = element.nodes.get(0);
		if (
		node.types.contains("Activity") ||
		node.types.contains("Behavior") ||
		node.types.contains("EncapsulatedClassifier") ||
		node.types.contains("StructuredClassifier") ||
		node.types.contains("Classifier") ||
		node.types.contains("BehavioredClassifier") ||
		node.types.contains("Class") ||
		node.types.contains("OpaqueAction") ||
		node.types.contains("RedefinableElement") ||
		node.types.contains("ActivityNode") ||
		node.types.contains("ExecutableNode") ||
		node.types.contains("ControlNode") ||
		node.types.contains("Action") ||
		node.types.contains("ObjectNode") ||
		node.types.contains("ActivityParameterNode") ||
		node.types.contains("JoinNode") ||
		node.types.contains("InitialNode") ||
		node.types.contains("DecisionNode") ||
		node.types.contains("ForkNode") ||
		node.types.contains("FinalNode") ||
		node.types.contains("ActivityFinalNode") ||
		node.types.contains("ActivityEdge") ||
		node.types.contains("ObjectFlow") ||
		node.types.contains("ControlFlow") ||
		false ) {
				node.types.add("Element");
	ElementSet.add(node);
				node.types.add("NamedElement");
	NamedElementSet.add(node);
				node.types.add("RedefinableElement");
	RedefinableElementSet.add(node);
		}
	}
	{
		ModelNode node = element.nodes.get(0);
		if (
		node.types.contains("OpaqueAction") ||
		node.types.contains("ActivityNode") ||
		node.types.contains("ExecutableNode") ||
		node.types.contains("ControlNode") ||
		node.types.contains("Action") ||
		node.types.contains("ObjectNode") ||
		node.types.contains("ActivityParameterNode") ||
		node.types.contains("JoinNode") ||
		node.types.contains("InitialNode") ||
		node.types.contains("DecisionNode") ||
		node.types.contains("ForkNode") ||
		node.types.contains("FinalNode") ||
		node.types.contains("ActivityFinalNode") ||
		false ) {
				node.types.add("Element");
	ElementSet.add(node);
				node.types.add("NamedElement");
	NamedElementSet.add(node);
				node.types.add("RedefinableElement");
	RedefinableElementSet.add(node);
				node.types.add("ActivityNode");
	ActivityNodeSet.add(node);
		}
	}
	{
		ModelNode node = element.nodes.get(0);
		if (
		node.types.contains("OpaqueAction") ||
		node.types.contains("ExecutableNode") ||
		node.types.contains("Action") ||
		false ) {
				node.types.add("ExecutableNode");
	ExecutableNodeSet.add(node);
				node.types.add("Element");
	ElementSet.add(node);
				node.types.add("NamedElement");
	NamedElementSet.add(node);
				node.types.add("RedefinableElement");
	RedefinableElementSet.add(node);
				node.types.add("ActivityNode");
	ActivityNodeSet.add(node);
		}
	}
	{
		ModelNode node = element.nodes.get(0);
		if (
		node.types.contains("ControlNode") ||
		node.types.contains("JoinNode") ||
		node.types.contains("InitialNode") ||
		node.types.contains("DecisionNode") ||
		node.types.contains("ForkNode") ||
		node.types.contains("FinalNode") ||
		node.types.contains("ActivityFinalNode") ||
		false ) {
				node.types.add("ControlNode");
	ControlNodeSet.add(node);
				node.types.add("Element");
	ElementSet.add(node);
				node.types.add("NamedElement");
	NamedElementSet.add(node);
				node.types.add("RedefinableElement");
	RedefinableElementSet.add(node);
				node.types.add("ActivityNode");
	ActivityNodeSet.add(node);
		}
	}
	{
		ModelNode node = element.nodes.get(0);
		if (
		node.types.contains("OpaqueAction") ||
		node.types.contains("Action") ||
		false ) {
				node.types.add("Action");
	ActionSet.add(node);
				node.types.add("ExecutableNode");
	ExecutableNodeSet.add(node);
				node.types.add("Element");
	ElementSet.add(node);
				node.types.add("NamedElement");
	NamedElementSet.add(node);
				node.types.add("RedefinableElement");
	RedefinableElementSet.add(node);
				node.types.add("ActivityNode");
	ActivityNodeSet.add(node);
		}
	}
	{
		ModelNode node = element.nodes.get(0);
		if (
		node.types.contains("ObjectNode") ||
		node.types.contains("ActivityParameterNode") ||
		false ) {
				node.types.add("ObjectNode");
	ObjectNodeSet.add(node);
				node.types.add("Element");
	ElementSet.add(node);
				node.types.add("NamedElement");
	NamedElementSet.add(node);
				node.types.add("RedefinableElement");
	RedefinableElementSet.add(node);
				node.types.add("ActivityNode");
	ActivityNodeSet.add(node);
				node.types.add("TypedElement");
	TypedElementSet.add(node);
		}
	}
	{
		ModelNode node = element.nodes.get(0);
		if (
		node.types.contains("ActivityParameterNode") ||
		false ) {
				node.types.add("ObjectNode");
	ObjectNodeSet.add(node);
				node.types.add("Element");
	ElementSet.add(node);
				node.types.add("ActivityParameterNode");
	ActivityParameterNodeSet.add(node);
				node.types.add("NamedElement");
	NamedElementSet.add(node);
				node.types.add("RedefinableElement");
	RedefinableElementSet.add(node);
				node.types.add("ActivityNode");
	ActivityNodeSet.add(node);
				node.types.add("TypedElement");
	TypedElementSet.add(node);
		}
	}
	{
		ModelNode node = element.nodes.get(0);
		if (
		node.types.contains("JoinNode") ||
		false ) {
				node.types.add("ControlNode");
	ControlNodeSet.add(node);
				node.types.add("JoinNode");
	JoinNodeSet.add(node);
				node.types.add("Element");
	ElementSet.add(node);
				node.types.add("NamedElement");
	NamedElementSet.add(node);
				node.types.add("RedefinableElement");
	RedefinableElementSet.add(node);
				node.types.add("ActivityNode");
	ActivityNodeSet.add(node);
		}
	}
	{
		ModelNode node = element.nodes.get(0);
		if (
		node.types.contains("InitialNode") ||
		false ) {
				node.types.add("ControlNode");
	ControlNodeSet.add(node);
				node.types.add("Element");
	ElementSet.add(node);
				node.types.add("NamedElement");
	NamedElementSet.add(node);
				node.types.add("RedefinableElement");
	RedefinableElementSet.add(node);
				node.types.add("ActivityNode");
	ActivityNodeSet.add(node);
				node.types.add("InitialNode");
	InitialNodeSet.add(node);
		}
	}
	{
		ModelNode node = element.nodes.get(0);
		if (
		node.types.contains("DecisionNode") ||
		false ) {
				node.types.add("ControlNode");
	ControlNodeSet.add(node);
				node.types.add("DecisionNode");
	DecisionNodeSet.add(node);
				node.types.add("Element");
	ElementSet.add(node);
				node.types.add("NamedElement");
	NamedElementSet.add(node);
				node.types.add("RedefinableElement");
	RedefinableElementSet.add(node);
				node.types.add("ActivityNode");
	ActivityNodeSet.add(node);
		}
	}
	{
		ModelNode node = element.nodes.get(0);
		if (
		node.types.contains("ForkNode") ||
		false ) {
				node.types.add("ControlNode");
	ControlNodeSet.add(node);
				node.types.add("Element");
	ElementSet.add(node);
				node.types.add("ForkNode");
	ForkNodeSet.add(node);
				node.types.add("NamedElement");
	NamedElementSet.add(node);
				node.types.add("RedefinableElement");
	RedefinableElementSet.add(node);
				node.types.add("ActivityNode");
	ActivityNodeSet.add(node);
		}
	}
	{
		ModelNode node = element.nodes.get(0);
		if (
		node.types.contains("FinalNode") ||
		node.types.contains("ActivityFinalNode") ||
		false ) {
				node.types.add("ControlNode");
	ControlNodeSet.add(node);
				node.types.add("FinalNode");
	FinalNodeSet.add(node);
				node.types.add("Element");
	ElementSet.add(node);
				node.types.add("NamedElement");
	NamedElementSet.add(node);
				node.types.add("RedefinableElement");
	RedefinableElementSet.add(node);
				node.types.add("ActivityNode");
	ActivityNodeSet.add(node);
		}
	}
	{
		ModelNode node = element.nodes.get(0);
		if (
		node.types.contains("ActivityFinalNode") ||
		false ) {
				node.types.add("ActivityFinalNode");
	ActivityFinalNodeSet.add(node);
				node.types.add("ControlNode");
	ControlNodeSet.add(node);
				node.types.add("FinalNode");
	FinalNodeSet.add(node);
				node.types.add("Element");
	ElementSet.add(node);
				node.types.add("NamedElement");
	NamedElementSet.add(node);
				node.types.add("RedefinableElement");
	RedefinableElementSet.add(node);
				node.types.add("ActivityNode");
	ActivityNodeSet.add(node);
		}
	}
	{
		ModelNode node = element.nodes.get(0);
		if (
		node.types.contains("ActivityEdge") ||
		node.types.contains("ObjectFlow") ||
		node.types.contains("ControlFlow") ||
		false ) {
				node.types.add("ActivityEdge");
	ActivityEdgeSet.add(node);
				node.types.add("Element");
	ElementSet.add(node);
				node.types.add("NamedElement");
	NamedElementSet.add(node);
				node.types.add("RedefinableElement");
	RedefinableElementSet.add(node);
		}
	}
	{
		ModelNode node = element.nodes.get(0);
		if (
		node.types.contains("ObjectFlow") ||
		false ) {
				node.types.add("ActivityEdge");
	ActivityEdgeSet.add(node);
				node.types.add("Element");
	ElementSet.add(node);
				node.types.add("ObjectFlow");
	ObjectFlowSet.add(node);
				node.types.add("NamedElement");
	NamedElementSet.add(node);
				node.types.add("RedefinableElement");
	RedefinableElementSet.add(node);
		}
	}
	{
		ModelNode node = element.nodes.get(0);
		if (
		node.types.contains("ControlFlow") ||
		false ) {
				node.types.add("ActivityEdge");
	ActivityEdgeSet.add(node);
				node.types.add("Element");
	ElementSet.add(node);
				node.types.add("ControlFlow");
	ControlFlowSet.add(node);
				node.types.add("NamedElement");
	NamedElementSet.add(node);
				node.types.add("RedefinableElement");
	RedefinableElementSet.add(node);
		}
	}
	{
		ModelNode node = element.nodes.get(0);
		if (
		node.types.contains("RootPackage") ||
		false ) {
				node.types.add("RootPackage");
	RootPackageSet.add(node);
		}
	}
		} else if (element.nodes.size() == 2 && element.edges.size()==1) {
	{
		ModelEdge edge = element.edges.get(0);
		if (
			(			edge.source.types.contains("Package") ||
 false)
			&& edge.name.equals("packagedElement") &&
			( false 			|| edge.target.types.contains("Package")
			|| edge.target.types.contains("Activity")
			|| edge.target.types.contains("Behavior")
			|| edge.target.types.contains("EncapsulatedClassifier")
			|| edge.target.types.contains("StructuredClassifier")
			|| edge.target.types.contains("Type")
			|| edge.target.types.contains("Classifier")
			|| edge.target.types.contains("BehavioredClassifier")
			|| edge.target.types.contains("Class")
			|| edge.target.types.contains("OpaqueExpression")
			|| edge.target.types.contains("ValueSpecification")
			|| edge.target.types.contains("PackageableElement")
)
		    ) {
	if (!PackagePackagedElementPackageableElementMap.containsKey(edge.source)) {
		PackagePackagedElementPackageableElementMap.put(edge.source, new LinkedList<ModelPattern>());
	}
	PackagePackagedElementPackageableElementMap.get(edge.source).add(element);
		}
	}
	{
		ModelEdge edge = element.edges.get(0);
		if (
			(			edge.source.types.contains("Activity") ||
 false)
			&& edge.name.equals("node") &&
			( false 			|| edge.target.types.contains("OpaqueAction")
			|| edge.target.types.contains("ActivityNode")
			|| edge.target.types.contains("ExecutableNode")
			|| edge.target.types.contains("ControlNode")
			|| edge.target.types.contains("Action")
			|| edge.target.types.contains("ObjectNode")
			|| edge.target.types.contains("ActivityParameterNode")
			|| edge.target.types.contains("JoinNode")
			|| edge.target.types.contains("InitialNode")
			|| edge.target.types.contains("DecisionNode")
			|| edge.target.types.contains("ForkNode")
			|| edge.target.types.contains("FinalNode")
			|| edge.target.types.contains("ActivityFinalNode")
)
		    ) {
	if (!ActivityNodeActivityNodeMap.containsKey(edge.source)) {
		ActivityNodeActivityNodeMap.put(edge.source, new LinkedList<ModelPattern>());
	}
	ActivityNodeActivityNodeMap.get(edge.source).add(element);
		}
	}
	{
		ModelEdge edge = element.edges.get(0);
		if (
			(			edge.source.types.contains("Activity") ||
 false)
			&& edge.name.equals("edge") &&
			( false 			|| edge.target.types.contains("ActivityEdge")
			|| edge.target.types.contains("ObjectFlow")
			|| edge.target.types.contains("ControlFlow")
)
		    ) {
	if (!ActivityEdgeActivityEdgeMap.containsKey(edge.source)) {
		ActivityEdgeActivityEdgeMap.put(edge.source, new LinkedList<ModelPattern>());
	}
	ActivityEdgeActivityEdgeMap.get(edge.source).add(element);
		}
	}
	{
		ModelEdge edge = element.edges.get(0);
		if (
			(			edge.source.types.contains("Activity") ||
 false)
			&& edge.name.equals("group") &&
			( false 			|| edge.target.types.contains("ActivityPartition")
			|| edge.target.types.contains("ActivityGroup")
)
		    ) {
	if (!ActivityGroupActivityGroupMap.containsKey(edge.source)) {
		ActivityGroupActivityGroupMap.put(edge.source, new LinkedList<ModelPattern>());
	}
	ActivityGroupActivityGroupMap.get(edge.source).add(element);
		}
	}
	{
		ModelEdge edge = element.edges.get(0);
		if (
			(			edge.source.types.contains("ActivityPartition") ||
 false)
			&& edge.name.equals("node") &&
			( false 			|| edge.target.types.contains("OpaqueAction")
			|| edge.target.types.contains("ActivityNode")
			|| edge.target.types.contains("ExecutableNode")
			|| edge.target.types.contains("ControlNode")
			|| edge.target.types.contains("Action")
			|| edge.target.types.contains("ObjectNode")
			|| edge.target.types.contains("ActivityParameterNode")
			|| edge.target.types.contains("JoinNode")
			|| edge.target.types.contains("InitialNode")
			|| edge.target.types.contains("DecisionNode")
			|| edge.target.types.contains("ForkNode")
			|| edge.target.types.contains("FinalNode")
			|| edge.target.types.contains("ActivityFinalNode")
)
		    ) {
	if (!ActivityPartitionNodeActivityNodeMap.containsKey(edge.source)) {
		ActivityPartitionNodeActivityNodeMap.put(edge.source, new LinkedList<ModelPattern>());
	}
	ActivityPartitionNodeActivityNodeMap.get(edge.source).add(element);
		}
	}
	{
		ModelEdge edge = element.edges.get(0);
		if (
			(			edge.source.types.contains("ActivityPartition") ||
 false)
			&& edge.name.equals("edge") &&
			( false 			|| edge.target.types.contains("ActivityEdge")
			|| edge.target.types.contains("ObjectFlow")
			|| edge.target.types.contains("ControlFlow")
)
		    ) {
	if (!ActivityPartitionEdgeActivityEdgeMap.containsKey(edge.source)) {
		ActivityPartitionEdgeActivityEdgeMap.put(edge.source, new LinkedList<ModelPattern>());
	}
	ActivityPartitionEdgeActivityEdgeMap.get(edge.source).add(element);
		}
	}
	{
		ModelEdge edge = element.edges.get(0);
		if (
			(			edge.source.types.contains("OpaqueExpression") ||
			edge.source.types.contains("ValueSpecification") ||
			edge.source.types.contains("TypedElement") ||
			edge.source.types.contains("ObjectNode") ||
			edge.source.types.contains("ActivityParameterNode") ||
 false)
			&& edge.name.equals("type") &&
			( false 			|| edge.target.types.contains("Activity")
			|| edge.target.types.contains("Behavior")
			|| edge.target.types.contains("EncapsulatedClassifier")
			|| edge.target.types.contains("StructuredClassifier")
			|| edge.target.types.contains("Type")
			|| edge.target.types.contains("Classifier")
			|| edge.target.types.contains("BehavioredClassifier")
			|| edge.target.types.contains("Class")
)
		    ) {
	if (!TypedElementTypeTypeMap.containsKey(edge.source)) {
		TypedElementTypeTypeMap.put(edge.source, new LinkedList<ModelPattern>());
	}
	TypedElementTypeTypeMap.get(edge.source).add(element);
		}
	}
	{
		ModelEdge edge = element.edges.get(0);
		if (
			(			edge.source.types.contains("OpaqueAction") ||
			edge.source.types.contains("ActivityNode") ||
			edge.source.types.contains("ExecutableNode") ||
			edge.source.types.contains("ControlNode") ||
			edge.source.types.contains("Action") ||
			edge.source.types.contains("ObjectNode") ||
			edge.source.types.contains("ActivityParameterNode") ||
			edge.source.types.contains("JoinNode") ||
			edge.source.types.contains("InitialNode") ||
			edge.source.types.contains("DecisionNode") ||
			edge.source.types.contains("ForkNode") ||
			edge.source.types.contains("FinalNode") ||
			edge.source.types.contains("ActivityFinalNode") ||
 false)
			&& edge.name.equals("outgoing") &&
			( false 			|| edge.target.types.contains("ActivityEdge")
			|| edge.target.types.contains("ObjectFlow")
			|| edge.target.types.contains("ControlFlow")
)
		    ) {
	if (!ActivityNodeOutgoingActivityEdgeMap.containsKey(edge.source)) {
		ActivityNodeOutgoingActivityEdgeMap.put(edge.source, new LinkedList<ModelPattern>());
	}
	ActivityNodeOutgoingActivityEdgeMap.get(edge.source).add(element);
		}
	}
	{
		ModelEdge edge = element.edges.get(0);
		if (
			(			edge.source.types.contains("OpaqueAction") ||
			edge.source.types.contains("ActivityNode") ||
			edge.source.types.contains("ExecutableNode") ||
			edge.source.types.contains("ControlNode") ||
			edge.source.types.contains("Action") ||
			edge.source.types.contains("ObjectNode") ||
			edge.source.types.contains("ActivityParameterNode") ||
			edge.source.types.contains("JoinNode") ||
			edge.source.types.contains("InitialNode") ||
			edge.source.types.contains("DecisionNode") ||
			edge.source.types.contains("ForkNode") ||
			edge.source.types.contains("FinalNode") ||
			edge.source.types.contains("ActivityFinalNode") ||
 false)
			&& edge.name.equals("incoming") &&
			( false 			|| edge.target.types.contains("ActivityEdge")
			|| edge.target.types.contains("ObjectFlow")
			|| edge.target.types.contains("ControlFlow")
)
		    ) {
	if (!ActivityNodeIncomingActivityEdgeMap.containsKey(edge.source)) {
		ActivityNodeIncomingActivityEdgeMap.put(edge.source, new LinkedList<ModelPattern>());
	}
	ActivityNodeIncomingActivityEdgeMap.get(edge.source).add(element);
		}
	}
	{
		ModelEdge edge = element.edges.get(0);
		if (
			(			edge.source.types.contains("ActivityEdge") ||
			edge.source.types.contains("ObjectFlow") ||
			edge.source.types.contains("ControlFlow") ||
 false)
			&& edge.name.equals("source") &&
			( false 			|| edge.target.types.contains("OpaqueAction")
			|| edge.target.types.contains("ActivityNode")
			|| edge.target.types.contains("ExecutableNode")
			|| edge.target.types.contains("ControlNode")
			|| edge.target.types.contains("Action")
			|| edge.target.types.contains("ObjectNode")
			|| edge.target.types.contains("ActivityParameterNode")
			|| edge.target.types.contains("JoinNode")
			|| edge.target.types.contains("InitialNode")
			|| edge.target.types.contains("DecisionNode")
			|| edge.target.types.contains("ForkNode")
			|| edge.target.types.contains("FinalNode")
			|| edge.target.types.contains("ActivityFinalNode")
)
		    ) {
	if (!ActivityEdgeSourceActivityNodeMap.containsKey(edge.source)) {
		ActivityEdgeSourceActivityNodeMap.put(edge.source, new LinkedList<ModelPattern>());
	}
	ActivityEdgeSourceActivityNodeMap.get(edge.source).add(element);
		}
	}
	{
		ModelEdge edge = element.edges.get(0);
		if (
			(			edge.source.types.contains("ActivityEdge") ||
			edge.source.types.contains("ObjectFlow") ||
			edge.source.types.contains("ControlFlow") ||
 false)
			&& edge.name.equals("target") &&
			( false 			|| edge.target.types.contains("OpaqueAction")
			|| edge.target.types.contains("ActivityNode")
			|| edge.target.types.contains("ExecutableNode")
			|| edge.target.types.contains("ControlNode")
			|| edge.target.types.contains("Action")
			|| edge.target.types.contains("ObjectNode")
			|| edge.target.types.contains("ActivityParameterNode")
			|| edge.target.types.contains("JoinNode")
			|| edge.target.types.contains("InitialNode")
			|| edge.target.types.contains("DecisionNode")
			|| edge.target.types.contains("ForkNode")
			|| edge.target.types.contains("FinalNode")
			|| edge.target.types.contains("ActivityFinalNode")
)
		    ) {
	if (!ActivityEdgeTargetActivityNodeMap.containsKey(edge.source)) {
		ActivityEdgeTargetActivityNodeMap.put(edge.source, new LinkedList<ModelPattern>());
	}
	ActivityEdgeTargetActivityNodeMap.get(edge.source).add(element);
		}
	}
	{
		ModelEdge edge = element.edges.get(0);
		if (
			(			edge.source.types.contains("ActivityEdge") ||
			edge.source.types.contains("ObjectFlow") ||
			edge.source.types.contains("ControlFlow") ||
 false)
			&& edge.name.equals("guard") &&
			( false 			|| edge.target.types.contains("OpaqueExpression")
			|| edge.target.types.contains("ValueSpecification")
)
		    ) {
	if (!ActivityEdgeGuardValueSpecificationMap.containsKey(edge.source)) {
		ActivityEdgeGuardValueSpecificationMap.put(edge.source, new LinkedList<ModelPattern>());
	}
	ActivityEdgeGuardValueSpecificationMap.get(edge.source).add(element);
		}
	}
	{
		ModelEdge edge = element.edges.get(0);
		if (
			(			edge.source.types.contains("RootPackage") ||
 false)
			&& edge.name.equals("packagedElement") &&
			( false 			|| edge.target.types.contains("Package")
			|| edge.target.types.contains("Activity")
			|| edge.target.types.contains("Behavior")
			|| edge.target.types.contains("EncapsulatedClassifier")
			|| edge.target.types.contains("StructuredClassifier")
			|| edge.target.types.contains("Type")
			|| edge.target.types.contains("Classifier")
			|| edge.target.types.contains("BehavioredClassifier")
			|| edge.target.types.contains("Class")
			|| edge.target.types.contains("OpaqueExpression")
			|| edge.target.types.contains("ValueSpecification")
			|| edge.target.types.contains("PackageableElement")
)
		    ) {
	if (!RootPackagePackagedElementPackageableElementMap.containsKey(edge.source)) {
		RootPackagePackagedElementPackageableElementMap.put(edge.source, new LinkedList<ModelPattern>());
	}
	RootPackagePackagedElementPackageableElementMap.get(edge.source).add(element);
		}
	}
		} else {
			throw new RuntimeException("Unexpected pattern found.");
		}
	}
	
	public RootPackage buildModel() {
		return buildRootPackage();
	}
	
	RootPackage buildRootPackage() {
		for (ModelNode node : RootPackageSet) {
			RootPackage result =  modelNode2RootPackage.get(node);
			
			if (result == null) {
				result = UmlFactory.eINSTANCE.createRootPackage();
				modelNode2RootPackage.put(node, result); // coloca ja o elemento no mapa por causa das futuras referencias com target neste elemento.
					createAssocRootPackagePackagedElement(result, node);
			}
			
			
			return result;
		}
		
		return null;
	}
	
	void createAssocPackagePackagedElement(Package modelElement, ModelNode node) {
		LinkedList<ModelPattern> patternAssocs = PackagePackagedElementPackageableElementMap.get(node);
		if (patternAssocs == null) {
			return;
		}
		for (ModelPattern patternAssoc : patternAssocs) {
			ModelNode targetNode = patternAssoc.edges.get(0).target;
	
	if (targetNode.types.contains("PackageableElement")) {
	
	if (targetNode.types.contains("Package")) {
	if (PackageSet.contains(targetNode)) { 
		
		Package targetElement = modelNode2Package.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createPackage();
				targetElement.setName(targetNode.attributes.get("name"));
			modelNode2Package.put(targetNode, targetElement);
		}
			createAssocPackagePackagedElement(targetElement, targetNode);
		
		modelElement.getPackagedElement().add(targetElement);
	}
	}
				else	
	
	if (targetNode.types.contains("Type")) {
	
	if (targetNode.types.contains("Classifier")) {
	
	if (targetNode.types.contains("StructuredClassifier")) {
	
	if (targetNode.types.contains("EncapsulatedClassifier")) {
	
	if (targetNode.types.contains("Class")) {
	
	if (targetNode.types.contains("Behavior")) {
	
	if (targetNode.types.contains("Activity")) {
	if (ActivitySet.contains(targetNode)) { 
		
		Activity targetElement = modelNode2Activity.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createActivity();
			targetElement.setIsActive(Boolean.parseBoolean(targetNode.attributes.get("isActive")));
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			targetElement.setIsAbstract(Boolean.parseBoolean(targetNode.attributes.get("isAbstract")));
			targetElement.setIsReentrant(Boolean.parseBoolean(targetNode.attributes.get("isReentrant")));
			modelNode2Activity.put(targetNode, targetElement);
		}
			createAssocActivityNode(targetElement, targetNode);
			createAssocActivityGroup(targetElement, targetNode);
			createAssocActivityEdge(targetElement, targetNode);
		
		modelElement.getPackagedElement().add(targetElement);
	}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
				else	
 {
	if (ClassSet.contains(targetNode)) { 
		
		Class targetElement = modelNode2Class.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createClass();
			targetElement.setIsActive(Boolean.parseBoolean(targetNode.attributes.get("isActive")));
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			targetElement.setIsAbstract(Boolean.parseBoolean(targetNode.attributes.get("isAbstract")));
			modelNode2Class.put(targetNode, targetElement);
		}
		
		modelElement.getPackagedElement().add(targetElement);
	}
			}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
				else	
	
	if (targetNode.types.contains("BehavioredClassifier")) {
	
	if (targetNode.types.contains("Class")) {
	
	if (targetNode.types.contains("Behavior")) {
	
	if (targetNode.types.contains("Activity")) {
	if (ActivitySet.contains(targetNode)) { 
		
		Activity targetElement = modelNode2Activity.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createActivity();
			targetElement.setIsActive(Boolean.parseBoolean(targetNode.attributes.get("isActive")));
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			targetElement.setIsAbstract(Boolean.parseBoolean(targetNode.attributes.get("isAbstract")));
			targetElement.setIsReentrant(Boolean.parseBoolean(targetNode.attributes.get("isReentrant")));
			modelNode2Activity.put(targetNode, targetElement);
		}
			createAssocActivityNode(targetElement, targetNode);
			createAssocActivityGroup(targetElement, targetNode);
			createAssocActivityEdge(targetElement, targetNode);
		
		modelElement.getPackagedElement().add(targetElement);
	}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
				else	
 {
	if (ClassSet.contains(targetNode)) { 
		
		Class targetElement = modelNode2Class.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createClass();
			targetElement.setIsActive(Boolean.parseBoolean(targetNode.attributes.get("isActive")));
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			targetElement.setIsAbstract(Boolean.parseBoolean(targetNode.attributes.get("isAbstract")));
			modelNode2Class.put(targetNode, targetElement);
		}
		
		modelElement.getPackagedElement().add(targetElement);
	}
			}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
				else	
	
	if (targetNode.types.contains("ValueSpecification")) {
	
	if (targetNode.types.contains("OpaqueExpression")) {
	if (OpaqueExpressionSet.contains(targetNode)) { 
		
		OpaqueExpression targetElement = modelNode2OpaqueExpression.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createOpaqueExpression();
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setBody(targetNode.attributes.get("body"));
			modelNode2OpaqueExpression.put(targetNode, targetElement);
		}
	createNonContainmentAssocTypedElementType(targetElement, targetNode);
		
		modelElement.getPackagedElement().add(targetElement);
	}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
		}
	}
	void createAssocActivityNode(Activity modelElement, ModelNode node) {
		LinkedList<ModelPattern> patternAssocs = ActivityNodeActivityNodeMap.get(node);
		if (patternAssocs == null) {
			return;
		}
		for (ModelPattern patternAssoc : patternAssocs) {
			ModelNode targetNode = patternAssoc.edges.get(0).target;
	
	if (targetNode.types.contains("ActivityNode")) {
	
	if (targetNode.types.contains("ExecutableNode")) {
	
	if (targetNode.types.contains("Action")) {
	
	if (targetNode.types.contains("OpaqueAction")) {
	if (OpaqueActionSet.contains(targetNode)) { 
		
		OpaqueAction targetElement = modelNode2OpaqueAction.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createOpaqueAction();
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			modelNode2OpaqueAction.put(targetNode, targetElement);
		}
	createNonContainmentAssocActivityNodeOutgoing(targetElement, targetNode);
	createNonContainmentAssocActivityNodeIncoming(targetElement, targetNode);
		
		modelElement.getNode().add(targetElement);
	}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
				else	
	
	if (targetNode.types.contains("ControlNode")) {
	
	if (targetNode.types.contains("JoinNode")) {
	if (JoinNodeSet.contains(targetNode)) { 
		
		JoinNode targetElement = modelNode2JoinNode.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createJoinNode();
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			targetElement.setIsCombineDuplicate(Boolean.parseBoolean(targetNode.attributes.get("isCombineDuplicate")));
			modelNode2JoinNode.put(targetNode, targetElement);
		}
	createNonContainmentAssocActivityNodeOutgoing(targetElement, targetNode);
	createNonContainmentAssocActivityNodeIncoming(targetElement, targetNode);
		
		modelElement.getNode().add(targetElement);
	}
	}
				else	
	
	if (targetNode.types.contains("InitialNode")) {
	if (InitialNodeSet.contains(targetNode)) { 
		
		InitialNode targetElement = modelNode2InitialNode.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createInitialNode();
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			modelNode2InitialNode.put(targetNode, targetElement);
		}
	createNonContainmentAssocActivityNodeOutgoing(targetElement, targetNode);
	createNonContainmentAssocActivityNodeIncoming(targetElement, targetNode);
		
		modelElement.getNode().add(targetElement);
	}
	}
				else	
	
	if (targetNode.types.contains("DecisionNode")) {
	if (DecisionNodeSet.contains(targetNode)) { 
		
		DecisionNode targetElement = modelNode2DecisionNode.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createDecisionNode();
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			modelNode2DecisionNode.put(targetNode, targetElement);
		}
	createNonContainmentAssocActivityNodeOutgoing(targetElement, targetNode);
	createNonContainmentAssocActivityNodeIncoming(targetElement, targetNode);
		
		modelElement.getNode().add(targetElement);
	}
	}
				else	
	
	if (targetNode.types.contains("ForkNode")) {
	if (ForkNodeSet.contains(targetNode)) { 
		
		ForkNode targetElement = modelNode2ForkNode.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createForkNode();
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			modelNode2ForkNode.put(targetNode, targetElement);
		}
	createNonContainmentAssocActivityNodeOutgoing(targetElement, targetNode);
	createNonContainmentAssocActivityNodeIncoming(targetElement, targetNode);
		
		modelElement.getNode().add(targetElement);
	}
	}
				else	
	
	if (targetNode.types.contains("FinalNode")) {
	
	if (targetNode.types.contains("ActivityFinalNode")) {
	if (ActivityFinalNodeSet.contains(targetNode)) { 
		
		ActivityFinalNode targetElement = modelNode2ActivityFinalNode.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createActivityFinalNode();
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			modelNode2ActivityFinalNode.put(targetNode, targetElement);
		}
	createNonContainmentAssocActivityNodeOutgoing(targetElement, targetNode);
	createNonContainmentAssocActivityNodeIncoming(targetElement, targetNode);
		
		modelElement.getNode().add(targetElement);
	}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
				else	
	
	if (targetNode.types.contains("ObjectNode")) {
	
	if (targetNode.types.contains("ActivityParameterNode")) {
	if (ActivityParameterNodeSet.contains(targetNode)) { 
		
		ActivityParameterNode targetElement = modelNode2ActivityParameterNode.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createActivityParameterNode();
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			targetElement.setIsControlType(Boolean.parseBoolean(targetNode.attributes.get("isControlType")));
			modelNode2ActivityParameterNode.put(targetNode, targetElement);
		}
	createNonContainmentAssocActivityNodeOutgoing(targetElement, targetNode);
	createNonContainmentAssocActivityNodeIncoming(targetElement, targetNode);
	createNonContainmentAssocTypedElementType(targetElement, targetNode);
		
		modelElement.getNode().add(targetElement);
	}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
		}
	}
	void createAssocActivityEdge(Activity modelElement, ModelNode node) {
		LinkedList<ModelPattern> patternAssocs = ActivityEdgeActivityEdgeMap.get(node);
		if (patternAssocs == null) {
			return;
		}
		for (ModelPattern patternAssoc : patternAssocs) {
			ModelNode targetNode = patternAssoc.edges.get(0).target;
	
	if (targetNode.types.contains("ActivityEdge")) {
	
	if (targetNode.types.contains("ObjectFlow")) {
	if (ObjectFlowSet.contains(targetNode)) { 
		
		ObjectFlow targetElement = modelNode2ObjectFlow.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createObjectFlow();
			targetElement.setIsMulticast(Boolean.parseBoolean(targetNode.attributes.get("isMulticast")));
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			targetElement.setIsMultireceive(Boolean.parseBoolean(targetNode.attributes.get("isMultireceive")));
			modelNode2ObjectFlow.put(targetNode, targetElement);
		}
	createNonContainmentAssocActivityEdgeSource(targetElement, targetNode);
	createNonContainmentAssocActivityEdgeTarget(targetElement, targetNode);
			createAssocActivityEdgeGuard(targetElement, targetNode);
		
		modelElement.getEdge().add(targetElement);
	}
	}
				else	
	
	if (targetNode.types.contains("ControlFlow")) {
	if (ControlFlowSet.contains(targetNode)) { 
		
		ControlFlow targetElement = modelNode2ControlFlow.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createControlFlow();
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			modelNode2ControlFlow.put(targetNode, targetElement);
		}
	createNonContainmentAssocActivityEdgeSource(targetElement, targetNode);
	createNonContainmentAssocActivityEdgeTarget(targetElement, targetNode);
			createAssocActivityEdgeGuard(targetElement, targetNode);
		
		modelElement.getEdge().add(targetElement);
	}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
		}
	}
	void createAssocActivityGroup(Activity modelElement, ModelNode node) {
		LinkedList<ModelPattern> patternAssocs = ActivityGroupActivityGroupMap.get(node);
		if (patternAssocs == null) {
			return;
		}
		for (ModelPattern patternAssoc : patternAssocs) {
			ModelNode targetNode = patternAssoc.edges.get(0).target;
	
	if (targetNode.types.contains("ActivityGroup")) {
	
	if (targetNode.types.contains("ActivityPartition")) {
	if (ActivityPartitionSet.contains(targetNode)) { 
		
		ActivityPartition targetElement = modelNode2ActivityPartition.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createActivityPartition();
				targetElement.setName(targetNode.attributes.get("name"));
			modelNode2ActivityPartition.put(targetNode, targetElement);
		}
	createNonContainmentAssocActivityPartitionNode(targetElement, targetNode);
	createNonContainmentAssocActivityPartitionEdge(targetElement, targetNode);
		
		modelElement.getGroup().add(targetElement);
	}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
		}
	}
	void createAssocActivityEdgeGuard(ActivityEdge modelElement, ModelNode node) {
		LinkedList<ModelPattern> patternAssocs = ActivityEdgeGuardValueSpecificationMap.get(node);
		if (patternAssocs == null) {
			return;
		}
		for (ModelPattern patternAssoc : patternAssocs) {
			ModelNode targetNode = patternAssoc.edges.get(0).target;
	
	if (targetNode.types.contains("ValueSpecification")) {
	
	if (targetNode.types.contains("OpaqueExpression")) {
	if (OpaqueExpressionSet.contains(targetNode)) { 
		
		OpaqueExpression targetElement = modelNode2OpaqueExpression.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createOpaqueExpression();
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setBody(targetNode.attributes.get("body"));
			modelNode2OpaqueExpression.put(targetNode, targetElement);
		}
	createNonContainmentAssocTypedElementType(targetElement, targetNode);
		
		modelElement.setGuard(targetElement);
		break;
	}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
		}
	}
	void createAssocRootPackagePackagedElement(RootPackage modelElement, ModelNode node) {
		LinkedList<ModelPattern> patternAssocs = RootPackagePackagedElementPackageableElementMap.get(node);
		if (patternAssocs == null) {
			return;
		}
		for (ModelPattern patternAssoc : patternAssocs) {
			ModelNode targetNode = patternAssoc.edges.get(0).target;
	
	if (targetNode.types.contains("PackageableElement")) {
	
	if (targetNode.types.contains("Package")) {
	if (PackageSet.contains(targetNode)) { 
		
		Package targetElement = modelNode2Package.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createPackage();
				targetElement.setName(targetNode.attributes.get("name"));
			modelNode2Package.put(targetNode, targetElement);
		}
			createAssocPackagePackagedElement(targetElement, targetNode);
		
		modelElement.getPackagedElement().add(targetElement);
	}
	}
				else	
	
	if (targetNode.types.contains("Type")) {
	
	if (targetNode.types.contains("Classifier")) {
	
	if (targetNode.types.contains("StructuredClassifier")) {
	
	if (targetNode.types.contains("EncapsulatedClassifier")) {
	
	if (targetNode.types.contains("Class")) {
	
	if (targetNode.types.contains("Behavior")) {
	
	if (targetNode.types.contains("Activity")) {
	if (ActivitySet.contains(targetNode)) { 
		
		Activity targetElement = modelNode2Activity.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createActivity();
			targetElement.setIsActive(Boolean.parseBoolean(targetNode.attributes.get("isActive")));
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			targetElement.setIsAbstract(Boolean.parseBoolean(targetNode.attributes.get("isAbstract")));
			targetElement.setIsReentrant(Boolean.parseBoolean(targetNode.attributes.get("isReentrant")));
			modelNode2Activity.put(targetNode, targetElement);
		}
			createAssocActivityNode(targetElement, targetNode);
			createAssocActivityGroup(targetElement, targetNode);
			createAssocActivityEdge(targetElement, targetNode);
		
		modelElement.getPackagedElement().add(targetElement);
	}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
				else	
 {
	if (ClassSet.contains(targetNode)) { 
		
		Class targetElement = modelNode2Class.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createClass();
			targetElement.setIsActive(Boolean.parseBoolean(targetNode.attributes.get("isActive")));
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			targetElement.setIsAbstract(Boolean.parseBoolean(targetNode.attributes.get("isAbstract")));
			modelNode2Class.put(targetNode, targetElement);
		}
		
		modelElement.getPackagedElement().add(targetElement);
	}
			}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
				else	
	
	if (targetNode.types.contains("BehavioredClassifier")) {
	
	if (targetNode.types.contains("Class")) {
	
	if (targetNode.types.contains("Behavior")) {
	
	if (targetNode.types.contains("Activity")) {
	if (ActivitySet.contains(targetNode)) { 
		
		Activity targetElement = modelNode2Activity.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createActivity();
			targetElement.setIsActive(Boolean.parseBoolean(targetNode.attributes.get("isActive")));
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			targetElement.setIsAbstract(Boolean.parseBoolean(targetNode.attributes.get("isAbstract")));
			targetElement.setIsReentrant(Boolean.parseBoolean(targetNode.attributes.get("isReentrant")));
			modelNode2Activity.put(targetNode, targetElement);
		}
			createAssocActivityNode(targetElement, targetNode);
			createAssocActivityGroup(targetElement, targetNode);
			createAssocActivityEdge(targetElement, targetNode);
		
		modelElement.getPackagedElement().add(targetElement);
	}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
				else	
 {
	if (ClassSet.contains(targetNode)) { 
		
		Class targetElement = modelNode2Class.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createClass();
			targetElement.setIsActive(Boolean.parseBoolean(targetNode.attributes.get("isActive")));
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			targetElement.setIsAbstract(Boolean.parseBoolean(targetNode.attributes.get("isAbstract")));
			modelNode2Class.put(targetNode, targetElement);
		}
		
		modelElement.getPackagedElement().add(targetElement);
	}
			}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
				else	
	
	if (targetNode.types.contains("ValueSpecification")) {
	
	if (targetNode.types.contains("OpaqueExpression")) {
	if (OpaqueExpressionSet.contains(targetNode)) { 
		
		OpaqueExpression targetElement = modelNode2OpaqueExpression.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createOpaqueExpression();
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setBody(targetNode.attributes.get("body"));
			modelNode2OpaqueExpression.put(targetNode, targetElement);
		}
	createNonContainmentAssocTypedElementType(targetElement, targetNode);
		
		modelElement.getPackagedElement().add(targetElement);
	}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
		}
	}
	
	void createNonContainmentAssocActivityPartitionNode(ActivityPartition modelElement, ModelNode node) {
		LinkedList<ModelPattern> patternAssocs = ActivityPartitionNodeActivityNodeMap.get(node);
		if (patternAssocs == null) {
			return;
		}
		for (ModelPattern patternAssoc : patternAssocs) {
			ModelNode targetNode = patternAssoc.edges.get(0).target;
	
	if (targetNode.types.contains("ActivityNode")) {
	
	if (targetNode.types.contains("ExecutableNode")) {
	
	if (targetNode.types.contains("Action")) {
	
	if (targetNode.types.contains("OpaqueAction")) {
	if (OpaqueActionSet.contains(targetNode)) { 
		
		OpaqueAction targetElement = modelNode2OpaqueAction.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createOpaqueAction();
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			modelNode2OpaqueAction.put(targetNode, targetElement);
		}
		
		modelElement.getNode().add(targetElement);
	}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
				else	
	
	if (targetNode.types.contains("ControlNode")) {
	
	if (targetNode.types.contains("JoinNode")) {
	if (JoinNodeSet.contains(targetNode)) { 
		
		JoinNode targetElement = modelNode2JoinNode.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createJoinNode();
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			targetElement.setIsCombineDuplicate(Boolean.parseBoolean(targetNode.attributes.get("isCombineDuplicate")));
			modelNode2JoinNode.put(targetNode, targetElement);
		}
		
		modelElement.getNode().add(targetElement);
	}
	}
				else	
	
	if (targetNode.types.contains("InitialNode")) {
	if (InitialNodeSet.contains(targetNode)) { 
		
		InitialNode targetElement = modelNode2InitialNode.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createInitialNode();
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			modelNode2InitialNode.put(targetNode, targetElement);
		}
		
		modelElement.getNode().add(targetElement);
	}
	}
				else	
	
	if (targetNode.types.contains("DecisionNode")) {
	if (DecisionNodeSet.contains(targetNode)) { 
		
		DecisionNode targetElement = modelNode2DecisionNode.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createDecisionNode();
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			modelNode2DecisionNode.put(targetNode, targetElement);
		}
		
		modelElement.getNode().add(targetElement);
	}
	}
				else	
	
	if (targetNode.types.contains("ForkNode")) {
	if (ForkNodeSet.contains(targetNode)) { 
		
		ForkNode targetElement = modelNode2ForkNode.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createForkNode();
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			modelNode2ForkNode.put(targetNode, targetElement);
		}
		
		modelElement.getNode().add(targetElement);
	}
	}
				else	
	
	if (targetNode.types.contains("FinalNode")) {
	
	if (targetNode.types.contains("ActivityFinalNode")) {
	if (ActivityFinalNodeSet.contains(targetNode)) { 
		
		ActivityFinalNode targetElement = modelNode2ActivityFinalNode.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createActivityFinalNode();
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			modelNode2ActivityFinalNode.put(targetNode, targetElement);
		}
		
		modelElement.getNode().add(targetElement);
	}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
				else	
	
	if (targetNode.types.contains("ObjectNode")) {
	
	if (targetNode.types.contains("ActivityParameterNode")) {
	if (ActivityParameterNodeSet.contains(targetNode)) { 
		
		ActivityParameterNode targetElement = modelNode2ActivityParameterNode.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createActivityParameterNode();
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			targetElement.setIsControlType(Boolean.parseBoolean(targetNode.attributes.get("isControlType")));
			modelNode2ActivityParameterNode.put(targetNode, targetElement);
		}
		
		modelElement.getNode().add(targetElement);
	}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
		}
	}
	void createNonContainmentAssocActivityPartitionEdge(ActivityPartition modelElement, ModelNode node) {
		LinkedList<ModelPattern> patternAssocs = ActivityPartitionEdgeActivityEdgeMap.get(node);
		if (patternAssocs == null) {
			return;
		}
		for (ModelPattern patternAssoc : patternAssocs) {
			ModelNode targetNode = patternAssoc.edges.get(0).target;
	
	if (targetNode.types.contains("ActivityEdge")) {
	
	if (targetNode.types.contains("ObjectFlow")) {
	if (ObjectFlowSet.contains(targetNode)) { 
		
		ObjectFlow targetElement = modelNode2ObjectFlow.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createObjectFlow();
			targetElement.setIsMulticast(Boolean.parseBoolean(targetNode.attributes.get("isMulticast")));
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			targetElement.setIsMultireceive(Boolean.parseBoolean(targetNode.attributes.get("isMultireceive")));
			modelNode2ObjectFlow.put(targetNode, targetElement);
		}
		
		modelElement.getEdge().add(targetElement);
	}
	}
				else	
	
	if (targetNode.types.contains("ControlFlow")) {
	if (ControlFlowSet.contains(targetNode)) { 
		
		ControlFlow targetElement = modelNode2ControlFlow.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createControlFlow();
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			modelNode2ControlFlow.put(targetNode, targetElement);
		}
		
		modelElement.getEdge().add(targetElement);
	}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
		}
	}
	void createNonContainmentAssocTypedElementType(TypedElement modelElement, ModelNode node) {
		LinkedList<ModelPattern> patternAssocs = TypedElementTypeTypeMap.get(node);
		if (patternAssocs == null) {
			return;
		}
		for (ModelPattern patternAssoc : patternAssocs) {
			ModelNode targetNode = patternAssoc.edges.get(0).target;
	
	if (targetNode.types.contains("Type")) {
	
	if (targetNode.types.contains("Classifier")) {
	
	if (targetNode.types.contains("StructuredClassifier")) {
	
	if (targetNode.types.contains("EncapsulatedClassifier")) {
	
	if (targetNode.types.contains("Class")) {
	
	if (targetNode.types.contains("Behavior")) {
	
	if (targetNode.types.contains("Activity")) {
	if (ActivitySet.contains(targetNode)) { 
		
		Activity targetElement = modelNode2Activity.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createActivity();
			targetElement.setIsActive(Boolean.parseBoolean(targetNode.attributes.get("isActive")));
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			targetElement.setIsAbstract(Boolean.parseBoolean(targetNode.attributes.get("isAbstract")));
			targetElement.setIsReentrant(Boolean.parseBoolean(targetNode.attributes.get("isReentrant")));
			modelNode2Activity.put(targetNode, targetElement);
		}
		
		modelElement.setType(targetElement);
		break;
	}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
				else	
 {
	if (ClassSet.contains(targetNode)) { 
		
		Class targetElement = modelNode2Class.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createClass();
			targetElement.setIsActive(Boolean.parseBoolean(targetNode.attributes.get("isActive")));
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			targetElement.setIsAbstract(Boolean.parseBoolean(targetNode.attributes.get("isAbstract")));
			modelNode2Class.put(targetNode, targetElement);
		}
		
		modelElement.setType(targetElement);
		break;
	}
			}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
				else	
	
	if (targetNode.types.contains("BehavioredClassifier")) {
	
	if (targetNode.types.contains("Class")) {
	
	if (targetNode.types.contains("Behavior")) {
	
	if (targetNode.types.contains("Activity")) {
	if (ActivitySet.contains(targetNode)) { 
		
		Activity targetElement = modelNode2Activity.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createActivity();
			targetElement.setIsActive(Boolean.parseBoolean(targetNode.attributes.get("isActive")));
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			targetElement.setIsAbstract(Boolean.parseBoolean(targetNode.attributes.get("isAbstract")));
			targetElement.setIsReentrant(Boolean.parseBoolean(targetNode.attributes.get("isReentrant")));
			modelNode2Activity.put(targetNode, targetElement);
		}
		
		modelElement.setType(targetElement);
		break;
	}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
				else	
 {
	if (ClassSet.contains(targetNode)) { 
		
		Class targetElement = modelNode2Class.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createClass();
			targetElement.setIsActive(Boolean.parseBoolean(targetNode.attributes.get("isActive")));
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			targetElement.setIsAbstract(Boolean.parseBoolean(targetNode.attributes.get("isAbstract")));
			modelNode2Class.put(targetNode, targetElement);
		}
		
		modelElement.setType(targetElement);
		break;
	}
			}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
		}
	}
	void createNonContainmentAssocActivityNodeOutgoing(ActivityNode modelElement, ModelNode node) {
		LinkedList<ModelPattern> patternAssocs = ActivityNodeOutgoingActivityEdgeMap.get(node);
		if (patternAssocs == null) {
			return;
		}
		for (ModelPattern patternAssoc : patternAssocs) {
			ModelNode targetNode = patternAssoc.edges.get(0).target;
	
	if (targetNode.types.contains("ActivityEdge")) {
	
	if (targetNode.types.contains("ObjectFlow")) {
	if (ObjectFlowSet.contains(targetNode)) { 
		
		ObjectFlow targetElement = modelNode2ObjectFlow.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createObjectFlow();
			targetElement.setIsMulticast(Boolean.parseBoolean(targetNode.attributes.get("isMulticast")));
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			targetElement.setIsMultireceive(Boolean.parseBoolean(targetNode.attributes.get("isMultireceive")));
			modelNode2ObjectFlow.put(targetNode, targetElement);
		}
		
		modelElement.getOutgoing().add(targetElement);
	}
	}
				else	
	
	if (targetNode.types.contains("ControlFlow")) {
	if (ControlFlowSet.contains(targetNode)) { 
		
		ControlFlow targetElement = modelNode2ControlFlow.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createControlFlow();
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			modelNode2ControlFlow.put(targetNode, targetElement);
		}
		
		modelElement.getOutgoing().add(targetElement);
	}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
		}
	}
	void createNonContainmentAssocActivityNodeIncoming(ActivityNode modelElement, ModelNode node) {
		LinkedList<ModelPattern> patternAssocs = ActivityNodeIncomingActivityEdgeMap.get(node);
		if (patternAssocs == null) {
			return;
		}
		for (ModelPattern patternAssoc : patternAssocs) {
			ModelNode targetNode = patternAssoc.edges.get(0).target;
	
	if (targetNode.types.contains("ActivityEdge")) {
	
	if (targetNode.types.contains("ObjectFlow")) {
	if (ObjectFlowSet.contains(targetNode)) { 
		
		ObjectFlow targetElement = modelNode2ObjectFlow.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createObjectFlow();
			targetElement.setIsMulticast(Boolean.parseBoolean(targetNode.attributes.get("isMulticast")));
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			targetElement.setIsMultireceive(Boolean.parseBoolean(targetNode.attributes.get("isMultireceive")));
			modelNode2ObjectFlow.put(targetNode, targetElement);
		}
		
		modelElement.getIncoming().add(targetElement);
	}
	}
				else	
	
	if (targetNode.types.contains("ControlFlow")) {
	if (ControlFlowSet.contains(targetNode)) { 
		
		ControlFlow targetElement = modelNode2ControlFlow.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createControlFlow();
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			modelNode2ControlFlow.put(targetNode, targetElement);
		}
		
		modelElement.getIncoming().add(targetElement);
	}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
		}
	}
	void createNonContainmentAssocActivityEdgeSource(ActivityEdge modelElement, ModelNode node) {
		LinkedList<ModelPattern> patternAssocs = ActivityEdgeSourceActivityNodeMap.get(node);
		if (patternAssocs == null) {
			return;
		}
		for (ModelPattern patternAssoc : patternAssocs) {
			ModelNode targetNode = patternAssoc.edges.get(0).target;
	
	if (targetNode.types.contains("ActivityNode")) {
	
	if (targetNode.types.contains("ExecutableNode")) {
	
	if (targetNode.types.contains("Action")) {
	
	if (targetNode.types.contains("OpaqueAction")) {
	if (OpaqueActionSet.contains(targetNode)) { 
		
		OpaqueAction targetElement = modelNode2OpaqueAction.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createOpaqueAction();
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			modelNode2OpaqueAction.put(targetNode, targetElement);
		}
		
		modelElement.setSource(targetElement);
		break;
	}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
				else	
	
	if (targetNode.types.contains("ControlNode")) {
	
	if (targetNode.types.contains("JoinNode")) {
	if (JoinNodeSet.contains(targetNode)) { 
		
		JoinNode targetElement = modelNode2JoinNode.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createJoinNode();
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			targetElement.setIsCombineDuplicate(Boolean.parseBoolean(targetNode.attributes.get("isCombineDuplicate")));
			modelNode2JoinNode.put(targetNode, targetElement);
		}
		
		modelElement.setSource(targetElement);
		break;
	}
	}
				else	
	
	if (targetNode.types.contains("InitialNode")) {
	if (InitialNodeSet.contains(targetNode)) { 
		
		InitialNode targetElement = modelNode2InitialNode.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createInitialNode();
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			modelNode2InitialNode.put(targetNode, targetElement);
		}
		
		modelElement.setSource(targetElement);
		break;
	}
	}
				else	
	
	if (targetNode.types.contains("DecisionNode")) {
	if (DecisionNodeSet.contains(targetNode)) { 
		
		DecisionNode targetElement = modelNode2DecisionNode.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createDecisionNode();
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			modelNode2DecisionNode.put(targetNode, targetElement);
		}
		
		modelElement.setSource(targetElement);
		break;
	}
	}
				else	
	
	if (targetNode.types.contains("ForkNode")) {
	if (ForkNodeSet.contains(targetNode)) { 
		
		ForkNode targetElement = modelNode2ForkNode.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createForkNode();
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			modelNode2ForkNode.put(targetNode, targetElement);
		}
		
		modelElement.setSource(targetElement);
		break;
	}
	}
				else	
	
	if (targetNode.types.contains("FinalNode")) {
	
	if (targetNode.types.contains("ActivityFinalNode")) {
	if (ActivityFinalNodeSet.contains(targetNode)) { 
		
		ActivityFinalNode targetElement = modelNode2ActivityFinalNode.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createActivityFinalNode();
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			modelNode2ActivityFinalNode.put(targetNode, targetElement);
		}
		
		modelElement.setSource(targetElement);
		break;
	}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
				else	
	
	if (targetNode.types.contains("ObjectNode")) {
	
	if (targetNode.types.contains("ActivityParameterNode")) {
	if (ActivityParameterNodeSet.contains(targetNode)) { 
		
		ActivityParameterNode targetElement = modelNode2ActivityParameterNode.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createActivityParameterNode();
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			targetElement.setIsControlType(Boolean.parseBoolean(targetNode.attributes.get("isControlType")));
			modelNode2ActivityParameterNode.put(targetNode, targetElement);
		}
		
		modelElement.setSource(targetElement);
		break;
	}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
		}
	}
	void createNonContainmentAssocActivityEdgeTarget(ActivityEdge modelElement, ModelNode node) {
		LinkedList<ModelPattern> patternAssocs = ActivityEdgeTargetActivityNodeMap.get(node);
		if (patternAssocs == null) {
			return;
		}
		for (ModelPattern patternAssoc : patternAssocs) {
			ModelNode targetNode = patternAssoc.edges.get(0).target;
	
	if (targetNode.types.contains("ActivityNode")) {
	
	if (targetNode.types.contains("ExecutableNode")) {
	
	if (targetNode.types.contains("Action")) {
	
	if (targetNode.types.contains("OpaqueAction")) {
	if (OpaqueActionSet.contains(targetNode)) { 
		
		OpaqueAction targetElement = modelNode2OpaqueAction.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createOpaqueAction();
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			modelNode2OpaqueAction.put(targetNode, targetElement);
		}
		
		modelElement.setTarget(targetElement);
		break;
	}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
				else	
	
	if (targetNode.types.contains("ControlNode")) {
	
	if (targetNode.types.contains("JoinNode")) {
	if (JoinNodeSet.contains(targetNode)) { 
		
		JoinNode targetElement = modelNode2JoinNode.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createJoinNode();
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			targetElement.setIsCombineDuplicate(Boolean.parseBoolean(targetNode.attributes.get("isCombineDuplicate")));
			modelNode2JoinNode.put(targetNode, targetElement);
		}
		
		modelElement.setTarget(targetElement);
		break;
	}
	}
				else	
	
	if (targetNode.types.contains("InitialNode")) {
	if (InitialNodeSet.contains(targetNode)) { 
		
		InitialNode targetElement = modelNode2InitialNode.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createInitialNode();
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			modelNode2InitialNode.put(targetNode, targetElement);
		}
		
		modelElement.setTarget(targetElement);
		break;
	}
	}
				else	
	
	if (targetNode.types.contains("DecisionNode")) {
	if (DecisionNodeSet.contains(targetNode)) { 
		
		DecisionNode targetElement = modelNode2DecisionNode.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createDecisionNode();
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			modelNode2DecisionNode.put(targetNode, targetElement);
		}
		
		modelElement.setTarget(targetElement);
		break;
	}
	}
				else	
	
	if (targetNode.types.contains("ForkNode")) {
	if (ForkNodeSet.contains(targetNode)) { 
		
		ForkNode targetElement = modelNode2ForkNode.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createForkNode();
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			modelNode2ForkNode.put(targetNode, targetElement);
		}
		
		modelElement.setTarget(targetElement);
		break;
	}
	}
				else	
	
	if (targetNode.types.contains("FinalNode")) {
	
	if (targetNode.types.contains("ActivityFinalNode")) {
	if (ActivityFinalNodeSet.contains(targetNode)) { 
		
		ActivityFinalNode targetElement = modelNode2ActivityFinalNode.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createActivityFinalNode();
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			modelNode2ActivityFinalNode.put(targetNode, targetElement);
		}
		
		modelElement.setTarget(targetElement);
		break;
	}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
				else	
	
	if (targetNode.types.contains("ObjectNode")) {
	
	if (targetNode.types.contains("ActivityParameterNode")) {
	if (ActivityParameterNodeSet.contains(targetNode)) { 
		
		ActivityParameterNode targetElement = modelNode2ActivityParameterNode.get(targetNode);
		
		if (targetElement == null) {
			targetElement = UmlFactory.eINSTANCE.createActivityParameterNode();
				targetElement.setName(targetNode.attributes.get("name"));
			targetElement.setIsLeaf(Boolean.parseBoolean(targetNode.attributes.get("isLeaf")));
			targetElement.setIsControlType(Boolean.parseBoolean(targetNode.attributes.get("isControlType")));
			modelNode2ActivityParameterNode.put(targetNode, targetElement);
		}
		
		modelElement.setTarget(targetElement);
		break;
	}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
				else	
 {
 throw new RuntimeException("Attempt to create an abstract class."); 			}
	}
		}
	}
	
}

