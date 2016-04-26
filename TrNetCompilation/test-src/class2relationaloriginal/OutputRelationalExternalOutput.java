package class2relationaloriginal;

import java.util.LinkedList;
import generic.*;

public class OutputRelationalExternalOutput
implements ModelPatternPublisher
	,TrNetPat2InstanceListener
	,AddTableToDatabaseInstanceListener
	,TrNetPat3InstanceListener
	,TrNetPat9InstanceListener
	,TrNetPat10InstanceListener
	,TrNetPat12InstanceListener
	,TrNetPat45InstanceListener
	,TrNetPat11InstanceListener
	,TrNetPat4InstanceListener
	,TrNetPat17InstanceListener
	,TrNetPat16InstanceListener
	,TrNetPat15InstanceListener
	,TrNetPat5InstanceListener
{

LinkedList<ModelPatternListener> listeners;

public OutputRelationalExternalOutput() {
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

	public void notify(TrNetPat2Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.database0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(AddTableToDatabaseInstance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.table0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat3Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.database0);
		genericPattern.nodes.add(element.table0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "contents";
		edge.source = element.database0;
		edge.target = element.table0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat9Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.column0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat10Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.table0);
		genericPattern.nodes.add(element.column0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "columns";
		edge.source = element.table0;
		edge.target = element.column0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat12Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.table0);
		genericPattern.nodes.add(element.column0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "primaryKeys";
		edge.source = element.table0;
		edge.target = element.column0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat45Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.type0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat11Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.column0);
		genericPattern.nodes.add(element.type0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "type";
		edge.source = element.column0;
		edge.target = element.type0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat4Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.database0);
		genericPattern.nodes.add(element.type0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "contents";
		edge.source = element.database0;
		edge.target = element.type0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat17Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.foreignKey0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat16Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.column0);
		genericPattern.nodes.add(element.foreignKey0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "source";
		edge.source = element.foreignKey0;
		edge.target = element.column0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat15Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.column0);
		genericPattern.nodes.add(element.foreignKey0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "target";
		edge.source = element.foreignKey0;
		edge.target = element.column0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat5Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.foreignKey0);
		genericPattern.nodes.add(element.database0);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "contents";
		edge.source = element.database0;
		edge.target = element.foreignKey0;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}

}


