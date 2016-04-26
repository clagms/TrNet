package activitymigrationoriginal;

import java.util.LinkedList;
import generic.*;

public class EvolvedOutputExternalOutput
implements ModelPatternPublisher
	,TrNetPat3InstanceListener
	,TrNetPat5InstanceListener
	,TrNetPat4InstanceListener
	,TrNetPat7InstanceListener
	,TrNetPat20InstanceListener
	,TrNetPat46InstanceListener
	,TrNetPat10InstanceListener
	,TrNetPat32InstanceListener
	,TrNetPat12InstanceListener
	,TrNetPat50InstanceListener
	,TrNetPat15InstanceListener
	,TrNetPat55InstanceListener
	,TrNetPat58InstanceListener
	,TrNetPat60InstanceListener
	,TrNetPat62InstanceListener
	,TrNetPat64InstanceListener
	,TrNetPat67InstanceListener
	,TrNetPat36InstanceListener
	,TrNetPat37InstanceListener
	,TrNetPat40InstanceListener
	,TrNetPat43InstanceListener
	,TrNetPat23InstanceListener
	,TrNetPat26InstanceListener
{

LinkedList<ModelPatternListener> listeners;

public EvolvedOutputExternalOutput() {
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
		genericPattern.nodes.add(element.package0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "packagedElement";
		edge.source = element.package0;
		edge.target = element.activity0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat5Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.package0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat4Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.activity0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat7Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.activityPartition0);
		genericPattern.nodes.add(element.activity0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "group";
		edge.source = element.activity0;
		edge.target = element.activityPartition0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat20Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.activityPartition0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat46Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.objectFlow0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat10Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.activity0);
		genericPattern.nodes.add(element.objectFlow0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "edge";
		edge.source = element.activity0;
		edge.target = element.objectFlow0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat32Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.controlFlow0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat12Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.activity0);
		genericPattern.nodes.add(element.controlFlow0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "edge";
		edge.source = element.activity0;
		edge.target = element.controlFlow0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat50Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.opaqueAction0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat15Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.activityNode0);
		genericPattern.nodes.add(element.activity0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "node";
		edge.source = element.activity0;
		edge.target = element.activityNode0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat55Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.activityFinalNode0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat58Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.initialNode0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat60Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.joinNode0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat62Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.forkNode0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat64Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.decisionNode0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat67Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.activityParameterNode0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat36Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.opaqueExpression0);
		genericPattern.nodes.add(element.activityEdge0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "guard";
		edge.source = element.activityEdge0;
		edge.target = element.opaqueExpression0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat37Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.opaqueExpression0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat40Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.activityEdge0);
		genericPattern.nodes.add(element.activityNode0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "source";
		edge.source = element.activityEdge0;
		edge.target = element.activityNode0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat43Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.activityEdge0);
		genericPattern.nodes.add(element.activityNode0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "target";
		edge.source = element.activityEdge0;
		edge.target = element.activityNode0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat23Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.activityPartition0);
		genericPattern.nodes.add(element.activityEdge0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "edge";
		edge.source = element.activityPartition0;
		edge.target = element.activityEdge0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat26Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.activityPartition0);
		genericPattern.nodes.add(element.activityNode0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "node";
		edge.source = element.activityPartition0;
		edge.target = element.activityNode0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}

}


