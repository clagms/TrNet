package class2relationaloriginal;

import java.util.LinkedList;
import generic.*;

public class InputClassesExternalInput
implements ModelPatternListener
	,TrNetPat1InstancePublisher
	,TrNetPat6InstancePublisher
	,TrNetPat42InstancePublisher
	,TrNetPat43InstancePublisher
	,TrNetPat46InstancePublisher
	,TrNetPat47InstancePublisher
	,TrNetPat48InstancePublisher
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
			TrNetPat6Instance patternInstance = new TrNetPat6Instance();
			patternInstance.cClass0 = elementNode;
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("extends") && elementNodeSource.types.contains("CClass") && elementNodeTarget.types.contains("CClass")){
			TrNetPat42Instance patternInstance = new TrNetPat42Instance();			
			patternInstance.cClass0 = elementNodeSource;
			patternInstance.cClass1 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 1 && element.edges.size() == 0) {
		ModelNode elementNode = element.nodes.get(0);
		if (elementNode.types.contains("Datatype")){
			TrNetPat43Instance patternInstance = new TrNetPat43Instance();
			patternInstance.datatype0 = elementNode;
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("type") && elementNodeSource.types.contains("Attribute") && elementNodeTarget.types.contains("Datatype")){
			TrNetPat46Instance patternInstance = new TrNetPat46Instance();			
			patternInstance.attribute0 = elementNodeSource;
			patternInstance.datatype0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("attributes") && elementNodeSource.types.contains("CClass") && elementNodeTarget.types.contains("Attribute")){
			TrNetPat47Instance patternInstance = new TrNetPat47Instance();			
			patternInstance.cClass0 = elementNodeSource;
			patternInstance.attribute0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("type") && elementNodeSource.types.contains("Attribute") && elementNodeTarget.types.contains("CClass")){
			TrNetPat48Instance patternInstance = new TrNetPat48Instance();			
			patternInstance.attribute0 = elementNodeSource;
			patternInstance.cClass0 = elementNodeTarget;
			
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
	
	
	LinkedList<TrNetPat6InstanceListener> listenersTrNetPat6Instance;

	public void registerListener(TrNetPat6InstanceListener listener){
		listenersTrNetPat6Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat6Instance element){
		for (TrNetPat6InstanceListener listener : listenersTrNetPat6Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat42InstanceListener> listenersTrNetPat42Instance;

	public void registerListener(TrNetPat42InstanceListener listener){
		listenersTrNetPat42Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat42Instance element){
		for (TrNetPat42InstanceListener listener : listenersTrNetPat42Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat43InstanceListener> listenersTrNetPat43Instance;

	public void registerListener(TrNetPat43InstanceListener listener){
		listenersTrNetPat43Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat43Instance element){
		for (TrNetPat43InstanceListener listener : listenersTrNetPat43Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat46InstanceListener> listenersTrNetPat46Instance;

	public void registerListener(TrNetPat46InstanceListener listener){
		listenersTrNetPat46Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat46Instance element){
		for (TrNetPat46InstanceListener listener : listenersTrNetPat46Instance){
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
	


public InputClassesExternalInput() {
	listenersTrNetPat1Instance = new LinkedList<TrNetPat1InstanceListener>();
	listenersTrNetPat6Instance = new LinkedList<TrNetPat6InstanceListener>();
	listenersTrNetPat42Instance = new LinkedList<TrNetPat42InstanceListener>();
	listenersTrNetPat43Instance = new LinkedList<TrNetPat43InstanceListener>();
	listenersTrNetPat46Instance = new LinkedList<TrNetPat46InstanceListener>();
	listenersTrNetPat47Instance = new LinkedList<TrNetPat47InstanceListener>();
	listenersTrNetPat48Instance = new LinkedList<TrNetPat48InstanceListener>();
}

}


