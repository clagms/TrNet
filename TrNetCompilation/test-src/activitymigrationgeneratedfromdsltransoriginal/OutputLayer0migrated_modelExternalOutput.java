package activitymigrationgeneratedfromdsltransoriginal;

import java.util.LinkedList;
import generic.*;

public class OutputLayer0migrated_modelExternalOutput
implements ModelPatternPublisher
	,TrNetPat3InstanceListener
	,TrNetPat4InstanceListener
	,TrNetPat47InstanceListener
	,TrNetPat50InstanceListener
	,TrNetPat56InstanceListener
	,TrNetPat143InstanceListener
	,TrNetPat149InstanceListener
	,TrNetPat155InstanceListener
	,TrNetPat161InstanceListener
	,TrNetPat167InstanceListener
	,TrNetPat173InstanceListener
	,TrNetPat179InstanceListener
	,TrNetPat185InstanceListener
	,TrNetPat191InstanceListener
	,TrNetPat197InstanceListener
	,TrNetPat274InstanceListener
	,TrNetPat280InstanceListener
	,TrNetPat286InstanceListener
	,TrNetPat292InstanceListener
	,TrNetPat298InstanceListener
	,TrNetPat304InstanceListener
	,TrNetPat310InstanceListener
	,TrNetPat316InstanceListener
	,TrNetPat322InstanceListener
	,TrNetPat328InstanceListener
	,TrNetPat334InstanceListener
	,TrNetPat340InstanceListener
	,TrNetPat346InstanceListener
	,TrNetPat352InstanceListener
	,TrNetPat358InstanceListener
	,TrNetPat363InstanceListener
	,TrNetPat371InstanceListener
	,TrNetPat380InstanceListener
	,TrNetPat389InstanceListener
	,TrNetPat398InstanceListener
	,TrNetPat407InstanceListener
	,TrNetPat416InstanceListener
	,TrNetPat425InstanceListener
{

LinkedList<ModelPatternListener> listeners;

public OutputLayer0migrated_modelExternalOutput() {
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
	
		genericPattern.nodes.add(element.activity0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat4Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.package0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat47Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.package0);
		genericPattern.nodes.add(element.activity0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "packagedElement";
		edge.source = element.package0;
		edge.target = element.activity0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat50Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.activityPartition0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat56Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.objectFlow0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat143Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.objectFlow0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat149Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.objectFlow0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat155Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.objectFlow0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat161Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.objectFlow0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat167Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.objectFlow0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat173Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.objectFlow0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat179Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.objectFlow0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat185Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.objectFlow0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat191Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.objectFlow0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat197Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.controlFlow0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat274Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.controlFlow0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat280Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.controlFlow0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat286Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.controlFlow0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat292Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.controlFlow0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat298Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.controlFlow0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat304Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.controlFlow0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat310Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.controlFlow0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat316Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.controlFlow0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat322Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.controlFlow0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat328Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.controlFlow0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat334Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.controlFlow0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat340Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.controlFlow0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat346Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.controlFlow0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat352Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.controlFlow0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat358Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.controlFlow0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat363Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.opaqueExpression0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat371Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.opaqueAction0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat380Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.activityFinalNode0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat389Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.activityParameterNode0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat398Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.joinNode0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat407Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.forkNode0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat416Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.decisionNode0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat425Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.initialNode0);
	
	
	notifyListeners(genericPattern);
	
	}

}


