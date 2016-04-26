package class2relationalexplicitmin;

import java.util.LinkedList;
import generic.*;

public class TrNetOp3ExternalOutput
implements ModelPatternPublisher
	,TrNetPat2InstanceListener
	,TrNetPat3InstanceListener
	,TrNetPat4InstanceListener
	,TrNetPat6InstanceListener
	,TrNetPat999InstanceListener
	,TrNetPat21InstanceListener
	,TrNetPat8InstanceListener
	,TrNetPat9InstanceListener
	,TrNetPat13InstanceListener
	,TrNetPat15InstanceListener
	,TrNetPat10InstanceListener
	,TrNetPat7InstanceListener
	,TrNetPat11InstanceListener
	,TrNetPat12InstanceListener
	,TrNetPat14InstanceListener
	,PatternTypeInstanceListener
	,PatExtendsColumnInstanceListener
{

LinkedList<ModelPatternListener> listeners;

public TrNetOp3ExternalOutput() {
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
	public void notify(TrNetPat6Instance element){
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
	public void notify(TrNetPat999Instance element){
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
	public void notify(TrNetPat21Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.cClass0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat8Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.table0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat9Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.column0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat13Instance element){
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
	public void notify(TrNetPat15Instance element){
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
	public void notify(TrNetPat10Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.type0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat7Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.database0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat11Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.column0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat12Instance element){
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
	public void notify(TrNetPat14Instance element){
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
	public void notify(PatternTypeInstance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.type);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(PatExtendsColumnInstance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.table);
		genericPattern.nodes.add(element.column);
	
		{
		ModelEdge edge = new ModelEdge();
		edge.name = "columns";
		edge.source = element.table;
		edge.target = element.column;
		genericPattern.edges.add(edge);
		}
	
	notifyListeners(genericPattern);
	
	}

}


