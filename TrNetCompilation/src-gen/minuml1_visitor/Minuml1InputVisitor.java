package minuml1_visitor;

import minuml1.*;
import generic.*;

import org.eclipse.emf.ecore.EObject;


import minuml1.ModelElement;
import minuml1.impl.ModelElementImpl;
import minuml1.StateMachine;
import minuml1.impl.StateMachineImpl;
import minuml1.ActivityGraph;
import minuml1.impl.ActivityGraphImpl;
import minuml1.Partition;
import minuml1.impl.PartitionImpl;
import minuml1.StateVertex;
import minuml1.impl.StateVertexImpl;
import minuml1.State;
import minuml1.impl.StateImpl;
import minuml1.CompositeState;
import minuml1.impl.CompositeStateImpl;
import minuml1.ActionState;
import minuml1.impl.ActionStateImpl;
import minuml1.Pseudostate;
import minuml1.impl.PseudostateImpl;
import minuml1.ObjectFlowState;
import minuml1.impl.ObjectFlowStateImpl;
import minuml1.FinalState;
import minuml1.impl.FinalStateImpl;
import minuml1.Transition;
import minuml1.impl.TransitionImpl;
import minuml1.Guard;
import minuml1.impl.GuardImpl;
import minuml1.BooleanExpression;
import minuml1.impl.BooleanExpressionImpl;
import minuml1.RootActivityGraph;
import minuml1.impl.RootActivityGraphImpl;

import java.util.HashMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import java.util.Map;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import java.util.LinkedList;

