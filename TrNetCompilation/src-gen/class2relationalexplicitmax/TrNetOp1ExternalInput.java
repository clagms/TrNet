package class2relationalexplicitmax;

import java.util.LinkedList;
import generic.*;

public class TrNetOp1ExternalInput
implements ModelPatternListener
	,TrNetPat1InstancePublisher
	,TrNetPat17InstancePublisher
	,TrNetPat23InstancePublisher
	,TrNetPat25InstancePublisher
	,TrNetPat26InstancePublisher
	,TrNetPat27InstancePublisher
	,PatExtendsInstancePublisher
{

public void notify(ModelPattern element){
	if (element.nodes.size() == 1 && element.edges.size() == 0) {
		ModelNode elementNode = element.nodes.get(0);
		if (elementNode.types.contains("CModel")){
			TrNetPat1Instance patternInstance = new TrNetPat1Instance();
			patternInstance.cModel0 = elementNode;
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 1 && element.edges.size() == 0) {
		ModelNode elementNode = element.nodes.get(0);
		if (elementNode.types.contains("CClass")){
			TrNetPat17Instance patternInstance = new TrNetPat17Instance();
			patternInstance.cClass0 = elementNode;
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 1 && element.edges.size() == 0) {
		ModelNode elementNode = element.nodes.get(0);
		if (elementNode.types.contains("Datatype")){
			TrNetPat23Instance patternInstance = new TrNetPat23Instance();
			patternInstance.datatype0 = elementNode;
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("attributes") && elementNodeSource.types.contains("CClass") && elementNodeTarget.types.contains("Attribute")){
			TrNetPat25Instance patternInstance = new TrNetPat25Instance();			
			patternInstance.cClass0 = elementNodeSource;
			patternInstance.attribute0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("type") && elementNodeSource.types.contains("Attribute") && elementNodeTarget.types.contains("Datatype")){
			TrNetPat26Instance patternInstance = new TrNetPat26Instance();			
			patternInstance.attribute0 = elementNodeSource;
			patternInstance.datatype0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("type") && elementNodeSource.types.contains("Attribute") && elementNodeTarget.types.contains("CClass")){
			TrNetPat27Instance patternInstance = new TrNetPat27Instance();			
			patternInstance.attribute0 = elementNodeSource;
			patternInstance.cClass0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("extends") && elementNodeSource.types.contains("CClass") && elementNodeTarget.types.contains("CClass")){
			PatExtendsInstance patternInstance = new PatExtendsInstance();			
			patternInstance.cClassSpecific = elementNodeSource;
			patternInstance.cClassParent = elementNodeTarget;
			
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
	
	
	LinkedList<TrNetPat23InstanceListener> listenersTrNetPat23Instance;

	public void registerListener(TrNetPat23InstanceListener listener){
		listenersTrNetPat23Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat23Instance element){
		for (TrNetPat23InstanceListener listener : listenersTrNetPat23Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat25InstanceListener> listenersTrNetPat25Instance;

	public void registerListener(TrNetPat25InstanceListener listener){
		listenersTrNetPat25Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat25Instance element){
		for (TrNetPat25InstanceListener listener : listenersTrNetPat25Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat26InstanceListener> listenersTrNetPat26Instance;

	public void registerListener(TrNetPat26InstanceListener listener){
		listenersTrNetPat26Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat26Instance element){
		for (TrNetPat26InstanceListener listener : listenersTrNetPat26Instance){
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
	
	
	LinkedList<PatExtendsInstanceListener> listenersPatExtendsInstance;

	public void registerListener(PatExtendsInstanceListener listener){
		listenersPatExtendsInstance.add(listener);
	}
		
	public void notifyListeners(PatExtendsInstance element){
		for (PatExtendsInstanceListener listener : listenersPatExtendsInstance){
			listener.notify(element);
		}
	}
	


public TrNetOp1ExternalInput() {
	listenersTrNetPat1Instance = new LinkedList<TrNetPat1InstanceListener>();
	listenersTrNetPat17Instance = new LinkedList<TrNetPat17InstanceListener>();
	listenersTrNetPat23Instance = new LinkedList<TrNetPat23InstanceListener>();
	listenersTrNetPat25Instance = new LinkedList<TrNetPat25InstanceListener>();
	listenersTrNetPat26Instance = new LinkedList<TrNetPat26InstanceListener>();
	listenersTrNetPat27Instance = new LinkedList<TrNetPat27InstanceListener>();
	listenersPatExtendsInstance = new LinkedList<PatExtendsInstanceListener>();
}

}


