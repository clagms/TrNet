package activitymigrationgeneratedfromdsltransoriginal;

import java.util.LinkedList;
import generic.*;

public class OutputLayer1migrated_modelExternalOutput
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
	,TrNetPat9InstanceListener
	,TrNetPat13InstanceListener
	,TrNetPat17InstanceListener
	,TrNetPat204InstanceListener
	,TrNetPat63InstanceListener
	,TrNetPat22InstanceListener
	,TrNetPat26InstanceListener
	,TrNetPat30InstanceListener
	,TrNetPat34InstanceListener
	,TrNetPat38InstanceListener
	,TrNetPat42InstanceListener
	,TrNetPat46InstanceListener
	,TrNetPat68InstanceListener
	,TrNetPat73InstanceListener
	,TrNetPat78InstanceListener
	,TrNetPat83InstanceListener
	,TrNetPat88InstanceListener
	,TrNetPat93InstanceListener
	,TrNetPat98InstanceListener
	,TrNetPat103InstanceListener
	,TrNetPat108InstanceListener
	,TrNetPat113InstanceListener
	,TrNetPat118InstanceListener
	,TrNetPat123InstanceListener
	,TrNetPat128InstanceListener
	,TrNetPat133InstanceListener
	,TrNetPat209InstanceListener
	,TrNetPat214InstanceListener
	,TrNetPat219InstanceListener
	,TrNetPat224InstanceListener
	,TrNetPat229InstanceListener
	,TrNetPat234InstanceListener
	,TrNetPat239InstanceListener
	,TrNetPat244InstanceListener
	,TrNetPat249InstanceListener
	,TrNetPat138InstanceListener
	,TrNetPat254InstanceListener
	,TrNetPat259InstanceListener
	,TrNetPat264InstanceListener
	,TrNetPat269InstanceListener
{

LinkedList<ModelPatternListener> listeners;

public OutputLayer1migrated_modelExternalOutput() {
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
	public void notify(TrNetPat9Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.activity0);
		genericPattern.nodes.add(element.activityPartition0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "group";
		edge.source = element.activity0;
		edge.target = element.activityPartition0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat13Instance element){
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
	public void notify(TrNetPat17Instance element){
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
	public void notify(TrNetPat204Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.controlFlow0);
		genericPattern.nodes.add(element.opaqueExpression0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "guard";
		edge.source = element.controlFlow0;
		edge.target = element.opaqueExpression0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat63Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.objectFlow0);
		genericPattern.nodes.add(element.opaqueExpression0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "guard";
		edge.source = element.objectFlow0;
		edge.target = element.opaqueExpression0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat22Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.activity0);
		genericPattern.nodes.add(element.opaqueAction0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "node";
		edge.source = element.activity0;
		edge.target = element.opaqueAction0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat26Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.activity0);
		genericPattern.nodes.add(element.activityFinalNode0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "node";
		edge.source = element.activity0;
		edge.target = element.activityFinalNode0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat30Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.activity0);
		genericPattern.nodes.add(element.activityParameterNode0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "node";
		edge.source = element.activity0;
		edge.target = element.activityParameterNode0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat34Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.activity0);
		genericPattern.nodes.add(element.joinNode0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "node";
		edge.source = element.activity0;
		edge.target = element.joinNode0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat38Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.activity0);
		genericPattern.nodes.add(element.forkNode0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "node";
		edge.source = element.activity0;
		edge.target = element.forkNode0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat42Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.activity0);
		genericPattern.nodes.add(element.initialNode0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "node";
		edge.source = element.activity0;
		edge.target = element.initialNode0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat46Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.activity0);
		genericPattern.nodes.add(element.decisionNode0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "node";
		edge.source = element.activity0;
		edge.target = element.decisionNode0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat68Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.objectFlow0);
		genericPattern.nodes.add(element.activityParameterNode0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "source";
		edge.source = element.objectFlow0;
		edge.target = element.activityParameterNode0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat73Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.objectFlow0);
		genericPattern.nodes.add(element.activityParameterNode0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "target";
		edge.source = element.objectFlow0;
		edge.target = element.activityParameterNode0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat78Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.objectFlow0);
		genericPattern.nodes.add(element.opaqueAction0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "source";
		edge.source = element.objectFlow0;
		edge.target = element.opaqueAction0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat83Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.objectFlow0);
		genericPattern.nodes.add(element.opaqueAction0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "target";
		edge.source = element.objectFlow0;
		edge.target = element.opaqueAction0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat88Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.objectFlow0);
		genericPattern.nodes.add(element.activityFinalNode0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "source";
		edge.source = element.objectFlow0;
		edge.target = element.activityFinalNode0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat93Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.objectFlow0);
		genericPattern.nodes.add(element.activityFinalNode0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "target";
		edge.source = element.objectFlow0;
		edge.target = element.activityFinalNode0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat98Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.objectFlow0);
		genericPattern.nodes.add(element.joinNode0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "source";
		edge.source = element.objectFlow0;
		edge.target = element.joinNode0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat103Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.objectFlow0);
		genericPattern.nodes.add(element.joinNode0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "target";
		edge.source = element.objectFlow0;
		edge.target = element.joinNode0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat108Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.objectFlow0);
		genericPattern.nodes.add(element.forkNode0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "source";
		edge.source = element.objectFlow0;
		edge.target = element.forkNode0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat113Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.objectFlow0);
		genericPattern.nodes.add(element.forkNode0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "target";
		edge.source = element.objectFlow0;
		edge.target = element.forkNode0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat118Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.objectFlow0);
		genericPattern.nodes.add(element.decisionNode0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "source";
		edge.source = element.objectFlow0;
		edge.target = element.decisionNode0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat123Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.objectFlow0);
		genericPattern.nodes.add(element.decisionNode0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "target";
		edge.source = element.objectFlow0;
		edge.target = element.decisionNode0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat128Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.objectFlow0);
		genericPattern.nodes.add(element.initialNode0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "source";
		edge.source = element.objectFlow0;
		edge.target = element.initialNode0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat133Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.objectFlow0);
		genericPattern.nodes.add(element.initialNode0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "target";
		edge.source = element.objectFlow0;
		edge.target = element.initialNode0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat209Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.controlFlow0);
		genericPattern.nodes.add(element.forkNode0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "target";
		edge.source = element.controlFlow0;
		edge.target = element.forkNode0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat214Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.controlFlow0);
		genericPattern.nodes.add(element.decisionNode0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "source";
		edge.source = element.controlFlow0;
		edge.target = element.decisionNode0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat219Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.controlFlow0);
		genericPattern.nodes.add(element.initialNode0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "source";
		edge.source = element.controlFlow0;
		edge.target = element.initialNode0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat224Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.controlFlow0);
		genericPattern.nodes.add(element.activityFinalNode0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "source";
		edge.source = element.controlFlow0;
		edge.target = element.activityFinalNode0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat229Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.controlFlow0);
		genericPattern.nodes.add(element.opaqueAction0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "target";
		edge.source = element.controlFlow0;
		edge.target = element.opaqueAction0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat234Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.controlFlow0);
		genericPattern.nodes.add(element.joinNode0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "source";
		edge.source = element.controlFlow0;
		edge.target = element.joinNode0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat239Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.controlFlow0);
		genericPattern.nodes.add(element.joinNode0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "target";
		edge.source = element.controlFlow0;
		edge.target = element.joinNode0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat244Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.controlFlow0);
		genericPattern.nodes.add(element.activityParameterNode0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "target";
		edge.source = element.controlFlow0;
		edge.target = element.activityParameterNode0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat249Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.controlFlow0);
		genericPattern.nodes.add(element.opaqueAction0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "source";
		edge.source = element.controlFlow0;
		edge.target = element.opaqueAction0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat138Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.objectFlow0);
		genericPattern.nodes.add(element.initialNode0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "target";
		edge.source = element.objectFlow0;
		edge.target = element.initialNode0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat254Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.controlFlow0);
		genericPattern.nodes.add(element.forkNode0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "source";
		edge.source = element.controlFlow0;
		edge.target = element.forkNode0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat259Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.controlFlow0);
		genericPattern.nodes.add(element.activityFinalNode0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "target";
		edge.source = element.controlFlow0;
		edge.target = element.activityFinalNode0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat264Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.controlFlow0);
		genericPattern.nodes.add(element.decisionNode0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "target";
		edge.source = element.controlFlow0;
		edge.target = element.decisionNode0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat269Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.controlFlow0);
		genericPattern.nodes.add(element.activityParameterNode0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "source";
		edge.source = element.controlFlow0;
		edge.target = element.activityParameterNode0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}

}


