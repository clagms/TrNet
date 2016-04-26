package class2relacionaldsltransoriginal;

import java.util.LinkedList;
import generic.*;

public class OutputLayer0outputModelExternalOutput
implements ModelPatternPublisher
	,TrNetPat3InstanceListener
{

LinkedList<ModelPatternListener> listeners;

public OutputLayer0outputModelExternalOutput() {
	listeners = new LinkedList<ModelPatternListener>();
}

public void registerListener(ModelPatternListener listener){
	listeners.add(listener);
}
	
public void notifyListeners(ModelPattern element){
	for (ModelPatternListener listener : listeners){
		listener.notify(element);
	}
}

	public void notify(TrNetPat3Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.type0);
	
	
	notifyListeners(genericPattern);
	
	}

}


