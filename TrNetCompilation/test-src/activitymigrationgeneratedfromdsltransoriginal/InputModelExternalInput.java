package activitymigrationgeneratedfromdsltransoriginal;

import java.util.LinkedList;
import generic.*;

public class InputModelExternalInput
implements ModelPatternListener
	,TrNetPat1InstancePublisher
	,TrNetPat48InstancePublisher
	,TrNetPat53InstancePublisher
	,TrNetPat139InstancePublisher
	,TrNetPat140InstancePublisher
	,TrNetPat145InstancePublisher
	,TrNetPat146InstancePublisher
	,TrNetPat151InstancePublisher
	,TrNetPat152InstancePublisher
	,TrNetPat157InstancePublisher
	,TrNetPat158InstancePublisher
	,TrNetPat163InstancePublisher
	,TrNetPat164InstancePublisher
	,TrNetPat169InstancePublisher
	,TrNetPat170InstancePublisher
	,TrNetPat175InstancePublisher
	,TrNetPat176InstancePublisher
	,TrNetPat181InstancePublisher
	,TrNetPat182InstancePublisher
	,TrNetPat187InstancePublisher
	,TrNetPat188InstancePublisher
	,TrNetPat193InstancePublisher
	,TrNetPat194InstancePublisher
	,TrNetPat270InstancePublisher
	,TrNetPat271InstancePublisher
	,TrNetPat276InstancePublisher
	,TrNetPat277InstancePublisher
	,TrNetPat282InstancePublisher
	,TrNetPat283InstancePublisher
	,TrNetPat288InstancePublisher
	,TrNetPat289InstancePublisher
	,TrNetPat294InstancePublisher
	,TrNetPat295InstancePublisher
	,TrNetPat300InstancePublisher
	,TrNetPat301InstancePublisher
	,TrNetPat306InstancePublisher
	,TrNetPat307InstancePublisher
	,TrNetPat312InstancePublisher
	,TrNetPat313InstancePublisher
	,TrNetPat318InstancePublisher
	,TrNetPat319InstancePublisher
	,TrNetPat324InstancePublisher
	,TrNetPat325InstancePublisher
	,TrNetPat330InstancePublisher
	,TrNetPat331InstancePublisher
	,TrNetPat336InstancePublisher
	,TrNetPat337InstancePublisher
	,TrNetPat342InstancePublisher
	,TrNetPat343InstancePublisher
	,TrNetPat348InstancePublisher
	,TrNetPat349InstancePublisher
	,TrNetPat354InstancePublisher
	,TrNetPat355InstancePublisher
	,TrNetPat360InstancePublisher
	,TrNetPat361InstancePublisher
	,TrNetPat369InstancePublisher
	,TrNetPat378InstancePublisher
	,TrNetPat387InstancePublisher
	,TrNetPat396InstancePublisher
	,TrNetPat405InstancePublisher
	,TrNetPat414InstancePublisher
	,TrNetPat423InstancePublisher
	,TrNetPat432InstancePublisher
	,TrNetPat433InstancePublisher
	,TrNetPat434InstancePublisher
	,TrNetPat435InstancePublisher
	,TrNetPat436InstancePublisher
	,TrNetPat437InstancePublisher
	,TrNetPat438InstancePublisher
	,TrNetPat439InstancePublisher
	,TrNetPat440InstancePublisher
	,TrNetPat441InstancePublisher
	,TrNetPat442InstancePublisher
	,TrNetPat443InstancePublisher
	,TrNetPat444InstancePublisher
	,TrNetPat445InstancePublisher
	,TrNetPat446InstancePublisher
	,TrNetPat447InstancePublisher
	,TrNetPat448InstancePublisher
	,TrNetPat449InstancePublisher
	,TrNetPat450InstancePublisher
	,TrNetPat451InstancePublisher
	,TrNetPat452InstancePublisher
	,TrNetPat453InstancePublisher
	,TrNetPat454InstancePublisher
	,TrNetPat455InstancePublisher
	,TrNetPat456InstancePublisher
	,TrNetPat457InstancePublisher
	,TrNetPat458InstancePublisher
	,TrNetPat459InstancePublisher
	,TrNetPat460InstancePublisher
	,TrNetPat461InstancePublisher
	,TrNetPat462InstancePublisher
	,TrNetPat463InstancePublisher
	,TrNetPat464InstancePublisher
	,TrNetPat465InstancePublisher
	,TrNetPat466InstancePublisher
	,TrNetPat467InstancePublisher
	,TrNetPat468InstancePublisher
	,TrNetPat469InstancePublisher
	,TrNetPat470InstancePublisher
	,TrNetPat471InstancePublisher
{

public void notify(ModelPattern element){
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("top") && elementNodeSource.types.contains("ActivityGraph") && elementNodeTarget.types.contains("CompositeState")){
			TrNetPat1Instance patternInstance = new TrNetPat1Instance();			
			patternInstance.activityGraph0 = elementNodeSource;
			patternInstance.compositeState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 1 && element.edges.size() == 0) {
		ModelNode elementNode = element.nodes.get(0);
		if (elementNode.types.contains("Partition")){
			TrNetPat48Instance patternInstance = new TrNetPat48Instance();
			patternInstance.partition0 = elementNode;
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("source") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("ObjectFlowState")){
			TrNetPat53Instance patternInstance = new TrNetPat53Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.objectFlowState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("target") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("Pseudostate")){
			TrNetPat139Instance patternInstance = new TrNetPat139Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.pseudostate0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("source") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("ObjectFlowState")){
			TrNetPat140Instance patternInstance = new TrNetPat140Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.objectFlowState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("target") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("ObjectFlowState")){
			TrNetPat145Instance patternInstance = new TrNetPat145Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.objectFlowState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("source") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("ObjectFlowState")){
			TrNetPat146Instance patternInstance = new TrNetPat146Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.objectFlowState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("target") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("ActionState")){
			TrNetPat151Instance patternInstance = new TrNetPat151Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.actionState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("source") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("ObjectFlowState")){
			TrNetPat152Instance patternInstance = new TrNetPat152Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.objectFlowState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("target") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("FinalState")){
			TrNetPat157Instance patternInstance = new TrNetPat157Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.finalState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("source") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("ObjectFlowState")){
			TrNetPat158Instance patternInstance = new TrNetPat158Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.objectFlowState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("target") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("CompositeState")){
			TrNetPat163Instance patternInstance = new TrNetPat163Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.compositeState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("target") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("ObjectFlowState")){
			TrNetPat164Instance patternInstance = new TrNetPat164Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.objectFlowState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("source") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("ObjectFlowState")){
			TrNetPat169Instance patternInstance = new TrNetPat169Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.objectFlowState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("target") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("ObjectFlowState")){
			TrNetPat170Instance patternInstance = new TrNetPat170Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.objectFlowState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("source") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("FinalState")){
			TrNetPat175Instance patternInstance = new TrNetPat175Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.finalState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("target") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("ObjectFlowState")){
			TrNetPat176Instance patternInstance = new TrNetPat176Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.objectFlowState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("source") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("ActionState")){
			TrNetPat181Instance patternInstance = new TrNetPat181Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.actionState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("target") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("ObjectFlowState")){
			TrNetPat182Instance patternInstance = new TrNetPat182Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.objectFlowState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("source") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("CompositeState")){
			TrNetPat187Instance patternInstance = new TrNetPat187Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.compositeState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("target") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("ObjectFlowState")){
			TrNetPat188Instance patternInstance = new TrNetPat188Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.objectFlowState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("source") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("Pseudostate")){
			TrNetPat193Instance patternInstance = new TrNetPat193Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.pseudostate0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("source") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("Pseudostate")){
			TrNetPat194Instance patternInstance = new TrNetPat194Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.pseudostate0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("target") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("Pseudostate")){
			TrNetPat270Instance patternInstance = new TrNetPat270Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.pseudostate0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("source") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("Pseudostate")){
			TrNetPat271Instance patternInstance = new TrNetPat271Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.pseudostate0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("target") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("ActionState")){
			TrNetPat276Instance patternInstance = new TrNetPat276Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.actionState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("source") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("Pseudostate")){
			TrNetPat277Instance patternInstance = new TrNetPat277Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.pseudostate0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("target") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("FinalState")){
			TrNetPat282Instance patternInstance = new TrNetPat282Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.finalState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("source") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("Pseudostate")){
			TrNetPat283Instance patternInstance = new TrNetPat283Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.pseudostate0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("target") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("CompositeState")){
			TrNetPat288Instance patternInstance = new TrNetPat288Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.compositeState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("source") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("ActionState")){
			TrNetPat289Instance patternInstance = new TrNetPat289Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.actionState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("target") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("Pseudostate")){
			TrNetPat294Instance patternInstance = new TrNetPat294Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.pseudostate0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("source") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("ActionState")){
			TrNetPat295Instance patternInstance = new TrNetPat295Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.actionState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("target") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("ActionState")){
			TrNetPat300Instance patternInstance = new TrNetPat300Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.actionState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("source") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("ActionState")){
			TrNetPat301Instance patternInstance = new TrNetPat301Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.actionState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("target") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("FinalState")){
			TrNetPat306Instance patternInstance = new TrNetPat306Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.finalState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("source") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("ActionState")){
			TrNetPat307Instance patternInstance = new TrNetPat307Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.actionState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("target") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("CompositeState")){
			TrNetPat312Instance patternInstance = new TrNetPat312Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.compositeState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("source") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("FinalState")){
			TrNetPat313Instance patternInstance = new TrNetPat313Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.finalState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("target") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("FinalState")){
			TrNetPat318Instance patternInstance = new TrNetPat318Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.finalState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("source") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("FinalState")){
			TrNetPat319Instance patternInstance = new TrNetPat319Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.finalState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("target") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("ActionState")){
			TrNetPat324Instance patternInstance = new TrNetPat324Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.actionState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("source") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("FinalState")){
			TrNetPat325Instance patternInstance = new TrNetPat325Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.finalState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("target") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("CompositeState")){
			TrNetPat330Instance patternInstance = new TrNetPat330Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.compositeState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("source") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("FinalState")){
			TrNetPat331Instance patternInstance = new TrNetPat331Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.finalState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("target") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("Pseudostate")){
			TrNetPat336Instance patternInstance = new TrNetPat336Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.pseudostate0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("source") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("CompositeState")){
			TrNetPat337Instance patternInstance = new TrNetPat337Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.compositeState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("target") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("ActionState")){
			TrNetPat342Instance patternInstance = new TrNetPat342Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.actionState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("source") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("CompositeState")){
			TrNetPat343Instance patternInstance = new TrNetPat343Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.compositeState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("target") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("CompositeState")){
			TrNetPat348Instance patternInstance = new TrNetPat348Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.compositeState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("source") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("CompositeState")){
			TrNetPat349Instance patternInstance = new TrNetPat349Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.compositeState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("target") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("Pseudostate")){
			TrNetPat354Instance patternInstance = new TrNetPat354Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.pseudostate0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("source") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("CompositeState")){
			TrNetPat355Instance patternInstance = new TrNetPat355Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.compositeState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("target") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("FinalState")){
			TrNetPat360Instance patternInstance = new TrNetPat360Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.finalState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("expression") && elementNodeSource.types.contains("Guard") && elementNodeTarget.types.contains("BooleanExpression")){
			TrNetPat361Instance patternInstance = new TrNetPat361Instance();			
			patternInstance.guard0 = elementNodeSource;
			patternInstance.booleanExpression0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 1 && element.edges.size() == 0) {
		ModelNode elementNode = element.nodes.get(0);
		if (elementNode.types.contains("ActionState")){
			TrNetPat369Instance patternInstance = new TrNetPat369Instance();
			patternInstance.actionState0 = elementNode;
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 1 && element.edges.size() == 0) {
		ModelNode elementNode = element.nodes.get(0);
		if (elementNode.types.contains("FinalState")){
			TrNetPat378Instance patternInstance = new TrNetPat378Instance();
			patternInstance.finalState0 = elementNode;
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 1 && element.edges.size() == 0) {
		ModelNode elementNode = element.nodes.get(0);
		if (elementNode.types.contains("ObjectFlowState")){
			TrNetPat387Instance patternInstance = new TrNetPat387Instance();
			patternInstance.objectFlowState0 = elementNode;
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 1 && element.edges.size() == 0) {
		ModelNode elementNode = element.nodes.get(0);
		if (elementNode.types.contains("Pseudostate")){
			TrNetPat396Instance patternInstance = new TrNetPat396Instance();
			patternInstance.pseudostate0 = elementNode;
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 1 && element.edges.size() == 0) {
		ModelNode elementNode = element.nodes.get(0);
		if (elementNode.types.contains("Pseudostate")){
			TrNetPat405Instance patternInstance = new TrNetPat405Instance();
			patternInstance.pseudostate0 = elementNode;
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 1 && element.edges.size() == 0) {
		ModelNode elementNode = element.nodes.get(0);
		if (elementNode.types.contains("Pseudostate")){
			TrNetPat414Instance patternInstance = new TrNetPat414Instance();
			patternInstance.pseudostate0 = elementNode;
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 1 && element.edges.size() == 0) {
		ModelNode elementNode = element.nodes.get(0);
		if (elementNode.types.contains("Pseudostate")){
			TrNetPat423Instance patternInstance = new TrNetPat423Instance();
			patternInstance.pseudostate0 = elementNode;
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("partition") && elementNodeSource.types.contains("ActivityGraph") && elementNodeTarget.types.contains("Partition")){
			TrNetPat432Instance patternInstance = new TrNetPat432Instance();			
			patternInstance.activityGraph0 = elementNodeSource;
			patternInstance.partition0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("transitions") && elementNodeSource.types.contains("ActivityGraph") && elementNodeTarget.types.contains("Transition")){
			TrNetPat433Instance patternInstance = new TrNetPat433Instance();			
			patternInstance.activityGraph0 = elementNodeSource;
			patternInstance.transition0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("transitions") && elementNodeSource.types.contains("ActivityGraph") && elementNodeTarget.types.contains("Transition")){
			TrNetPat434Instance patternInstance = new TrNetPat434Instance();			
			patternInstance.activityGraph0 = elementNodeSource;
			patternInstance.transition0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("guard") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("Guard")){
			TrNetPat435Instance patternInstance = new TrNetPat435Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.guard0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("guard") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("Guard")){
			TrNetPat436Instance patternInstance = new TrNetPat436Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.guard0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("subvertex") && elementNodeSource.types.contains("CompositeState") && elementNodeTarget.types.contains("ActionState")){
			TrNetPat437Instance patternInstance = new TrNetPat437Instance();			
			patternInstance.compositeState0 = elementNodeSource;
			patternInstance.actionState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("subvertex") && elementNodeSource.types.contains("CompositeState") && elementNodeTarget.types.contains("FinalState")){
			TrNetPat438Instance patternInstance = new TrNetPat438Instance();			
			patternInstance.compositeState0 = elementNodeSource;
			patternInstance.finalState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("subvertex") && elementNodeSource.types.contains("CompositeState") && elementNodeTarget.types.contains("ObjectFlowState")){
			TrNetPat439Instance patternInstance = new TrNetPat439Instance();			
			patternInstance.compositeState0 = elementNodeSource;
			patternInstance.objectFlowState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("subvertex") && elementNodeSource.types.contains("CompositeState") && elementNodeTarget.types.contains("Pseudostate")){
			TrNetPat440Instance patternInstance = new TrNetPat440Instance();			
			patternInstance.compositeState0 = elementNodeSource;
			patternInstance.pseudostate0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("subvertex") && elementNodeSource.types.contains("CompositeState") && elementNodeTarget.types.contains("Pseudostate")){
			TrNetPat441Instance patternInstance = new TrNetPat441Instance();			
			patternInstance.compositeState0 = elementNodeSource;
			patternInstance.pseudostate0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("subvertex") && elementNodeSource.types.contains("CompositeState") && elementNodeTarget.types.contains("Pseudostate")){
			TrNetPat442Instance patternInstance = new TrNetPat442Instance();			
			patternInstance.compositeState0 = elementNodeSource;
			patternInstance.pseudostate0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("subvertex") && elementNodeSource.types.contains("CompositeState") && elementNodeTarget.types.contains("Pseudostate")){
			TrNetPat443Instance patternInstance = new TrNetPat443Instance();			
			patternInstance.compositeState0 = elementNodeSource;
			patternInstance.pseudostate0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("source") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("ObjectFlowState")){
			TrNetPat444Instance patternInstance = new TrNetPat444Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.objectFlowState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("target") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("ObjectFlowState")){
			TrNetPat445Instance patternInstance = new TrNetPat445Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.objectFlowState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("source") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("ActionState")){
			TrNetPat446Instance patternInstance = new TrNetPat446Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.actionState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("target") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("ActionState")){
			TrNetPat447Instance patternInstance = new TrNetPat447Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.actionState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("source") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("FinalState")){
			TrNetPat448Instance patternInstance = new TrNetPat448Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.finalState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("target") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("FinalState")){
			TrNetPat449Instance patternInstance = new TrNetPat449Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.finalState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("source") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("Pseudostate")){
			TrNetPat450Instance patternInstance = new TrNetPat450Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.pseudostate0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("target") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("Pseudostate")){
			TrNetPat451Instance patternInstance = new TrNetPat451Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.pseudostate0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("source") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("Pseudostate")){
			TrNetPat452Instance patternInstance = new TrNetPat452Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.pseudostate0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("target") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("Pseudostate")){
			TrNetPat453Instance patternInstance = new TrNetPat453Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.pseudostate0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("source") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("Pseudostate")){
			TrNetPat454Instance patternInstance = new TrNetPat454Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.pseudostate0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("target") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("Pseudostate")){
			TrNetPat455Instance patternInstance = new TrNetPat455Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.pseudostate0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("source") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("Pseudostate")){
			TrNetPat456Instance patternInstance = new TrNetPat456Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.pseudostate0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("target") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("Pseudostate")){
			TrNetPat457Instance patternInstance = new TrNetPat457Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.pseudostate0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("target") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("Pseudostate")){
			TrNetPat458Instance patternInstance = new TrNetPat458Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.pseudostate0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("source") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("Pseudostate")){
			TrNetPat459Instance patternInstance = new TrNetPat459Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.pseudostate0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("source") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("Pseudostate")){
			TrNetPat460Instance patternInstance = new TrNetPat460Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.pseudostate0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("source") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("FinalState")){
			TrNetPat461Instance patternInstance = new TrNetPat461Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.finalState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("target") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("ActionState")){
			TrNetPat462Instance patternInstance = new TrNetPat462Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.actionState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("source") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("Pseudostate")){
			TrNetPat463Instance patternInstance = new TrNetPat463Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.pseudostate0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("target") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("Pseudostate")){
			TrNetPat464Instance patternInstance = new TrNetPat464Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.pseudostate0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("target") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("ObjectFlowState")){
			TrNetPat465Instance patternInstance = new TrNetPat465Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.objectFlowState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("source") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("ActionState")){
			TrNetPat466Instance patternInstance = new TrNetPat466Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.actionState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("target") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("Pseudostate")){
			TrNetPat467Instance patternInstance = new TrNetPat467Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.pseudostate0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("source") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("Pseudostate")){
			TrNetPat468Instance patternInstance = new TrNetPat468Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.pseudostate0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("target") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("FinalState")){
			TrNetPat469Instance patternInstance = new TrNetPat469Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.finalState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("target") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("Pseudostate")){
			TrNetPat470Instance patternInstance = new TrNetPat470Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.pseudostate0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("source") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("ObjectFlowState")){
			TrNetPat471Instance patternInstance = new TrNetPat471Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.objectFlowState0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
}

	
	LinkedList<TrNetPat1InstanceListener> listenersTrNetPat1Instance;

	public void registerListener(TrNetPat1InstanceListener listener){
		listenersTrNetPat1Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat1Instance element){
		for (TrNetPat1InstanceListener listener : listenersTrNetPat1Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat48InstanceListener> listenersTrNetPat48Instance;

	public void registerListener(TrNetPat48InstanceListener listener){
		listenersTrNetPat48Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat48Instance element){
		for (TrNetPat48InstanceListener listener : listenersTrNetPat48Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat53InstanceListener> listenersTrNetPat53Instance;

	public void registerListener(TrNetPat53InstanceListener listener){
		listenersTrNetPat53Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat53Instance element){
		for (TrNetPat53InstanceListener listener : listenersTrNetPat53Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat139InstanceListener> listenersTrNetPat139Instance;

	public void registerListener(TrNetPat139InstanceListener listener){
		listenersTrNetPat139Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat139Instance element){
		for (TrNetPat139InstanceListener listener : listenersTrNetPat139Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat140InstanceListener> listenersTrNetPat140Instance;

	public void registerListener(TrNetPat140InstanceListener listener){
		listenersTrNetPat140Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat140Instance element){
		for (TrNetPat140InstanceListener listener : listenersTrNetPat140Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat145InstanceListener> listenersTrNetPat145Instance;

	public void registerListener(TrNetPat145InstanceListener listener){
		listenersTrNetPat145Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat145Instance element){
		for (TrNetPat145InstanceListener listener : listenersTrNetPat145Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat146InstanceListener> listenersTrNetPat146Instance;

	public void registerListener(TrNetPat146InstanceListener listener){
		listenersTrNetPat146Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat146Instance element){
		for (TrNetPat146InstanceListener listener : listenersTrNetPat146Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat151InstanceListener> listenersTrNetPat151Instance;

	public void registerListener(TrNetPat151InstanceListener listener){
		listenersTrNetPat151Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat151Instance element){
		for (TrNetPat151InstanceListener listener : listenersTrNetPat151Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat152InstanceListener> listenersTrNetPat152Instance;

	public void registerListener(TrNetPat152InstanceListener listener){
		listenersTrNetPat152Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat152Instance element){
		for (TrNetPat152InstanceListener listener : listenersTrNetPat152Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat157InstanceListener> listenersTrNetPat157Instance;

	public void registerListener(TrNetPat157InstanceListener listener){
		listenersTrNetPat157Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat157Instance element){
		for (TrNetPat157InstanceListener listener : listenersTrNetPat157Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat158InstanceListener> listenersTrNetPat158Instance;

	public void registerListener(TrNetPat158InstanceListener listener){
		listenersTrNetPat158Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat158Instance element){
		for (TrNetPat158InstanceListener listener : listenersTrNetPat158Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat163InstanceListener> listenersTrNetPat163Instance;

	public void registerListener(TrNetPat163InstanceListener listener){
		listenersTrNetPat163Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat163Instance element){
		for (TrNetPat163InstanceListener listener : listenersTrNetPat163Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat164InstanceListener> listenersTrNetPat164Instance;

	public void registerListener(TrNetPat164InstanceListener listener){
		listenersTrNetPat164Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat164Instance element){
		for (TrNetPat164InstanceListener listener : listenersTrNetPat164Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat169InstanceListener> listenersTrNetPat169Instance;

	public void registerListener(TrNetPat169InstanceListener listener){
		listenersTrNetPat169Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat169Instance element){
		for (TrNetPat169InstanceListener listener : listenersTrNetPat169Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat170InstanceListener> listenersTrNetPat170Instance;

	public void registerListener(TrNetPat170InstanceListener listener){
		listenersTrNetPat170Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat170Instance element){
		for (TrNetPat170InstanceListener listener : listenersTrNetPat170Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat175InstanceListener> listenersTrNetPat175Instance;

	public void registerListener(TrNetPat175InstanceListener listener){
		listenersTrNetPat175Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat175Instance element){
		for (TrNetPat175InstanceListener listener : listenersTrNetPat175Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat176InstanceListener> listenersTrNetPat176Instance;

	public void registerListener(TrNetPat176InstanceListener listener){
		listenersTrNetPat176Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat176Instance element){
		for (TrNetPat176InstanceListener listener : listenersTrNetPat176Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat181InstanceListener> listenersTrNetPat181Instance;

	public void registerListener(TrNetPat181InstanceListener listener){
		listenersTrNetPat181Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat181Instance element){
		for (TrNetPat181InstanceListener listener : listenersTrNetPat181Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat182InstanceListener> listenersTrNetPat182Instance;

	public void registerListener(TrNetPat182InstanceListener listener){
		listenersTrNetPat182Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat182Instance element){
		for (TrNetPat182InstanceListener listener : listenersTrNetPat182Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat187InstanceListener> listenersTrNetPat187Instance;

	public void registerListener(TrNetPat187InstanceListener listener){
		listenersTrNetPat187Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat187Instance element){
		for (TrNetPat187InstanceListener listener : listenersTrNetPat187Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat188InstanceListener> listenersTrNetPat188Instance;

	public void registerListener(TrNetPat188InstanceListener listener){
		listenersTrNetPat188Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat188Instance element){
		for (TrNetPat188InstanceListener listener : listenersTrNetPat188Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat193InstanceListener> listenersTrNetPat193Instance;

	public void registerListener(TrNetPat193InstanceListener listener){
		listenersTrNetPat193Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat193Instance element){
		for (TrNetPat193InstanceListener listener : listenersTrNetPat193Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat194InstanceListener> listenersTrNetPat194Instance;

	public void registerListener(TrNetPat194InstanceListener listener){
		listenersTrNetPat194Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat194Instance element){
		for (TrNetPat194InstanceListener listener : listenersTrNetPat194Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat270InstanceListener> listenersTrNetPat270Instance;

	public void registerListener(TrNetPat270InstanceListener listener){
		listenersTrNetPat270Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat270Instance element){
		for (TrNetPat270InstanceListener listener : listenersTrNetPat270Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat271InstanceListener> listenersTrNetPat271Instance;

	public void registerListener(TrNetPat271InstanceListener listener){
		listenersTrNetPat271Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat271Instance element){
		for (TrNetPat271InstanceListener listener : listenersTrNetPat271Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat276InstanceListener> listenersTrNetPat276Instance;

	public void registerListener(TrNetPat276InstanceListener listener){
		listenersTrNetPat276Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat276Instance element){
		for (TrNetPat276InstanceListener listener : listenersTrNetPat276Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat277InstanceListener> listenersTrNetPat277Instance;

	public void registerListener(TrNetPat277InstanceListener listener){
		listenersTrNetPat277Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat277Instance element){
		for (TrNetPat277InstanceListener listener : listenersTrNetPat277Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat282InstanceListener> listenersTrNetPat282Instance;

	public void registerListener(TrNetPat282InstanceListener listener){
		listenersTrNetPat282Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat282Instance element){
		for (TrNetPat282InstanceListener listener : listenersTrNetPat282Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat283InstanceListener> listenersTrNetPat283Instance;

	public void registerListener(TrNetPat283InstanceListener listener){
		listenersTrNetPat283Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat283Instance element){
		for (TrNetPat283InstanceListener listener : listenersTrNetPat283Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat288InstanceListener> listenersTrNetPat288Instance;

	public void registerListener(TrNetPat288InstanceListener listener){
		listenersTrNetPat288Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat288Instance element){
		for (TrNetPat288InstanceListener listener : listenersTrNetPat288Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat289InstanceListener> listenersTrNetPat289Instance;

	public void registerListener(TrNetPat289InstanceListener listener){
		listenersTrNetPat289Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat289Instance element){
		for (TrNetPat289InstanceListener listener : listenersTrNetPat289Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat294InstanceListener> listenersTrNetPat294Instance;

	public void registerListener(TrNetPat294InstanceListener listener){
		listenersTrNetPat294Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat294Instance element){
		for (TrNetPat294InstanceListener listener : listenersTrNetPat294Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat295InstanceListener> listenersTrNetPat295Instance;

	public void registerListener(TrNetPat295InstanceListener listener){
		listenersTrNetPat295Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat295Instance element){
		for (TrNetPat295InstanceListener listener : listenersTrNetPat295Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat300InstanceListener> listenersTrNetPat300Instance;

	public void registerListener(TrNetPat300InstanceListener listener){
		listenersTrNetPat300Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat300Instance element){
		for (TrNetPat300InstanceListener listener : listenersTrNetPat300Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat301InstanceListener> listenersTrNetPat301Instance;

	public void registerListener(TrNetPat301InstanceListener listener){
		listenersTrNetPat301Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat301Instance element){
		for (TrNetPat301InstanceListener listener : listenersTrNetPat301Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat306InstanceListener> listenersTrNetPat306Instance;

	public void registerListener(TrNetPat306InstanceListener listener){
		listenersTrNetPat306Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat306Instance element){
		for (TrNetPat306InstanceListener listener : listenersTrNetPat306Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat307InstanceListener> listenersTrNetPat307Instance;

	public void registerListener(TrNetPat307InstanceListener listener){
		listenersTrNetPat307Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat307Instance element){
		for (TrNetPat307InstanceListener listener : listenersTrNetPat307Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat312InstanceListener> listenersTrNetPat312Instance;

	public void registerListener(TrNetPat312InstanceListener listener){
		listenersTrNetPat312Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat312Instance element){
		for (TrNetPat312InstanceListener listener : listenersTrNetPat312Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat313InstanceListener> listenersTrNetPat313Instance;

	public void registerListener(TrNetPat313InstanceListener listener){
		listenersTrNetPat313Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat313Instance element){
		for (TrNetPat313InstanceListener listener : listenersTrNetPat313Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat318InstanceListener> listenersTrNetPat318Instance;

	public void registerListener(TrNetPat318InstanceListener listener){
		listenersTrNetPat318Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat318Instance element){
		for (TrNetPat318InstanceListener listener : listenersTrNetPat318Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat319InstanceListener> listenersTrNetPat319Instance;

	public void registerListener(TrNetPat319InstanceListener listener){
		listenersTrNetPat319Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat319Instance element){
		for (TrNetPat319InstanceListener listener : listenersTrNetPat319Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat324InstanceListener> listenersTrNetPat324Instance;

	public void registerListener(TrNetPat324InstanceListener listener){
		listenersTrNetPat324Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat324Instance element){
		for (TrNetPat324InstanceListener listener : listenersTrNetPat324Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat325InstanceListener> listenersTrNetPat325Instance;

	public void registerListener(TrNetPat325InstanceListener listener){
		listenersTrNetPat325Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat325Instance element){
		for (TrNetPat325InstanceListener listener : listenersTrNetPat325Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat330InstanceListener> listenersTrNetPat330Instance;

	public void registerListener(TrNetPat330InstanceListener listener){
		listenersTrNetPat330Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat330Instance element){
		for (TrNetPat330InstanceListener listener : listenersTrNetPat330Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat331InstanceListener> listenersTrNetPat331Instance;

	public void registerListener(TrNetPat331InstanceListener listener){
		listenersTrNetPat331Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat331Instance element){
		for (TrNetPat331InstanceListener listener : listenersTrNetPat331Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat336InstanceListener> listenersTrNetPat336Instance;

	public void registerListener(TrNetPat336InstanceListener listener){
		listenersTrNetPat336Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat336Instance element){
		for (TrNetPat336InstanceListener listener : listenersTrNetPat336Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat337InstanceListener> listenersTrNetPat337Instance;

	public void registerListener(TrNetPat337InstanceListener listener){
		listenersTrNetPat337Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat337Instance element){
		for (TrNetPat337InstanceListener listener : listenersTrNetPat337Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat342InstanceListener> listenersTrNetPat342Instance;

	public void registerListener(TrNetPat342InstanceListener listener){
		listenersTrNetPat342Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat342Instance element){
		for (TrNetPat342InstanceListener listener : listenersTrNetPat342Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat343InstanceListener> listenersTrNetPat343Instance;

	public void registerListener(TrNetPat343InstanceListener listener){
		listenersTrNetPat343Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat343Instance element){
		for (TrNetPat343InstanceListener listener : listenersTrNetPat343Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat348InstanceListener> listenersTrNetPat348Instance;

	public void registerListener(TrNetPat348InstanceListener listener){
		listenersTrNetPat348Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat348Instance element){
		for (TrNetPat348InstanceListener listener : listenersTrNetPat348Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat349InstanceListener> listenersTrNetPat349Instance;

	public void registerListener(TrNetPat349InstanceListener listener){
		listenersTrNetPat349Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat349Instance element){
		for (TrNetPat349InstanceListener listener : listenersTrNetPat349Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat354InstanceListener> listenersTrNetPat354Instance;

	public void registerListener(TrNetPat354InstanceListener listener){
		listenersTrNetPat354Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat354Instance element){
		for (TrNetPat354InstanceListener listener : listenersTrNetPat354Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat355InstanceListener> listenersTrNetPat355Instance;

	public void registerListener(TrNetPat355InstanceListener listener){
		listenersTrNetPat355Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat355Instance element){
		for (TrNetPat355InstanceListener listener : listenersTrNetPat355Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat360InstanceListener> listenersTrNetPat360Instance;

	public void registerListener(TrNetPat360InstanceListener listener){
		listenersTrNetPat360Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat360Instance element){
		for (TrNetPat360InstanceListener listener : listenersTrNetPat360Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat361InstanceListener> listenersTrNetPat361Instance;

	public void registerListener(TrNetPat361InstanceListener listener){
		listenersTrNetPat361Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat361Instance element){
		for (TrNetPat361InstanceListener listener : listenersTrNetPat361Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat369InstanceListener> listenersTrNetPat369Instance;

	public void registerListener(TrNetPat369InstanceListener listener){
		listenersTrNetPat369Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat369Instance element){
		for (TrNetPat369InstanceListener listener : listenersTrNetPat369Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat378InstanceListener> listenersTrNetPat378Instance;

	public void registerListener(TrNetPat378InstanceListener listener){
		listenersTrNetPat378Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat378Instance element){
		for (TrNetPat378InstanceListener listener : listenersTrNetPat378Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat387InstanceListener> listenersTrNetPat387Instance;

	public void registerListener(TrNetPat387InstanceListener listener){
		listenersTrNetPat387Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat387Instance element){
		for (TrNetPat387InstanceListener listener : listenersTrNetPat387Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat396InstanceListener> listenersTrNetPat396Instance;

	public void registerListener(TrNetPat396InstanceListener listener){
		listenersTrNetPat396Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat396Instance element){
		for (TrNetPat396InstanceListener listener : listenersTrNetPat396Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat405InstanceListener> listenersTrNetPat405Instance;

	public void registerListener(TrNetPat405InstanceListener listener){
		listenersTrNetPat405Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat405Instance element){
		for (TrNetPat405InstanceListener listener : listenersTrNetPat405Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat414InstanceListener> listenersTrNetPat414Instance;

	public void registerListener(TrNetPat414InstanceListener listener){
		listenersTrNetPat414Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat414Instance element){
		for (TrNetPat414InstanceListener listener : listenersTrNetPat414Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat423InstanceListener> listenersTrNetPat423Instance;

	public void registerListener(TrNetPat423InstanceListener listener){
		listenersTrNetPat423Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat423Instance element){
		for (TrNetPat423InstanceListener listener : listenersTrNetPat423Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat432InstanceListener> listenersTrNetPat432Instance;

	public void registerListener(TrNetPat432InstanceListener listener){
		listenersTrNetPat432Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat432Instance element){
		for (TrNetPat432InstanceListener listener : listenersTrNetPat432Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat433InstanceListener> listenersTrNetPat433Instance;

	public void registerListener(TrNetPat433InstanceListener listener){
		listenersTrNetPat433Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat433Instance element){
		for (TrNetPat433InstanceListener listener : listenersTrNetPat433Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat434InstanceListener> listenersTrNetPat434Instance;

	public void registerListener(TrNetPat434InstanceListener listener){
		listenersTrNetPat434Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat434Instance element){
		for (TrNetPat434InstanceListener listener : listenersTrNetPat434Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat435InstanceListener> listenersTrNetPat435Instance;

	public void registerListener(TrNetPat435InstanceListener listener){
		listenersTrNetPat435Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat435Instance element){
		for (TrNetPat435InstanceListener listener : listenersTrNetPat435Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat436InstanceListener> listenersTrNetPat436Instance;

	public void registerListener(TrNetPat436InstanceListener listener){
		listenersTrNetPat436Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat436Instance element){
		for (TrNetPat436InstanceListener listener : listenersTrNetPat436Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat437InstanceListener> listenersTrNetPat437Instance;

	public void registerListener(TrNetPat437InstanceListener listener){
		listenersTrNetPat437Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat437Instance element){
		for (TrNetPat437InstanceListener listener : listenersTrNetPat437Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat438InstanceListener> listenersTrNetPat438Instance;

	public void registerListener(TrNetPat438InstanceListener listener){
		listenersTrNetPat438Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat438Instance element){
		for (TrNetPat438InstanceListener listener : listenersTrNetPat438Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat439InstanceListener> listenersTrNetPat439Instance;

	public void registerListener(TrNetPat439InstanceListener listener){
		listenersTrNetPat439Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat439Instance element){
		for (TrNetPat439InstanceListener listener : listenersTrNetPat439Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat440InstanceListener> listenersTrNetPat440Instance;

	public void registerListener(TrNetPat440InstanceListener listener){
		listenersTrNetPat440Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat440Instance element){
		for (TrNetPat440InstanceListener listener : listenersTrNetPat440Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat441InstanceListener> listenersTrNetPat441Instance;

	public void registerListener(TrNetPat441InstanceListener listener){
		listenersTrNetPat441Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat441Instance element){
		for (TrNetPat441InstanceListener listener : listenersTrNetPat441Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat442InstanceListener> listenersTrNetPat442Instance;

	public void registerListener(TrNetPat442InstanceListener listener){
		listenersTrNetPat442Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat442Instance element){
		for (TrNetPat442InstanceListener listener : listenersTrNetPat442Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat443InstanceListener> listenersTrNetPat443Instance;

	public void registerListener(TrNetPat443InstanceListener listener){
		listenersTrNetPat443Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat443Instance element){
		for (TrNetPat443InstanceListener listener : listenersTrNetPat443Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat444InstanceListener> listenersTrNetPat444Instance;

	public void registerListener(TrNetPat444InstanceListener listener){
		listenersTrNetPat444Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat444Instance element){
		for (TrNetPat444InstanceListener listener : listenersTrNetPat444Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat445InstanceListener> listenersTrNetPat445Instance;

	public void registerListener(TrNetPat445InstanceListener listener){
		listenersTrNetPat445Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat445Instance element){
		for (TrNetPat445InstanceListener listener : listenersTrNetPat445Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat446InstanceListener> listenersTrNetPat446Instance;

	public void registerListener(TrNetPat446InstanceListener listener){
		listenersTrNetPat446Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat446Instance element){
		for (TrNetPat446InstanceListener listener : listenersTrNetPat446Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat447InstanceListener> listenersTrNetPat447Instance;

	public void registerListener(TrNetPat447InstanceListener listener){
		listenersTrNetPat447Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat447Instance element){
		for (TrNetPat447InstanceListener listener : listenersTrNetPat447Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat448InstanceListener> listenersTrNetPat448Instance;

	public void registerListener(TrNetPat448InstanceListener listener){
		listenersTrNetPat448Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat448Instance element){
		for (TrNetPat448InstanceListener listener : listenersTrNetPat448Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat449InstanceListener> listenersTrNetPat449Instance;

	public void registerListener(TrNetPat449InstanceListener listener){
		listenersTrNetPat449Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat449Instance element){
		for (TrNetPat449InstanceListener listener : listenersTrNetPat449Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat450InstanceListener> listenersTrNetPat450Instance;

	public void registerListener(TrNetPat450InstanceListener listener){
		listenersTrNetPat450Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat450Instance element){
		for (TrNetPat450InstanceListener listener : listenersTrNetPat450Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat451InstanceListener> listenersTrNetPat451Instance;

	public void registerListener(TrNetPat451InstanceListener listener){
		listenersTrNetPat451Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat451Instance element){
		for (TrNetPat451InstanceListener listener : listenersTrNetPat451Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat452InstanceListener> listenersTrNetPat452Instance;

	public void registerListener(TrNetPat452InstanceListener listener){
		listenersTrNetPat452Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat452Instance element){
		for (TrNetPat452InstanceListener listener : listenersTrNetPat452Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat453InstanceListener> listenersTrNetPat453Instance;

	public void registerListener(TrNetPat453InstanceListener listener){
		listenersTrNetPat453Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat453Instance element){
		for (TrNetPat453InstanceListener listener : listenersTrNetPat453Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat454InstanceListener> listenersTrNetPat454Instance;

	public void registerListener(TrNetPat454InstanceListener listener){
		listenersTrNetPat454Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat454Instance element){
		for (TrNetPat454InstanceListener listener : listenersTrNetPat454Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat455InstanceListener> listenersTrNetPat455Instance;

	public void registerListener(TrNetPat455InstanceListener listener){
		listenersTrNetPat455Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat455Instance element){
		for (TrNetPat455InstanceListener listener : listenersTrNetPat455Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat456InstanceListener> listenersTrNetPat456Instance;

	public void registerListener(TrNetPat456InstanceListener listener){
		listenersTrNetPat456Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat456Instance element){
		for (TrNetPat456InstanceListener listener : listenersTrNetPat456Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat457InstanceListener> listenersTrNetPat457Instance;

	public void registerListener(TrNetPat457InstanceListener listener){
		listenersTrNetPat457Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat457Instance element){
		for (TrNetPat457InstanceListener listener : listenersTrNetPat457Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat458InstanceListener> listenersTrNetPat458Instance;

	public void registerListener(TrNetPat458InstanceListener listener){
		listenersTrNetPat458Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat458Instance element){
		for (TrNetPat458InstanceListener listener : listenersTrNetPat458Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat459InstanceListener> listenersTrNetPat459Instance;

	public void registerListener(TrNetPat459InstanceListener listener){
		listenersTrNetPat459Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat459Instance element){
		for (TrNetPat459InstanceListener listener : listenersTrNetPat459Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat460InstanceListener> listenersTrNetPat460Instance;

	public void registerListener(TrNetPat460InstanceListener listener){
		listenersTrNetPat460Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat460Instance element){
		for (TrNetPat460InstanceListener listener : listenersTrNetPat460Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat461InstanceListener> listenersTrNetPat461Instance;

	public void registerListener(TrNetPat461InstanceListener listener){
		listenersTrNetPat461Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat461Instance element){
		for (TrNetPat461InstanceListener listener : listenersTrNetPat461Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat462InstanceListener> listenersTrNetPat462Instance;

	public void registerListener(TrNetPat462InstanceListener listener){
		listenersTrNetPat462Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat462Instance element){
		for (TrNetPat462InstanceListener listener : listenersTrNetPat462Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat463InstanceListener> listenersTrNetPat463Instance;

	public void registerListener(TrNetPat463InstanceListener listener){
		listenersTrNetPat463Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat463Instance element){
		for (TrNetPat463InstanceListener listener : listenersTrNetPat463Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat464InstanceListener> listenersTrNetPat464Instance;

	public void registerListener(TrNetPat464InstanceListener listener){
		listenersTrNetPat464Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat464Instance element){
		for (TrNetPat464InstanceListener listener : listenersTrNetPat464Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat465InstanceListener> listenersTrNetPat465Instance;

	public void registerListener(TrNetPat465InstanceListener listener){
		listenersTrNetPat465Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat465Instance element){
		for (TrNetPat465InstanceListener listener : listenersTrNetPat465Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat466InstanceListener> listenersTrNetPat466Instance;

	public void registerListener(TrNetPat466InstanceListener listener){
		listenersTrNetPat466Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat466Instance element){
		for (TrNetPat466InstanceListener listener : listenersTrNetPat466Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat467InstanceListener> listenersTrNetPat467Instance;

	public void registerListener(TrNetPat467InstanceListener listener){
		listenersTrNetPat467Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat467Instance element){
		for (TrNetPat467InstanceListener listener : listenersTrNetPat467Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat468InstanceListener> listenersTrNetPat468Instance;

	public void registerListener(TrNetPat468InstanceListener listener){
		listenersTrNetPat468Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat468Instance element){
		for (TrNetPat468InstanceListener listener : listenersTrNetPat468Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat469InstanceListener> listenersTrNetPat469Instance;

	public void registerListener(TrNetPat469InstanceListener listener){
		listenersTrNetPat469Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat469Instance element){
		for (TrNetPat469InstanceListener listener : listenersTrNetPat469Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat470InstanceListener> listenersTrNetPat470Instance;

	public void registerListener(TrNetPat470InstanceListener listener){
		listenersTrNetPat470Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat470Instance element){
		for (TrNetPat470InstanceListener listener : listenersTrNetPat470Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat471InstanceListener> listenersTrNetPat471Instance;

	public void registerListener(TrNetPat471InstanceListener listener){
		listenersTrNetPat471Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat471Instance element){
		for (TrNetPat471InstanceListener listener : listenersTrNetPat471Instance){
			listener.notify(element);
		}
	}
	


public InputModelExternalInput() {
	listenersTrNetPat1Instance = new LinkedList<TrNetPat1InstanceListener>();
	listenersTrNetPat48Instance = new LinkedList<TrNetPat48InstanceListener>();
	listenersTrNetPat53Instance = new LinkedList<TrNetPat53InstanceListener>();
	listenersTrNetPat139Instance = new LinkedList<TrNetPat139InstanceListener>();
	listenersTrNetPat140Instance = new LinkedList<TrNetPat140InstanceListener>();
	listenersTrNetPat145Instance = new LinkedList<TrNetPat145InstanceListener>();
	listenersTrNetPat146Instance = new LinkedList<TrNetPat146InstanceListener>();
	listenersTrNetPat151Instance = new LinkedList<TrNetPat151InstanceListener>();
	listenersTrNetPat152Instance = new LinkedList<TrNetPat152InstanceListener>();
	listenersTrNetPat157Instance = new LinkedList<TrNetPat157InstanceListener>();
	listenersTrNetPat158Instance = new LinkedList<TrNetPat158InstanceListener>();
	listenersTrNetPat163Instance = new LinkedList<TrNetPat163InstanceListener>();
	listenersTrNetPat164Instance = new LinkedList<TrNetPat164InstanceListener>();
	listenersTrNetPat169Instance = new LinkedList<TrNetPat169InstanceListener>();
	listenersTrNetPat170Instance = new LinkedList<TrNetPat170InstanceListener>();
	listenersTrNetPat175Instance = new LinkedList<TrNetPat175InstanceListener>();
	listenersTrNetPat176Instance = new LinkedList<TrNetPat176InstanceListener>();
	listenersTrNetPat181Instance = new LinkedList<TrNetPat181InstanceListener>();
	listenersTrNetPat182Instance = new LinkedList<TrNetPat182InstanceListener>();
	listenersTrNetPat187Instance = new LinkedList<TrNetPat187InstanceListener>();
	listenersTrNetPat188Instance = new LinkedList<TrNetPat188InstanceListener>();
	listenersTrNetPat193Instance = new LinkedList<TrNetPat193InstanceListener>();
	listenersTrNetPat194Instance = new LinkedList<TrNetPat194InstanceListener>();
	listenersTrNetPat270Instance = new LinkedList<TrNetPat270InstanceListener>();
	listenersTrNetPat271Instance = new LinkedList<TrNetPat271InstanceListener>();
	listenersTrNetPat276Instance = new LinkedList<TrNetPat276InstanceListener>();
	listenersTrNetPat277Instance = new LinkedList<TrNetPat277InstanceListener>();
	listenersTrNetPat282Instance = new LinkedList<TrNetPat282InstanceListener>();
	listenersTrNetPat283Instance = new LinkedList<TrNetPat283InstanceListener>();
	listenersTrNetPat288Instance = new LinkedList<TrNetPat288InstanceListener>();
	listenersTrNetPat289Instance = new LinkedList<TrNetPat289InstanceListener>();
	listenersTrNetPat294Instance = new LinkedList<TrNetPat294InstanceListener>();
	listenersTrNetPat295Instance = new LinkedList<TrNetPat295InstanceListener>();
	listenersTrNetPat300Instance = new LinkedList<TrNetPat300InstanceListener>();
	listenersTrNetPat301Instance = new LinkedList<TrNetPat301InstanceListener>();
	listenersTrNetPat306Instance = new LinkedList<TrNetPat306InstanceListener>();
	listenersTrNetPat307Instance = new LinkedList<TrNetPat307InstanceListener>();
	listenersTrNetPat312Instance = new LinkedList<TrNetPat312InstanceListener>();
	listenersTrNetPat313Instance = new LinkedList<TrNetPat313InstanceListener>();
	listenersTrNetPat318Instance = new LinkedList<TrNetPat318InstanceListener>();
	listenersTrNetPat319Instance = new LinkedList<TrNetPat319InstanceListener>();
	listenersTrNetPat324Instance = new LinkedList<TrNetPat324InstanceListener>();
	listenersTrNetPat325Instance = new LinkedList<TrNetPat325InstanceListener>();
	listenersTrNetPat330Instance = new LinkedList<TrNetPat330InstanceListener>();
	listenersTrNetPat331Instance = new LinkedList<TrNetPat331InstanceListener>();
	listenersTrNetPat336Instance = new LinkedList<TrNetPat336InstanceListener>();
	listenersTrNetPat337Instance = new LinkedList<TrNetPat337InstanceListener>();
	listenersTrNetPat342Instance = new LinkedList<TrNetPat342InstanceListener>();
	listenersTrNetPat343Instance = new LinkedList<TrNetPat343InstanceListener>();
	listenersTrNetPat348Instance = new LinkedList<TrNetPat348InstanceListener>();
	listenersTrNetPat349Instance = new LinkedList<TrNetPat349InstanceListener>();
	listenersTrNetPat354Instance = new LinkedList<TrNetPat354InstanceListener>();
	listenersTrNetPat355Instance = new LinkedList<TrNetPat355InstanceListener>();
	listenersTrNetPat360Instance = new LinkedList<TrNetPat360InstanceListener>();
	listenersTrNetPat361Instance = new LinkedList<TrNetPat361InstanceListener>();
	listenersTrNetPat369Instance = new LinkedList<TrNetPat369InstanceListener>();
	listenersTrNetPat378Instance = new LinkedList<TrNetPat378InstanceListener>();
	listenersTrNetPat387Instance = new LinkedList<TrNetPat387InstanceListener>();
	listenersTrNetPat396Instance = new LinkedList<TrNetPat396InstanceListener>();
	listenersTrNetPat405Instance = new LinkedList<TrNetPat405InstanceListener>();
	listenersTrNetPat414Instance = new LinkedList<TrNetPat414InstanceListener>();
	listenersTrNetPat423Instance = new LinkedList<TrNetPat423InstanceListener>();
	listenersTrNetPat432Instance = new LinkedList<TrNetPat432InstanceListener>();
	listenersTrNetPat433Instance = new LinkedList<TrNetPat433InstanceListener>();
	listenersTrNetPat434Instance = new LinkedList<TrNetPat434InstanceListener>();
	listenersTrNetPat435Instance = new LinkedList<TrNetPat435InstanceListener>();
	listenersTrNetPat436Instance = new LinkedList<TrNetPat436InstanceListener>();
	listenersTrNetPat437Instance = new LinkedList<TrNetPat437InstanceListener>();
	listenersTrNetPat438Instance = new LinkedList<TrNetPat438InstanceListener>();
	listenersTrNetPat439Instance = new LinkedList<TrNetPat439InstanceListener>();
	listenersTrNetPat440Instance = new LinkedList<TrNetPat440InstanceListener>();
	listenersTrNetPat441Instance = new LinkedList<TrNetPat441InstanceListener>();
	listenersTrNetPat442Instance = new LinkedList<TrNetPat442InstanceListener>();
	listenersTrNetPat443Instance = new LinkedList<TrNetPat443InstanceListener>();
	listenersTrNetPat444Instance = new LinkedList<TrNetPat444InstanceListener>();
	listenersTrNetPat445Instance = new LinkedList<TrNetPat445InstanceListener>();
	listenersTrNetPat446Instance = new LinkedList<TrNetPat446InstanceListener>();
	listenersTrNetPat447Instance = new LinkedList<TrNetPat447InstanceListener>();
	listenersTrNetPat448Instance = new LinkedList<TrNetPat448InstanceListener>();
	listenersTrNetPat449Instance = new LinkedList<TrNetPat449InstanceListener>();
	listenersTrNetPat450Instance = new LinkedList<TrNetPat450InstanceListener>();
	listenersTrNetPat451Instance = new LinkedList<TrNetPat451InstanceListener>();
	listenersTrNetPat452Instance = new LinkedList<TrNetPat452InstanceListener>();
	listenersTrNetPat453Instance = new LinkedList<TrNetPat453InstanceListener>();
	listenersTrNetPat454Instance = new LinkedList<TrNetPat454InstanceListener>();
	listenersTrNetPat455Instance = new LinkedList<TrNetPat455InstanceListener>();
	listenersTrNetPat456Instance = new LinkedList<TrNetPat456InstanceListener>();
	listenersTrNetPat457Instance = new LinkedList<TrNetPat457InstanceListener>();
	listenersTrNetPat458Instance = new LinkedList<TrNetPat458InstanceListener>();
	listenersTrNetPat459Instance = new LinkedList<TrNetPat459InstanceListener>();
	listenersTrNetPat460Instance = new LinkedList<TrNetPat460InstanceListener>();
	listenersTrNetPat461Instance = new LinkedList<TrNetPat461InstanceListener>();
	listenersTrNetPat462Instance = new LinkedList<TrNetPat462InstanceListener>();
	listenersTrNetPat463Instance = new LinkedList<TrNetPat463InstanceListener>();
	listenersTrNetPat464Instance = new LinkedList<TrNetPat464InstanceListener>();
	listenersTrNetPat465Instance = new LinkedList<TrNetPat465InstanceListener>();
	listenersTrNetPat466Instance = new LinkedList<TrNetPat466InstanceListener>();
	listenersTrNetPat467Instance = new LinkedList<TrNetPat467InstanceListener>();
	listenersTrNetPat468Instance = new LinkedList<TrNetPat468InstanceListener>();
	listenersTrNetPat469Instance = new LinkedList<TrNetPat469InstanceListener>();
	listenersTrNetPat470Instance = new LinkedList<TrNetPat470InstanceListener>();
	listenersTrNetPat471Instance = new LinkedList<TrNetPat471InstanceListener>();
}

}


