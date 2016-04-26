package activitymigration;

import java.util.LinkedList;
import generic.*;

public class OriginalInputExternalInput
implements ModelPatternListener
	,TrNetPat1InstancePublisher
	,TrNetPat17InstancePublisher
	,TrNetPat27InstancePublisher
	,TrNetPat28InstancePublisher
	,TrNetPat29InstancePublisher
	,TrNetPat47InstancePublisher
	,TrNetPat48InstancePublisher
	,TrNetPat52InstancePublisher
	,TrNetPat53InstancePublisher
	,TrNetPat56InstancePublisher
	,TrNetPat65InstancePublisher
	,TrNetPat68InstancePublisher
	,TrNetPat69InstancePublisher
	,TrNetPat70InstancePublisher
	,TrNetPat71InstancePublisher
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
			TrNetPat17Instance patternInstance = new TrNetPat17Instance();
			patternInstance.partition0 = elementNode;
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("partition") && elementNodeSource.types.contains("ActivityGraph") && elementNodeTarget.types.contains("Partition")){
			TrNetPat27Instance patternInstance = new TrNetPat27Instance();			
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
			TrNetPat28Instance patternInstance = new TrNetPat28Instance();			
			patternInstance.activityGraph0 = elementNodeSource;
			patternInstance.transition0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("target") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("StateVertex")){
			TrNetPat29Instance patternInstance = new TrNetPat29Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.stateVertex0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("source") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("StateVertex")){
			TrNetPat47Instance patternInstance = new TrNetPat47Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.stateVertex0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 1 && element.edges.size() == 0) {
		ModelNode elementNode = element.nodes.get(0);
		if (elementNode.types.contains("ActionState")){
			TrNetPat48Instance patternInstance = new TrNetPat48Instance();
			patternInstance.actionState0 = elementNode;
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("subvertex") && elementNodeSource.types.contains("CompositeState") && elementNodeTarget.types.contains("StateVertex")){
			TrNetPat52Instance patternInstance = new TrNetPat52Instance();			
			patternInstance.compositeState0 = elementNodeSource;
			patternInstance.stateVertex0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 1 && element.edges.size() == 0) {
		ModelNode elementNode = element.nodes.get(0);
		if (elementNode.types.contains("FinalState")){
			TrNetPat53Instance patternInstance = new TrNetPat53Instance();
			patternInstance.finalState0 = elementNode;
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 1 && element.edges.size() == 0) {
		ModelNode elementNode = element.nodes.get(0);
		if (elementNode.types.contains("Pseudostate")){
			TrNetPat56Instance patternInstance = new TrNetPat56Instance();
			patternInstance.pseudostate0 = elementNode;
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 1 && element.edges.size() == 0) {
		ModelNode elementNode = element.nodes.get(0);
		if (elementNode.types.contains("ObjectFlowState")){
			TrNetPat65Instance patternInstance = new TrNetPat65Instance();
			patternInstance.objectFlowState0 = elementNode;
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("guard") && elementNodeSource.types.contains("Transition") && elementNodeTarget.types.contains("Guard")){
			TrNetPat68Instance patternInstance = new TrNetPat68Instance();			
			patternInstance.transition0 = elementNodeSource;
			patternInstance.guard0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("expression") && elementNodeSource.types.contains("Guard") && elementNodeTarget.types.contains("BooleanExpression")){
			TrNetPat69Instance patternInstance = new TrNetPat69Instance();			
			patternInstance.guard0 = elementNodeSource;
			patternInstance.booleanExpression0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("contents") && elementNodeSource.types.contains("Partition") && elementNodeTarget.types.contains("Transition")){
			TrNetPat70Instance patternInstance = new TrNetPat70Instance();			
			patternInstance.partition0 = elementNodeSource;
			patternInstance.transition0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("contents") && elementNodeSource.types.contains("Partition") && elementNodeTarget.types.contains("StateVertex")){
			TrNetPat71Instance patternInstance = new TrNetPat71Instance();			
			patternInstance.partition0 = elementNodeSource;
			patternInstance.stateVertex0 = elementNodeTarget;
			
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
	
	
	LinkedList<TrNetPat17InstanceListener> listenersTrNetPat17Instance;

	public void registerListener(TrNetPat17InstanceListener listener){
		listenersTrNetPat17Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat17Instance element){
		for (TrNetPat17InstanceListener listener : listenersTrNetPat17Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat27InstanceListener> listenersTrNetPat27Instance;

	public void registerListener(TrNetPat27InstanceListener listener){
		listenersTrNetPat27Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat27Instance element){
		for (TrNetPat27InstanceListener listener : listenersTrNetPat27Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat28InstanceListener> listenersTrNetPat28Instance;

	public void registerListener(TrNetPat28InstanceListener listener){
		listenersTrNetPat28Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat28Instance element){
		for (TrNetPat28InstanceListener listener : listenersTrNetPat28Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat29InstanceListener> listenersTrNetPat29Instance;

	public void registerListener(TrNetPat29InstanceListener listener){
		listenersTrNetPat29Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat29Instance element){
		for (TrNetPat29InstanceListener listener : listenersTrNetPat29Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat47InstanceListener> listenersTrNetPat47Instance;

	public void registerListener(TrNetPat47InstanceListener listener){
		listenersTrNetPat47Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat47Instance element){
		for (TrNetPat47InstanceListener listener : listenersTrNetPat47Instance){
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
	
	
	LinkedList<TrNetPat52InstanceListener> listenersTrNetPat52Instance;

	public void registerListener(TrNetPat52InstanceListener listener){
		listenersTrNetPat52Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat52Instance element){
		for (TrNetPat52InstanceListener listener : listenersTrNetPat52Instance){
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
	
	
	LinkedList<TrNetPat56InstanceListener> listenersTrNetPat56Instance;

	public void registerListener(TrNetPat56InstanceListener listener){
		listenersTrNetPat56Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat56Instance element){
		for (TrNetPat56InstanceListener listener : listenersTrNetPat56Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat65InstanceListener> listenersTrNetPat65Instance;

	public void registerListener(TrNetPat65InstanceListener listener){
		listenersTrNetPat65Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat65Instance element){
		for (TrNetPat65InstanceListener listener : listenersTrNetPat65Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat68InstanceListener> listenersTrNetPat68Instance;

	public void registerListener(TrNetPat68InstanceListener listener){
		listenersTrNetPat68Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat68Instance element){
		for (TrNetPat68InstanceListener listener : listenersTrNetPat68Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat69InstanceListener> listenersTrNetPat69Instance;

	public void registerListener(TrNetPat69InstanceListener listener){
		listenersTrNetPat69Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat69Instance element){
		for (TrNetPat69InstanceListener listener : listenersTrNetPat69Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat70InstanceListener> listenersTrNetPat70Instance;

	public void registerListener(TrNetPat70InstanceListener listener){
		listenersTrNetPat70Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat70Instance element){
		for (TrNetPat70InstanceListener listener : listenersTrNetPat70Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat71InstanceListener> listenersTrNetPat71Instance;

	public void registerListener(TrNetPat71InstanceListener listener){
		listenersTrNetPat71Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat71Instance element){
		for (TrNetPat71InstanceListener listener : listenersTrNetPat71Instance){
			listener.notify(element);
		}
	}
	


public OriginalInputExternalInput() {
	listenersTrNetPat1Instance = new LinkedList<TrNetPat1InstanceListener>();
	listenersTrNetPat17Instance = new LinkedList<TrNetPat17InstanceListener>();
	listenersTrNetPat27Instance = new LinkedList<TrNetPat27InstanceListener>();
	listenersTrNetPat28Instance = new LinkedList<TrNetPat28InstanceListener>();
	listenersTrNetPat29Instance = new LinkedList<TrNetPat29InstanceListener>();
	listenersTrNetPat47Instance = new LinkedList<TrNetPat47InstanceListener>();
	listenersTrNetPat48Instance = new LinkedList<TrNetPat48InstanceListener>();
	listenersTrNetPat52Instance = new LinkedList<TrNetPat52InstanceListener>();
	listenersTrNetPat53Instance = new LinkedList<TrNetPat53InstanceListener>();
	listenersTrNetPat56Instance = new LinkedList<TrNetPat56InstanceListener>();
	listenersTrNetPat65Instance = new LinkedList<TrNetPat65InstanceListener>();
	listenersTrNetPat68Instance = new LinkedList<TrNetPat68InstanceListener>();
	listenersTrNetPat69Instance = new LinkedList<TrNetPat69InstanceListener>();
	listenersTrNetPat70Instance = new LinkedList<TrNetPat70InstanceListener>();
	listenersTrNetPat71Instance = new LinkedList<TrNetPat71InstanceListener>();
}

}


