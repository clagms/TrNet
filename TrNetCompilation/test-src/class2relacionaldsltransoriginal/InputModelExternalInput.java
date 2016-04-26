package class2relacionaldsltransoriginal;

import java.util.LinkedList;
import generic.*;

public class InputModelExternalInput
implements ModelPatternListener
	,TrNetPat1InstancePublisher
	,TrNetPat95InstancePublisher
	,TrNetPat102InstancePublisher
	,TrNetPat103InstancePublisher
	,TrNetPat104InstancePublisher
	,TrNetPat105InstancePublisher
	,TrNetPat106InstancePublisher
	,TrNetPat107InstancePublisher
	,TrNetPat109InstancePublisher
	,TrNetPat110InstancePublisher
	,TrNetPat111InstancePublisher
	,TrNetPat112InstancePublisher
	,TrNetPat113InstancePublisher
{

public void notify(ModelPattern element){
	if (element.nodes.size() == 1 && element.edges.size() == 0) {
		ModelNode elementNode = element.nodes.get(0);
		if (elementNode.types.contains("Datatype")){
			TrNetPat1Instance patternInstance = new TrNetPat1Instance();
			patternInstance.datatype0 = elementNode;
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 1 && element.edges.size() == 0) {
		ModelNode elementNode = element.nodes.get(0);
		if (elementNode.types.contains("CModel")){
			TrNetPat95Instance patternInstance = new TrNetPat95Instance();
			patternInstance.cModel0 = elementNode;
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 1 && element.edges.size() == 0) {
		ModelNode elementNode = element.nodes.get(0);
		if (elementNode.types.contains("CClass")){
			TrNetPat102Instance patternInstance = new TrNetPat102Instance();
			patternInstance.cClass0 = elementNode;
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("type") && elementNodeSource.types.contains("Attribute") && elementNodeTarget.types.contains("Datatype")){
			TrNetPat103Instance patternInstance = new TrNetPat103Instance();			
			patternInstance.attribute0 = elementNodeSource;
			patternInstance.datatype0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("type") && elementNodeSource.types.contains("Attribute") && elementNodeTarget.types.contains("Datatype")){
			TrNetPat104Instance patternInstance = new TrNetPat104Instance();			
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
			TrNetPat105Instance patternInstance = new TrNetPat105Instance();			
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
			TrNetPat106Instance patternInstance = new TrNetPat106Instance();			
			patternInstance.attribute0 = elementNodeSource;
			patternInstance.cClass0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("type") && elementNodeSource.types.contains("Attribute") && elementNodeTarget.types.contains("CClass")){
			TrNetPat107Instance patternInstance = new TrNetPat107Instance();			
			patternInstance.attribute0 = elementNodeSource;
			patternInstance.cClass0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("attributes") && elementNodeSource.types.contains("CClass") && elementNodeTarget.types.contains("Attribute")){
			TrNetPat109Instance patternInstance = new TrNetPat109Instance();			
			patternInstance.cClass0 = elementNodeSource;
			patternInstance.attribute0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("extends") && elementNodeSource.types.contains("CClass") && elementNodeTarget.types.contains("CClass")){
			TrNetPat110Instance patternInstance = new TrNetPat110Instance();			
			patternInstance.cClass0 = elementNodeSource;
			patternInstance.cClass1 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("attributes") && elementNodeSource.types.contains("CClass") && elementNodeTarget.types.contains("Attribute")){
			TrNetPat111Instance patternInstance = new TrNetPat111Instance();			
			patternInstance.cClass0 = elementNodeSource;
			patternInstance.attribute0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("contents") && elementNodeSource.types.contains("CModel") && elementNodeTarget.types.contains("Datatype")){
			TrNetPat112Instance patternInstance = new TrNetPat112Instance();			
			patternInstance.cModel0 = elementNodeSource;
			patternInstance.datatype0 = elementNodeTarget;
			
			notifyListeners(patternInstance);
		}
	}
	if (element.nodes.size() == 2 && element.edges.size() == 1) {
		ModelEdge elementEdge = element.edges.get(0);
		ModelNode elementNodeSource = elementEdge.source;
		ModelNode elementNodeTarget = elementEdge.target;
		if (elementEdge.name.equals("extends") && elementNodeSource.types.contains("CClass") && elementNodeTarget.types.contains("CClass")){
			TrNetPat113Instance patternInstance = new TrNetPat113Instance();			
			patternInstance.cClass1 = elementNodeSource;
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
	
	
	LinkedList<TrNetPat95InstanceListener> listenersTrNetPat95Instance;

	public void registerListener(TrNetPat95InstanceListener listener){
		listenersTrNetPat95Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat95Instance element){
		for (TrNetPat95InstanceListener listener : listenersTrNetPat95Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat102InstanceListener> listenersTrNetPat102Instance;

	public void registerListener(TrNetPat102InstanceListener listener){
		listenersTrNetPat102Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat102Instance element){
		for (TrNetPat102InstanceListener listener : listenersTrNetPat102Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat103InstanceListener> listenersTrNetPat103Instance;

	public void registerListener(TrNetPat103InstanceListener listener){
		listenersTrNetPat103Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat103Instance element){
		for (TrNetPat103InstanceListener listener : listenersTrNetPat103Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat104InstanceListener> listenersTrNetPat104Instance;

	public void registerListener(TrNetPat104InstanceListener listener){
		listenersTrNetPat104Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat104Instance element){
		for (TrNetPat104InstanceListener listener : listenersTrNetPat104Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat105InstanceListener> listenersTrNetPat105Instance;

	public void registerListener(TrNetPat105InstanceListener listener){
		listenersTrNetPat105Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat105Instance element){
		for (TrNetPat105InstanceListener listener : listenersTrNetPat105Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat106InstanceListener> listenersTrNetPat106Instance;

	public void registerListener(TrNetPat106InstanceListener listener){
		listenersTrNetPat106Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat106Instance element){
		for (TrNetPat106InstanceListener listener : listenersTrNetPat106Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat107InstanceListener> listenersTrNetPat107Instance;

	public void registerListener(TrNetPat107InstanceListener listener){
		listenersTrNetPat107Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat107Instance element){
		for (TrNetPat107InstanceListener listener : listenersTrNetPat107Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat109InstanceListener> listenersTrNetPat109Instance;

	public void registerListener(TrNetPat109InstanceListener listener){
		listenersTrNetPat109Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat109Instance element){
		for (TrNetPat109InstanceListener listener : listenersTrNetPat109Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat110InstanceListener> listenersTrNetPat110Instance;

	public void registerListener(TrNetPat110InstanceListener listener){
		listenersTrNetPat110Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat110Instance element){
		for (TrNetPat110InstanceListener listener : listenersTrNetPat110Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat111InstanceListener> listenersTrNetPat111Instance;

	public void registerListener(TrNetPat111InstanceListener listener){
		listenersTrNetPat111Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat111Instance element){
		for (TrNetPat111InstanceListener listener : listenersTrNetPat111Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat112InstanceListener> listenersTrNetPat112Instance;

	public void registerListener(TrNetPat112InstanceListener listener){
		listenersTrNetPat112Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat112Instance element){
		for (TrNetPat112InstanceListener listener : listenersTrNetPat112Instance){
			listener.notify(element);
		}
	}
	
	
	LinkedList<TrNetPat113InstanceListener> listenersTrNetPat113Instance;

	public void registerListener(TrNetPat113InstanceListener listener){
		listenersTrNetPat113Instance.add(listener);
	}
		
	public void notifyListeners(TrNetPat113Instance element){
		for (TrNetPat113InstanceListener listener : listenersTrNetPat113Instance){
			listener.notify(element);
		}
	}
	


public InputModelExternalInput() {
	listenersTrNetPat1Instance = new LinkedList<TrNetPat1InstanceListener>();
	listenersTrNetPat95Instance = new LinkedList<TrNetPat95InstanceListener>();
	listenersTrNetPat102Instance = new LinkedList<TrNetPat102InstanceListener>();
	listenersTrNetPat103Instance = new LinkedList<TrNetPat103InstanceListener>();
	listenersTrNetPat104Instance = new LinkedList<TrNetPat104InstanceListener>();
	listenersTrNetPat105Instance = new LinkedList<TrNetPat105InstanceListener>();
	listenersTrNetPat106Instance = new LinkedList<TrNetPat106InstanceListener>();
	listenersTrNetPat107Instance = new LinkedList<TrNetPat107InstanceListener>();
	listenersTrNetPat109Instance = new LinkedList<TrNetPat109InstanceListener>();
	listenersTrNetPat110Instance = new LinkedList<TrNetPat110InstanceListener>();
	listenersTrNetPat111Instance = new LinkedList<TrNetPat111InstanceListener>();
	listenersTrNetPat112Instance = new LinkedList<TrNetPat112InstanceListener>();
	listenersTrNetPat113Instance = new LinkedList<TrNetPat113InstanceListener>();
}

}