public class Minuml1InputVisitor
implements ModelPatternPublisher
{

LinkedList<ModelPatternListener> listeners;

HashMap<EObject, ModelNode> nodesMap;

public Minuml1InputVisitor() {
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

public RootActivityGraph load(String path){
	Minuml1Package.eINSTANCE.eClass();
	
	Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
    Map<String, Object> m = reg.getExtensionToFactoryMap();
    m.put("xmi", new XMIResourceFactoryImpl());
	
	ResourceSet resSet = new ResourceSetImpl();
	
	Resource resource = resSet.getResource(URI
        .createURI(path), true);
    
    RootActivityGraph rootEClass = (RootActivityGraph) resource.getContents().get(0);
    return rootEClass;
}


public void visitModelElement(ModelElement element){
	
	ModelNode node;
	
	if (! nodesMap.containsKey(element)) {
		node = new ModelNode();
		
	if (element.getClass() == ModelElementImpl.class) {
			node.types.add("ModelElement");
			node.attributes.put("name", ((ModelElement) element).getName()+"");
	}
	if (element.getClass() == StateMachineImpl.class) {
			node.types.add("ModelElement");
			node.types.add("StateMachine");
			node.attributes.put("name", ((StateMachine) element).getName()+"");
	}
	if (element.getClass() == ActivityGraphImpl.class) {
			node.types.add("ActivityGraph");
			node.types.add("ModelElement");
			node.types.add("StateMachine");
			node.attributes.put("name", ((ActivityGraph) element).getName()+"");
	}
	if (element.getClass() == PartitionImpl.class) {
			node.types.add("Partition");
			node.types.add("ModelElement");
			node.attributes.put("name", ((Partition) element).getName()+"");
	}
	if (element.getClass() == StateImpl.class) {
			node.types.add("StateVertex");
			node.types.add("ModelElement");
			node.types.add("State");
			node.attributes.put("name", ((State) element).getName()+"");
	}
	if (element.getClass() == CompositeStateImpl.class) {
			node.types.add("StateVertex");
			node.types.add("ModelElement");
			node.types.add("CompositeState");
			node.types.add("State");
			node.attributes.put("name", ((CompositeState) element).getName()+"");
	}
	if (element.getClass() == ActionStateImpl.class) {
			node.types.add("StateVertex");
			node.types.add("ModelElement");
			node.types.add("ActionState");
			node.types.add("State");
			node.attributes.put("name", ((ActionState) element).getName()+"");
			node.attributes.put("isDynamic", ((ActionState) element).isIsDynamic()+"");
	}
	if (element.getClass() == PseudostateImpl.class) {
			node.types.add("StateVertex");
			node.types.add("ModelElement");
			node.types.add("Pseudostate");
			node.attributes.put("name", ((Pseudostate) element).getName()+"");
			node.attributes.put("kind", ((Pseudostate) element).getKind()+"");
	}
	if (element.getClass() == ObjectFlowStateImpl.class) {
			node.types.add("ObjectFlowState");
			node.types.add("StateVertex");
			node.types.add("ModelElement");
			node.types.add("State");
			node.attributes.put("name", ((ObjectFlowState) element).getName()+"");
	}
	if (element.getClass() == FinalStateImpl.class) {
			node.types.add("StateVertex");
			node.types.add("ModelElement");
			node.types.add("State");
			node.types.add("FinalState");
			node.attributes.put("name", ((FinalState) element).getName()+"");
	}
	if (element.getClass() == TransitionImpl.class) {
			node.types.add("ModelElement");
			node.types.add("Transition");
			node.attributes.put("name", ((Transition) element).getName()+"");
	}
	if (element.getClass() == GuardImpl.class) {
			node.types.add("ModelElement");
			node.types.add("Guard");
			node.attributes.put("name", ((Guard) element).getName()+"");
	}
		
		nodesMap.put(element, node);
	} else {
		node = nodesMap.get(element);
	}
	
	ModelPattern pattern = new ModelPattern();
	pattern.nodes.add(node);
	notifyListeners(pattern);
}
public void visitStateMachine(StateMachine element){
	
	ModelNode node;
	
	if (! nodesMap.containsKey(element)) {
		node = new ModelNode();
		
	if (element.getClass() == StateMachineImpl.class) {
			node.types.add("ModelElement");
			node.types.add("StateMachine");
			node.attributes.put("name", ((StateMachine) element).getName()+"");
	}
	if (element.getClass() == ActivityGraphImpl.class) {
			node.types.add("ActivityGraph");
			node.types.add("ModelElement");
			node.types.add("StateMachine");
			node.attributes.put("name", ((ActivityGraph) element).getName()+"");
	}
		
		nodesMap.put(element, node);
	} else {
		node = nodesMap.get(element);
	}
	
	ModelPattern pattern = new ModelPattern();
	pattern.nodes.add(node);
	notifyListeners(pattern);
	if (element.getTop() != null) {
		State elementTarget = element.getTop();
		ModelEdge modelEdge = new ModelEdge();
		modelEdge.name = "top";
		ModelNode nodeTarget;
		
	if (! nodesMap.containsKey(elementTarget)) {
		nodeTarget = new ModelNode();
		
	if (elementTarget.getClass() == StateImpl.class) {
			nodeTarget.types.add("StateVertex");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("State");
			nodeTarget.attributes.put("name", ((State) elementTarget).getName()+"");
	}
	if (elementTarget.getClass() == CompositeStateImpl.class) {
			nodeTarget.types.add("StateVertex");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("CompositeState");
			nodeTarget.types.add("State");
			nodeTarget.attributes.put("name", ((CompositeState) elementTarget).getName()+"");
	}
	if (elementTarget.getClass() == ActionStateImpl.class) {
			nodeTarget.types.add("StateVertex");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("ActionState");
			nodeTarget.types.add("State");
			nodeTarget.attributes.put("name", ((ActionState) elementTarget).getName()+"");
			nodeTarget.attributes.put("isDynamic", ((ActionState) elementTarget).isIsDynamic()+"");
	}
	if (elementTarget.getClass() == ObjectFlowStateImpl.class) {
			nodeTarget.types.add("ObjectFlowState");
			nodeTarget.types.add("StateVertex");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("State");
			nodeTarget.attributes.put("name", ((ObjectFlowState) elementTarget).getName()+"");
	}
	if (elementTarget.getClass() == FinalStateImpl.class) {
			nodeTarget.types.add("StateVertex");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("State");
			nodeTarget.types.add("FinalState");
			nodeTarget.attributes.put("name", ((FinalState) elementTarget).getName()+"");
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
	for (Transition elementTarget : element.getTransitions() ){
		ModelEdge edge = new ModelEdge();
		edge.name = "transitions";
		ModelNode nodeTarget;
		
	if (! nodesMap.containsKey(elementTarget)) {
		nodeTarget = new ModelNode();
		
	if (elementTarget.getClass() == TransitionImpl.class) {
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("Transition");
			nodeTarget.attributes.put("name", ((Transition) elementTarget).getName()+"");
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
{
	State child = element.getTop();
	if (child != null) {
	if (child.getClass() == StateImpl.class) {
		visitState((State)child);
	}
	if (child.getClass() == CompositeStateImpl.class) {
		visitCompositeState((CompositeState)child);
	}
	if (child.getClass() == ActionStateImpl.class) {
		visitActionState((ActionState)child);
	}
	if (child.getClass() == ObjectFlowStateImpl.class) {
		visitObjectFlowState((ObjectFlowState)child);
	}
	if (child.getClass() == FinalStateImpl.class) {
		visitFinalState((FinalState)child);
	}
	}
}
for (Transition child : element.getTransitions()) {
	if (child.getClass() == TransitionImpl.class) {
		visitTransition((Transition)child);
	}
}
}
public void visitActivityGraph(ActivityGraph element){
	
	ModelNode node;
	
	if (! nodesMap.containsKey(element)) {
		node = new ModelNode();
		
	if (element.getClass() == ActivityGraphImpl.class) {
			node.types.add("ActivityGraph");
			node.types.add("ModelElement");
			node.types.add("StateMachine");
			node.attributes.put("name", ((ActivityGraph) element).getName()+"");
	}
		
		nodesMap.put(element, node);
	} else {
		node = nodesMap.get(element);
	}
	
	ModelPattern pattern = new ModelPattern();
	pattern.nodes.add(node);
	notifyListeners(pattern);
	for (Partition elementTarget : element.getPartition() ){
		ModelEdge edge = new ModelEdge();
		edge.name = "partition";
		ModelNode nodeTarget;
		
	if (! nodesMap.containsKey(elementTarget)) {
		nodeTarget = new ModelNode();
		
	if (elementTarget.getClass() == PartitionImpl.class) {
			nodeTarget.types.add("Partition");
			nodeTarget.types.add("ModelElement");
			nodeTarget.attributes.put("name", ((Partition) elementTarget).getName()+"");
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
	if (element.getTop() != null) {
		State elementTarget = element.getTop();
		ModelEdge modelEdge = new ModelEdge();
		modelEdge.name = "top";
		ModelNode nodeTarget;
		
	if (! nodesMap.containsKey(elementTarget)) {
		nodeTarget = new ModelNode();
		
	if (elementTarget.getClass() == StateImpl.class) {
			nodeTarget.types.add("StateVertex");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("State");
			nodeTarget.attributes.put("name", ((State) elementTarget).getName()+"");
	}
	if (elementTarget.getClass() == CompositeStateImpl.class) {
			nodeTarget.types.add("StateVertex");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("CompositeState");
			nodeTarget.types.add("State");
			nodeTarget.attributes.put("name", ((CompositeState) elementTarget).getName()+"");
	}
	if (elementTarget.getClass() == ActionStateImpl.class) {
			nodeTarget.types.add("StateVertex");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("ActionState");
			nodeTarget.types.add("State");
			nodeTarget.attributes.put("name", ((ActionState) elementTarget).getName()+"");
			nodeTarget.attributes.put("isDynamic", ((ActionState) elementTarget).isIsDynamic()+"");
	}
	if (elementTarget.getClass() == ObjectFlowStateImpl.class) {
			nodeTarget.types.add("ObjectFlowState");
			nodeTarget.types.add("StateVertex");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("State");
			nodeTarget.attributes.put("name", ((ObjectFlowState) elementTarget).getName()+"");
	}
	if (elementTarget.getClass() == FinalStateImpl.class) {
			nodeTarget.types.add("StateVertex");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("State");
			nodeTarget.types.add("FinalState");
			nodeTarget.attributes.put("name", ((FinalState) elementTarget).getName()+"");
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
	for (Transition elementTarget : element.getTransitions() ){
		ModelEdge edge = new ModelEdge();
		edge.name = "transitions";
		ModelNode nodeTarget;
		
	if (! nodesMap.containsKey(elementTarget)) {
		nodeTarget = new ModelNode();
		
	if (elementTarget.getClass() == TransitionImpl.class) {
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("Transition");
			nodeTarget.attributes.put("name", ((Transition) elementTarget).getName()+"");
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
for (Partition child : element.getPartition()) {
	if (child.getClass() == PartitionImpl.class) {
		visitPartition((Partition)child);
	}
}
{
	State child = element.getTop();
	if (child != null) {
	if (child.getClass() == StateImpl.class) {
		visitState((State)child);
	}
	if (child.getClass() == CompositeStateImpl.class) {
		visitCompositeState((CompositeState)child);
	}
	if (child.getClass() == ActionStateImpl.class) {
		visitActionState((ActionState)child);
	}
	if (child.getClass() == ObjectFlowStateImpl.class) {
		visitObjectFlowState((ObjectFlowState)child);
	}
	if (child.getClass() == FinalStateImpl.class) {
		visitFinalState((FinalState)child);
	}
	}
}
for (Transition child : element.getTransitions()) {
	if (child.getClass() == TransitionImpl.class) {
		visitTransition((Transition)child);
	}
}
}
public void visitPartition(Partition element){
	
	ModelNode node;
	
	if (! nodesMap.containsKey(element)) {
		node = new ModelNode();
		
	if (element.getClass() == PartitionImpl.class) {
			node.types.add("Partition");
			node.types.add("ModelElement");
			node.attributes.put("name", ((Partition) element).getName()+"");
	}
		
		nodesMap.put(element, node);
	} else {
		node = nodesMap.get(element);
	}
	
	ModelPattern pattern = new ModelPattern();
	pattern.nodes.add(node);
	notifyListeners(pattern);
	for (ModelElement elementTarget : element.getContents() ){
		ModelEdge edge = new ModelEdge();
		edge.name = "contents";
		ModelNode nodeTarget;
		
	if (! nodesMap.containsKey(elementTarget)) {
		nodeTarget = new ModelNode();
		
	if (elementTarget.getClass() == ModelElementImpl.class) {
			nodeTarget.types.add("ModelElement");
			nodeTarget.attributes.put("name", ((ModelElement) elementTarget).getName()+"");
	}
	if (elementTarget.getClass() == StateMachineImpl.class) {
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("StateMachine");
			nodeTarget.attributes.put("name", ((StateMachine) elementTarget).getName()+"");
	}
	if (elementTarget.getClass() == ActivityGraphImpl.class) {
			nodeTarget.types.add("ActivityGraph");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("StateMachine");
			nodeTarget.attributes.put("name", ((ActivityGraph) elementTarget).getName()+"");
	}
	if (elementTarget.getClass() == PartitionImpl.class) {
			nodeTarget.types.add("Partition");
			nodeTarget.types.add("ModelElement");
			nodeTarget.attributes.put("name", ((Partition) elementTarget).getName()+"");
	}
	if (elementTarget.getClass() == StateImpl.class) {
			nodeTarget.types.add("StateVertex");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("State");
			nodeTarget.attributes.put("name", ((State) elementTarget).getName()+"");
	}
	if (elementTarget.getClass() == CompositeStateImpl.class) {
			nodeTarget.types.add("StateVertex");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("CompositeState");
			nodeTarget.types.add("State");
			nodeTarget.attributes.put("name", ((CompositeState) elementTarget).getName()+"");
	}
	if (elementTarget.getClass() == ActionStateImpl.class) {
			nodeTarget.types.add("StateVertex");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("ActionState");
			nodeTarget.types.add("State");
			nodeTarget.attributes.put("name", ((ActionState) elementTarget).getName()+"");
			nodeTarget.attributes.put("isDynamic", ((ActionState) elementTarget).isIsDynamic()+"");
	}
	if (elementTarget.getClass() == PseudostateImpl.class) {
			nodeTarget.types.add("StateVertex");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("Pseudostate");
			nodeTarget.attributes.put("name", ((Pseudostate) elementTarget).getName()+"");
			nodeTarget.attributes.put("kind", ((Pseudostate) elementTarget).getKind()+"");
	}
	if (elementTarget.getClass() == ObjectFlowStateImpl.class) {
			nodeTarget.types.add("ObjectFlowState");
			nodeTarget.types.add("StateVertex");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("State");
			nodeTarget.attributes.put("name", ((ObjectFlowState) elementTarget).getName()+"");
	}
	if (elementTarget.getClass() == FinalStateImpl.class) {
			nodeTarget.types.add("StateVertex");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("State");
			nodeTarget.types.add("FinalState");
			nodeTarget.attributes.put("name", ((FinalState) elementTarget).getName()+"");
	}
	if (elementTarget.getClass() == TransitionImpl.class) {
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("Transition");
			nodeTarget.attributes.put("name", ((Transition) elementTarget).getName()+"");
	}
	if (elementTarget.getClass() == GuardImpl.class) {
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("Guard");
			nodeTarget.attributes.put("name", ((Guard) elementTarget).getName()+"");
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
}
public void visitStateVertex(StateVertex element){
	
	ModelNode node;
	
	if (! nodesMap.containsKey(element)) {
		node = new ModelNode();
		
	if (element.getClass() == StateImpl.class) {
			node.types.add("StateVertex");
			node.types.add("ModelElement");
			node.types.add("State");
			node.attributes.put("name", ((State) element).getName()+"");
	}
	if (element.getClass() == CompositeStateImpl.class) {
			node.types.add("StateVertex");
			node.types.add("ModelElement");
			node.types.add("CompositeState");
			node.types.add("State");
			node.attributes.put("name", ((CompositeState) element).getName()+"");
	}
	if (element.getClass() == ActionStateImpl.class) {
			node.types.add("StateVertex");
			node.types.add("ModelElement");
			node.types.add("ActionState");
			node.types.add("State");
			node.attributes.put("name", ((ActionState) element).getName()+"");
			node.attributes.put("isDynamic", ((ActionState) element).isIsDynamic()+"");
	}
	if (element.getClass() == PseudostateImpl.class) {
			node.types.add("StateVertex");
			node.types.add("ModelElement");
			node.types.add("Pseudostate");
			node.attributes.put("name", ((Pseudostate) element).getName()+"");
			node.attributes.put("kind", ((Pseudostate) element).getKind()+"");
	}
	if (element.getClass() == ObjectFlowStateImpl.class) {
			node.types.add("ObjectFlowState");
			node.types.add("StateVertex");
			node.types.add("ModelElement");
			node.types.add("State");
			node.attributes.put("name", ((ObjectFlowState) element).getName()+"");
	}
	if (element.getClass() == FinalStateImpl.class) {
			node.types.add("StateVertex");
			node.types.add("ModelElement");
			node.types.add("State");
			node.types.add("FinalState");
			node.attributes.put("name", ((FinalState) element).getName()+"");
	}
		
		nodesMap.put(element, node);
	} else {
		node = nodesMap.get(element);
	}
	
	ModelPattern pattern = new ModelPattern();
	pattern.nodes.add(node);
	notifyListeners(pattern);
	for (Transition elementTarget : element.getOutgoing() ){
		ModelEdge edge = new ModelEdge();
		edge.name = "outgoing";
		ModelNode nodeTarget;
		
	if (! nodesMap.containsKey(elementTarget)) {
		nodeTarget = new ModelNode();
		
	if (elementTarget.getClass() == TransitionImpl.class) {
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("Transition");
			nodeTarget.attributes.put("name", ((Transition) elementTarget).getName()+"");
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
	for (Transition elementTarget : element.getIncoming() ){
		ModelEdge edge = new ModelEdge();
		edge.name = "incoming";
		ModelNode nodeTarget;
		
	if (! nodesMap.containsKey(elementTarget)) {
		nodeTarget = new ModelNode();
		
	if (elementTarget.getClass() == TransitionImpl.class) {
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("Transition");
			nodeTarget.attributes.put("name", ((Transition) elementTarget).getName()+"");
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
}
public void visitState(State element){
	
	ModelNode node;
	
	if (! nodesMap.containsKey(element)) {
		node = new ModelNode();
		
	if (element.getClass() == StateImpl.class) {
			node.types.add("StateVertex");
			node.types.add("ModelElement");
			node.types.add("State");
			node.attributes.put("name", ((State) element).getName()+"");
	}
	if (element.getClass() == CompositeStateImpl.class) {
			node.types.add("StateVertex");
			node.types.add("ModelElement");
			node.types.add("CompositeState");
			node.types.add("State");
			node.attributes.put("name", ((CompositeState) element).getName()+"");
	}
	if (element.getClass() == ActionStateImpl.class) {
			node.types.add("StateVertex");
			node.types.add("ModelElement");
			node.types.add("ActionState");
			node.types.add("State");
			node.attributes.put("name", ((ActionState) element).getName()+"");
			node.attributes.put("isDynamic", ((ActionState) element).isIsDynamic()+"");
	}
	if (element.getClass() == ObjectFlowStateImpl.class) {
			node.types.add("ObjectFlowState");
			node.types.add("StateVertex");
			node.types.add("ModelElement");
			node.types.add("State");
			node.attributes.put("name", ((ObjectFlowState) element).getName()+"");
	}
	if (element.getClass() == FinalStateImpl.class) {
			node.types.add("StateVertex");
			node.types.add("ModelElement");
			node.types.add("State");
			node.types.add("FinalState");
			node.attributes.put("name", ((FinalState) element).getName()+"");
	}
		
		nodesMap.put(element, node);
	} else {
		node = nodesMap.get(element);
	}
	
	ModelPattern pattern = new ModelPattern();
	pattern.nodes.add(node);
	notifyListeners(pattern);
	for (Transition elementTarget : element.getOutgoing() ){
		ModelEdge edge = new ModelEdge();
		edge.name = "outgoing";
		ModelNode nodeTarget;
		
	if (! nodesMap.containsKey(elementTarget)) {
		nodeTarget = new ModelNode();
		
	if (elementTarget.getClass() == TransitionImpl.class) {
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("Transition");
			nodeTarget.attributes.put("name", ((Transition) elementTarget).getName()+"");
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
	for (Transition elementTarget : element.getIncoming() ){
		ModelEdge edge = new ModelEdge();
		edge.name = "incoming";
		ModelNode nodeTarget;
		
	if (! nodesMap.containsKey(elementTarget)) {
		nodeTarget = new ModelNode();
		
	if (elementTarget.getClass() == TransitionImpl.class) {
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("Transition");
			nodeTarget.attributes.put("name", ((Transition) elementTarget).getName()+"");
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
}
public void visitCompositeState(CompositeState element){
	
	ModelNode node;
	
	if (! nodesMap.containsKey(element)) {
		node = new ModelNode();
		
	if (element.getClass() == CompositeStateImpl.class) {
			node.types.add("StateVertex");
			node.types.add("ModelElement");
			node.types.add("CompositeState");
			node.types.add("State");
			node.attributes.put("name", ((CompositeState) element).getName()+"");
	}
		
		nodesMap.put(element, node);
	} else {
		node = nodesMap.get(element);
	}
	
	ModelPattern pattern = new ModelPattern();
	pattern.nodes.add(node);
	notifyListeners(pattern);
	for (Transition elementTarget : element.getOutgoing() ){
		ModelEdge edge = new ModelEdge();
		edge.name = "outgoing";
		ModelNode nodeTarget;
		
	if (! nodesMap.containsKey(elementTarget)) {
		nodeTarget = new ModelNode();
		
	if (elementTarget.getClass() == TransitionImpl.class) {
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("Transition");
			nodeTarget.attributes.put("name", ((Transition) elementTarget).getName()+"");
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
	for (StateVertex elementTarget : element.getSubvertex() ){
		ModelEdge edge = new ModelEdge();
		edge.name = "subvertex";
		ModelNode nodeTarget;
		
	if (! nodesMap.containsKey(elementTarget)) {
		nodeTarget = new ModelNode();
		
	if (elementTarget.getClass() == StateImpl.class) {
			nodeTarget.types.add("StateVertex");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("State");
			nodeTarget.attributes.put("name", ((State) elementTarget).getName()+"");
	}
	if (elementTarget.getClass() == CompositeStateImpl.class) {
			nodeTarget.types.add("StateVertex");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("CompositeState");
			nodeTarget.types.add("State");
			nodeTarget.attributes.put("name", ((CompositeState) elementTarget).getName()+"");
	}
	if (elementTarget.getClass() == ActionStateImpl.class) {
			nodeTarget.types.add("StateVertex");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("ActionState");
			nodeTarget.types.add("State");
			nodeTarget.attributes.put("name", ((ActionState) elementTarget).getName()+"");
			nodeTarget.attributes.put("isDynamic", ((ActionState) elementTarget).isIsDynamic()+"");
	}
	if (elementTarget.getClass() == PseudostateImpl.class) {
			nodeTarget.types.add("StateVertex");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("Pseudostate");
			nodeTarget.attributes.put("name", ((Pseudostate) elementTarget).getName()+"");
			nodeTarget.attributes.put("kind", ((Pseudostate) elementTarget).getKind()+"");
	}
	if (elementTarget.getClass() == ObjectFlowStateImpl.class) {
			nodeTarget.types.add("ObjectFlowState");
			nodeTarget.types.add("StateVertex");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("State");
			nodeTarget.attributes.put("name", ((ObjectFlowState) elementTarget).getName()+"");
	}
	if (elementTarget.getClass() == FinalStateImpl.class) {
			nodeTarget.types.add("StateVertex");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("State");
			nodeTarget.types.add("FinalState");
			nodeTarget.attributes.put("name", ((FinalState) elementTarget).getName()+"");
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
	for (Transition elementTarget : element.getIncoming() ){
		ModelEdge edge = new ModelEdge();
		edge.name = "incoming";
		ModelNode nodeTarget;
		
	if (! nodesMap.containsKey(elementTarget)) {
		nodeTarget = new ModelNode();
		
	if (elementTarget.getClass() == TransitionImpl.class) {
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("Transition");
			nodeTarget.attributes.put("name", ((Transition) elementTarget).getName()+"");
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
for (StateVertex child : element.getSubvertex()) {
	if (child.getClass() == StateImpl.class) {
		visitState((State)child);
	}
	if (child.getClass() == CompositeStateImpl.class) {
		visitCompositeState((CompositeState)child);
	}
	if (child.getClass() == ActionStateImpl.class) {
		visitActionState((ActionState)child);
	}
	if (child.getClass() == PseudostateImpl.class) {
		visitPseudostate((Pseudostate)child);
	}
	if (child.getClass() == ObjectFlowStateImpl.class) {
		visitObjectFlowState((ObjectFlowState)child);
	}
	if (child.getClass() == FinalStateImpl.class) {
		visitFinalState((FinalState)child);
	}
}
}
public void visitActionState(ActionState element){
	
	ModelNode node;
	
	if (! nodesMap.containsKey(element)) {
		node = new ModelNode();
		
	if (element.getClass() == ActionStateImpl.class) {
			node.types.add("StateVertex");
			node.types.add("ModelElement");
			node.types.add("ActionState");
			node.types.add("State");
			node.attributes.put("name", ((ActionState) element).getName()+"");
			node.attributes.put("isDynamic", ((ActionState) element).isIsDynamic()+"");
	}
		
		nodesMap.put(element, node);
	} else {
		node = nodesMap.get(element);
	}
	
	ModelPattern pattern = new ModelPattern();
	pattern.nodes.add(node);
	notifyListeners(pattern);
	for (Transition elementTarget : element.getOutgoing() ){
		ModelEdge edge = new ModelEdge();
		edge.name = "outgoing";
		ModelNode nodeTarget;
		
	if (! nodesMap.containsKey(elementTarget)) {
		nodeTarget = new ModelNode();
		
	if (elementTarget.getClass() == TransitionImpl.class) {
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("Transition");
			nodeTarget.attributes.put("name", ((Transition) elementTarget).getName()+"");
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
	for (Transition elementTarget : element.getIncoming() ){
		ModelEdge edge = new ModelEdge();
		edge.name = "incoming";
		ModelNode nodeTarget;
		
	if (! nodesMap.containsKey(elementTarget)) {
		nodeTarget = new ModelNode();
		
	if (elementTarget.getClass() == TransitionImpl.class) {
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("Transition");
			nodeTarget.attributes.put("name", ((Transition) elementTarget).getName()+"");
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
}
public void visitPseudostate(Pseudostate element){
	
	ModelNode node;
	
	if (! nodesMap.containsKey(element)) {
		node = new ModelNode();
		
	if (element.getClass() == PseudostateImpl.class) {
			node.types.add("StateVertex");
			node.types.add("ModelElement");
			node.types.add("Pseudostate");
			node.attributes.put("name", ((Pseudostate) element).getName()+"");
			node.attributes.put("kind", ((Pseudostate) element).getKind()+"");
	}
		
		nodesMap.put(element, node);
	} else {
		node = nodesMap.get(element);
	}
	
	ModelPattern pattern = new ModelPattern();
	pattern.nodes.add(node);
	notifyListeners(pattern);
	for (Transition elementTarget : element.getOutgoing() ){
		ModelEdge edge = new ModelEdge();
		edge.name = "outgoing";
		ModelNode nodeTarget;
		
	if (! nodesMap.containsKey(elementTarget)) {
		nodeTarget = new ModelNode();
		
	if (elementTarget.getClass() == TransitionImpl.class) {
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("Transition");
			nodeTarget.attributes.put("name", ((Transition) elementTarget).getName()+"");
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
	for (Transition elementTarget : element.getIncoming() ){
		ModelEdge edge = new ModelEdge();
		edge.name = "incoming";
		ModelNode nodeTarget;
		
	if (! nodesMap.containsKey(elementTarget)) {
		nodeTarget = new ModelNode();
		
	if (elementTarget.getClass() == TransitionImpl.class) {
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("Transition");
			nodeTarget.attributes.put("name", ((Transition) elementTarget).getName()+"");
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
}
public void visitObjectFlowState(ObjectFlowState element){
	
	ModelNode node;
	
	if (! nodesMap.containsKey(element)) {
		node = new ModelNode();
		
	if (element.getClass() == ObjectFlowStateImpl.class) {
			node.types.add("ObjectFlowState");
			node.types.add("StateVertex");
			node.types.add("ModelElement");
			node.types.add("State");
			node.attributes.put("name", ((ObjectFlowState) element).getName()+"");
	}
		
		nodesMap.put(element, node);
	} else {
		node = nodesMap.get(element);
	}
	
	ModelPattern pattern = new ModelPattern();
	pattern.nodes.add(node);
	notifyListeners(pattern);
	for (Transition elementTarget : element.getOutgoing() ){
		ModelEdge edge = new ModelEdge();
		edge.name = "outgoing";
		ModelNode nodeTarget;
		
	if (! nodesMap.containsKey(elementTarget)) {
		nodeTarget = new ModelNode();
		
	if (elementTarget.getClass() == TransitionImpl.class) {
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("Transition");
			nodeTarget.attributes.put("name", ((Transition) elementTarget).getName()+"");
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
	if (element.getType() != null) {
		ModelElement elementTarget = element.getType();
		ModelEdge modelEdge = new ModelEdge();
		modelEdge.name = "type";
		ModelNode nodeTarget;
		
	if (! nodesMap.containsKey(elementTarget)) {
		nodeTarget = new ModelNode();
		
	if (elementTarget.getClass() == ModelElementImpl.class) {
			nodeTarget.types.add("ModelElement");
			nodeTarget.attributes.put("name", ((ModelElement) elementTarget).getName()+"");
	}
	if (elementTarget.getClass() == StateMachineImpl.class) {
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("StateMachine");
			nodeTarget.attributes.put("name", ((StateMachine) elementTarget).getName()+"");
	}
	if (elementTarget.getClass() == ActivityGraphImpl.class) {
			nodeTarget.types.add("ActivityGraph");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("StateMachine");
			nodeTarget.attributes.put("name", ((ActivityGraph) elementTarget).getName()+"");
	}
	if (elementTarget.getClass() == PartitionImpl.class) {
			nodeTarget.types.add("Partition");
			nodeTarget.types.add("ModelElement");
			nodeTarget.attributes.put("name", ((Partition) elementTarget).getName()+"");
	}
	if (elementTarget.getClass() == StateImpl.class) {
			nodeTarget.types.add("StateVertex");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("State");
			nodeTarget.attributes.put("name", ((State) elementTarget).getName()+"");
	}
	if (elementTarget.getClass() == CompositeStateImpl.class) {
			nodeTarget.types.add("StateVertex");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("CompositeState");
			nodeTarget.types.add("State");
			nodeTarget.attributes.put("name", ((CompositeState) elementTarget).getName()+"");
	}
	if (elementTarget.getClass() == ActionStateImpl.class) {
			nodeTarget.types.add("StateVertex");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("ActionState");
			nodeTarget.types.add("State");
			nodeTarget.attributes.put("name", ((ActionState) elementTarget).getName()+"");
			nodeTarget.attributes.put("isDynamic", ((ActionState) elementTarget).isIsDynamic()+"");
	}
	if (elementTarget.getClass() == PseudostateImpl.class) {
			nodeTarget.types.add("StateVertex");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("Pseudostate");
			nodeTarget.attributes.put("name", ((Pseudostate) elementTarget).getName()+"");
			nodeTarget.attributes.put("kind", ((Pseudostate) elementTarget).getKind()+"");
	}
	if (elementTarget.getClass() == ObjectFlowStateImpl.class) {
			nodeTarget.types.add("ObjectFlowState");
			nodeTarget.types.add("StateVertex");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("State");
			nodeTarget.attributes.put("name", ((ObjectFlowState) elementTarget).getName()+"");
	}
	if (elementTarget.getClass() == FinalStateImpl.class) {
			nodeTarget.types.add("StateVertex");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("State");
			nodeTarget.types.add("FinalState");
			nodeTarget.attributes.put("name", ((FinalState) elementTarget).getName()+"");
	}
	if (elementTarget.getClass() == TransitionImpl.class) {
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("Transition");
			nodeTarget.attributes.put("name", ((Transition) elementTarget).getName()+"");
	}
	if (elementTarget.getClass() == GuardImpl.class) {
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("Guard");
			nodeTarget.attributes.put("name", ((Guard) elementTarget).getName()+"");
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
	for (Transition elementTarget : element.getIncoming() ){
		ModelEdge edge = new ModelEdge();
		edge.name = "incoming";
		ModelNode nodeTarget;
		
	if (! nodesMap.containsKey(elementTarget)) {
		nodeTarget = new ModelNode();
		
	if (elementTarget.getClass() == TransitionImpl.class) {
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("Transition");
			nodeTarget.attributes.put("name", ((Transition) elementTarget).getName()+"");
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
{
	ModelElement child = element.getType();
	if (child != null) {
	if (child.getClass() == ModelElementImpl.class) {
		visitModelElement((ModelElement)child);
	}
	if (child.getClass() == StateMachineImpl.class) {
		visitStateMachine((StateMachine)child);
	}
	if (child.getClass() == ActivityGraphImpl.class) {
		visitActivityGraph((ActivityGraph)child);
	}
	if (child.getClass() == PartitionImpl.class) {
		visitPartition((Partition)child);
	}
	if (child.getClass() == StateImpl.class) {
		visitState((State)child);
	}
	if (child.getClass() == CompositeStateImpl.class) {
		visitCompositeState((CompositeState)child);
	}
	if (child.getClass() == ActionStateImpl.class) {
		visitActionState((ActionState)child);
	}
	if (child.getClass() == PseudostateImpl.class) {
		visitPseudostate((Pseudostate)child);
	}
	if (child.getClass() == ObjectFlowStateImpl.class) {
		visitObjectFlowState((ObjectFlowState)child);
	}
	if (child.getClass() == FinalStateImpl.class) {
		visitFinalState((FinalState)child);
	}
	if (child.getClass() == TransitionImpl.class) {
		visitTransition((Transition)child);
	}
	if (child.getClass() == GuardImpl.class) {
		visitGuard((Guard)child);
	}
	}
}
}
public void visitFinalState(FinalState element){
	
	ModelNode node;
	
	if (! nodesMap.containsKey(element)) {
		node = new ModelNode();
		
	if (element.getClass() == FinalStateImpl.class) {
			node.types.add("StateVertex");
			node.types.add("ModelElement");
			node.types.add("State");
			node.types.add("FinalState");
			node.attributes.put("name", ((FinalState) element).getName()+"");
	}
		
		nodesMap.put(element, node);
	} else {
		node = nodesMap.get(element);
	}
	
	ModelPattern pattern = new ModelPattern();
	pattern.nodes.add(node);
	notifyListeners(pattern);
	for (Transition elementTarget : element.getOutgoing() ){
		ModelEdge edge = new ModelEdge();
		edge.name = "outgoing";
		ModelNode nodeTarget;
		
	if (! nodesMap.containsKey(elementTarget)) {
		nodeTarget = new ModelNode();
		
	if (elementTarget.getClass() == TransitionImpl.class) {
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("Transition");
			nodeTarget.attributes.put("name", ((Transition) elementTarget).getName()+"");
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
	for (Transition elementTarget : element.getIncoming() ){
		ModelEdge edge = new ModelEdge();
		edge.name = "incoming";
		ModelNode nodeTarget;
		
	if (! nodesMap.containsKey(elementTarget)) {
		nodeTarget = new ModelNode();
		
	if (elementTarget.getClass() == TransitionImpl.class) {
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("Transition");
			nodeTarget.attributes.put("name", ((Transition) elementTarget).getName()+"");
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
}
public void visitTransition(Transition element){
	
	ModelNode node;
	
	if (! nodesMap.containsKey(element)) {
		node = new ModelNode();
		
	if (element.getClass() == TransitionImpl.class) {
			node.types.add("ModelElement");
			node.types.add("Transition");
			node.attributes.put("name", ((Transition) element).getName()+"");
	}
		
		nodesMap.put(element, node);
	} else {
		node = nodesMap.get(element);
	}
	
	ModelPattern pattern = new ModelPattern();
	pattern.nodes.add(node);
	notifyListeners(pattern);
	if (element.getTarget() != null) {
		StateVertex elementTarget = element.getTarget();
		ModelEdge modelEdge = new ModelEdge();
		modelEdge.name = "target";
		ModelNode nodeTarget;
		
	if (! nodesMap.containsKey(elementTarget)) {
		nodeTarget = new ModelNode();
		
	if (elementTarget.getClass() == StateImpl.class) {
			nodeTarget.types.add("StateVertex");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("State");
			nodeTarget.attributes.put("name", ((State) elementTarget).getName()+"");
	}
	if (elementTarget.getClass() == CompositeStateImpl.class) {
			nodeTarget.types.add("StateVertex");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("CompositeState");
			nodeTarget.types.add("State");
			nodeTarget.attributes.put("name", ((CompositeState) elementTarget).getName()+"");
	}
	if (elementTarget.getClass() == ActionStateImpl.class) {
			nodeTarget.types.add("StateVertex");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("ActionState");
			nodeTarget.types.add("State");
			nodeTarget.attributes.put("name", ((ActionState) elementTarget).getName()+"");
			nodeTarget.attributes.put("isDynamic", ((ActionState) elementTarget).isIsDynamic()+"");
	}
	if (elementTarget.getClass() == PseudostateImpl.class) {
			nodeTarget.types.add("StateVertex");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("Pseudostate");
			nodeTarget.attributes.put("name", ((Pseudostate) elementTarget).getName()+"");
			nodeTarget.attributes.put("kind", ((Pseudostate) elementTarget).getKind()+"");
	}
	if (elementTarget.getClass() == ObjectFlowStateImpl.class) {
			nodeTarget.types.add("ObjectFlowState");
			nodeTarget.types.add("StateVertex");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("State");
			nodeTarget.attributes.put("name", ((ObjectFlowState) elementTarget).getName()+"");
	}
	if (elementTarget.getClass() == FinalStateImpl.class) {
			nodeTarget.types.add("StateVertex");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("State");
			nodeTarget.types.add("FinalState");
			nodeTarget.attributes.put("name", ((FinalState) elementTarget).getName()+"");
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
	if (element.getSource() != null) {
		StateVertex elementTarget = element.getSource();
		ModelEdge modelEdge = new ModelEdge();
		modelEdge.name = "source";
		ModelNode nodeTarget;
		
	if (! nodesMap.containsKey(elementTarget)) {
		nodeTarget = new ModelNode();
		
	if (elementTarget.getClass() == StateImpl.class) {
			nodeTarget.types.add("StateVertex");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("State");
			nodeTarget.attributes.put("name", ((State) elementTarget).getName()+"");
	}
	if (elementTarget.getClass() == CompositeStateImpl.class) {
			nodeTarget.types.add("StateVertex");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("CompositeState");
			nodeTarget.types.add("State");
			nodeTarget.attributes.put("name", ((CompositeState) elementTarget).getName()+"");
	}
	if (elementTarget.getClass() == ActionStateImpl.class) {
			nodeTarget.types.add("StateVertex");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("ActionState");
			nodeTarget.types.add("State");
			nodeTarget.attributes.put("name", ((ActionState) elementTarget).getName()+"");
			nodeTarget.attributes.put("isDynamic", ((ActionState) elementTarget).isIsDynamic()+"");
	}
	if (elementTarget.getClass() == PseudostateImpl.class) {
			nodeTarget.types.add("StateVertex");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("Pseudostate");
			nodeTarget.attributes.put("name", ((Pseudostate) elementTarget).getName()+"");
			nodeTarget.attributes.put("kind", ((Pseudostate) elementTarget).getKind()+"");
	}
	if (elementTarget.getClass() == ObjectFlowStateImpl.class) {
			nodeTarget.types.add("ObjectFlowState");
			nodeTarget.types.add("StateVertex");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("State");
			nodeTarget.attributes.put("name", ((ObjectFlowState) elementTarget).getName()+"");
	}
	if (elementTarget.getClass() == FinalStateImpl.class) {
			nodeTarget.types.add("StateVertex");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("State");
			nodeTarget.types.add("FinalState");
			nodeTarget.attributes.put("name", ((FinalState) elementTarget).getName()+"");
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
	if (element.getGuard() != null) {
		Guard elementTarget = element.getGuard();
		ModelEdge modelEdge = new ModelEdge();
		modelEdge.name = "guard";
		ModelNode nodeTarget;
		
	if (! nodesMap.containsKey(elementTarget)) {
		nodeTarget = new ModelNode();
		
	if (elementTarget.getClass() == GuardImpl.class) {
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("Guard");
			nodeTarget.attributes.put("name", ((Guard) elementTarget).getName()+"");
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
{
	Guard child = element.getGuard();
	if (child != null) {
	if (child.getClass() == GuardImpl.class) {
		visitGuard((Guard)child);
	}
	}
}
}
public void visitGuard(Guard element){
	
	ModelNode node;
	
	if (! nodesMap.containsKey(element)) {
		node = new ModelNode();
		
	if (element.getClass() == GuardImpl.class) {
			node.types.add("ModelElement");
			node.types.add("Guard");
			node.attributes.put("name", ((Guard) element).getName()+"");
	}
		
		nodesMap.put(element, node);
	} else {
		node = nodesMap.get(element);
	}
	
	ModelPattern pattern = new ModelPattern();
	pattern.nodes.add(node);
	notifyListeners(pattern);
	if (element.getExpression() != null) {
		BooleanExpression elementTarget = element.getExpression();
		ModelEdge modelEdge = new ModelEdge();
		modelEdge.name = "expression";
		ModelNode nodeTarget;
		
	if (! nodesMap.containsKey(elementTarget)) {
		nodeTarget = new ModelNode();
		
	if (elementTarget.getClass() == BooleanExpressionImpl.class) {
			nodeTarget.types.add("BooleanExpression");
			nodeTarget.attributes.put("language", ((BooleanExpression) elementTarget).getLanguage()+"");
			nodeTarget.attributes.put("body", ((BooleanExpression) elementTarget).getBody()+"");
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
{
	BooleanExpression child = element.getExpression();
	if (child != null) {
	if (child.getClass() == BooleanExpressionImpl.class) {
		visitBooleanExpression((BooleanExpression)child);
	}
	}
}
}
public void visitBooleanExpression(BooleanExpression element){
	
	ModelNode node;
	
	if (! nodesMap.containsKey(element)) {
		node = new ModelNode();
		
	if (element.getClass() == BooleanExpressionImpl.class) {
			node.types.add("BooleanExpression");
			node.attributes.put("language", ((BooleanExpression) element).getLanguage()+"");
			node.attributes.put("body", ((BooleanExpression) element).getBody()+"");
	}
		
		nodesMap.put(element, node);
	} else {
		node = nodesMap.get(element);
	}
	
	ModelPattern pattern = new ModelPattern();
	pattern.nodes.add(node);
	notifyListeners(pattern);
}
public void visitRootActivityGraph(RootActivityGraph element){
	
	ModelNode node;
	
	if (! nodesMap.containsKey(element)) {
		node = new ModelNode();
		
	if (element.getClass() == RootActivityGraphImpl.class) {
			node.types.add("RootActivityGraph");
			node.attributes.put("name", ((RootActivityGraph) element).getName()+"");
	}
		
		nodesMap.put(element, node);
	} else {
		node = nodesMap.get(element);
	}
	
	ModelPattern pattern = new ModelPattern();
	pattern.nodes.add(node);
	notifyListeners(pattern);
	if (element.getTop() != null) {
		State elementTarget = element.getTop();
		ModelEdge modelEdge = new ModelEdge();
		modelEdge.name = "top";
		ModelNode nodeTarget;
		
	if (! nodesMap.containsKey(elementTarget)) {
		nodeTarget = new ModelNode();
		
	if (elementTarget.getClass() == StateImpl.class) {
			nodeTarget.types.add("StateVertex");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("State");
			nodeTarget.attributes.put("name", ((State) elementTarget).getName()+"");
	}
	if (elementTarget.getClass() == CompositeStateImpl.class) {
			nodeTarget.types.add("StateVertex");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("CompositeState");
			nodeTarget.types.add("State");
			nodeTarget.attributes.put("name", ((CompositeState) elementTarget).getName()+"");
	}
	if (elementTarget.getClass() == ActionStateImpl.class) {
			nodeTarget.types.add("StateVertex");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("ActionState");
			nodeTarget.types.add("State");
			nodeTarget.attributes.put("name", ((ActionState) elementTarget).getName()+"");
			nodeTarget.attributes.put("isDynamic", ((ActionState) elementTarget).isIsDynamic()+"");
	}
	if (elementTarget.getClass() == ObjectFlowStateImpl.class) {
			nodeTarget.types.add("ObjectFlowState");
			nodeTarget.types.add("StateVertex");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("State");
			nodeTarget.attributes.put("name", ((ObjectFlowState) elementTarget).getName()+"");
	}
	if (elementTarget.getClass() == FinalStateImpl.class) {
			nodeTarget.types.add("StateVertex");
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("State");
			nodeTarget.types.add("FinalState");
			nodeTarget.attributes.put("name", ((FinalState) elementTarget).getName()+"");
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
	for (Partition elementTarget : element.getPartition() ){
		ModelEdge edge = new ModelEdge();
		edge.name = "partition";
		ModelNode nodeTarget;
		
	if (! nodesMap.containsKey(elementTarget)) {
		nodeTarget = new ModelNode();
		
	if (elementTarget.getClass() == PartitionImpl.class) {
			nodeTarget.types.add("Partition");
			nodeTarget.types.add("ModelElement");
			nodeTarget.attributes.put("name", ((Partition) elementTarget).getName()+"");
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
	for (Transition elementTarget : element.getTransitions() ){
		ModelEdge edge = new ModelEdge();
		edge.name = "transitions";
		ModelNode nodeTarget;
		
	if (! nodesMap.containsKey(elementTarget)) {
		nodeTarget = new ModelNode();
		
	if (elementTarget.getClass() == TransitionImpl.class) {
			nodeTarget.types.add("ModelElement");
			nodeTarget.types.add("Transition");
			nodeTarget.attributes.put("name", ((Transition) elementTarget).getName()+"");
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
{
	State child = element.getTop();
	if (child != null) {
	if (child.getClass() == StateImpl.class) {
		visitState((State)child);
	}
	if (child.getClass() == CompositeStateImpl.class) {
		visitCompositeState((CompositeState)child);
	}
	if (child.getClass() == ActionStateImpl.class) {
		visitActionState((ActionState)child);
	}
	if (child.getClass() == ObjectFlowStateImpl.class) {
		visitObjectFlowState((ObjectFlowState)child);
	}
	if (child.getClass() == FinalStateImpl.class) {
		visitFinalState((FinalState)child);
	}
	}
}
for (Partition child : element.getPartition()) {
	if (child.getClass() == PartitionImpl.class) {
		visitPartition((Partition)child);
	}
}
for (Transition child : element.getTransitions()) {
	if (child.getClass() == TransitionImpl.class) {
		visitTransition((Transition)child);
	}
}
}


}
