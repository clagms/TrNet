package class2relacionaldsltransoriginal;

import java.util.LinkedList;
import generic.*;

public class OutputLayer2outputModelExternalOutput
implements ModelPatternPublisher
	,TrNetPat3InstanceListener
	,TrNetPat97InstanceListener
	,TrNetPat6InstanceListener
	,TrNetPat7InstanceListener
	,TrNetPat24InstanceListener
	,TrNetPat25InstanceListener
	,TrNetPat26InstanceListener
	,TrNetPat30InstanceListener
	,TrNetPat33InstanceListener
	,TrNetPat38InstanceListener
	,TrNetPat39InstanceListener
	,TrNetPat40InstanceListener
	,TrNetPat56InstanceListener
	,TrNetPat57InstanceListener
	,TrNetPat58InstanceListener
	,TrNetPat59InstanceListener
	,TrNetPat60InstanceListener
	,TrNetPat61InstanceListener
	,TrNetPat65InstanceListener
	,TrNetPat68InstanceListener
	,TrNetPat71InstanceListener
	,TrNetPat72InstanceListener
	,TrNetPat73InstanceListener
	,TrNetPat83InstanceListener
	,TrNetPat84InstanceListener
	,TrNetPat85InstanceListener
	,TrNetPat86InstanceListener
	,TrNetPat87InstanceListener
	,TrNetPat88InstanceListener
	,TrNetPat91InstanceListener
	,TrNetPat94InstanceListener
	,TrNetPat11InstanceListener
	,TrNetPat16InstanceListener
	,TrNetPat48InstanceListener
	,TrNetPat54InstanceListener
	,TrNetPat21InstanceListener
{

LinkedList<ModelPatternListener> listeners;

public OutputLayer2outputModelExternalOutput() {
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
	public void notify(TrNetPat97Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.database0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat6Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.table0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat7Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.column0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat24Instance element){
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
	public void notify(TrNetPat25Instance element){
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
	public void notify(TrNetPat26Instance element){
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
	public void notify(TrNetPat30Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.column0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat33Instance element){
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
	public void notify(TrNetPat38Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.column0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat39Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.column0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat40Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.table0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat56Instance element){
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
	public void notify(TrNetPat57Instance element){
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
	public void notify(TrNetPat58Instance element){
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
	public void notify(TrNetPat59Instance element){
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
	public void notify(TrNetPat60Instance element){
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
	public void notify(TrNetPat61Instance element){
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
	public void notify(TrNetPat65Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.column0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat68Instance element){
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
	public void notify(TrNetPat71Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.column0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat72Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.table0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat73Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.column0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat83Instance element){
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
	public void notify(TrNetPat84Instance element){
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
	public void notify(TrNetPat85Instance element){
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
	public void notify(TrNetPat86Instance element){
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
	public void notify(TrNetPat87Instance element){
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
	public void notify(TrNetPat88Instance element){
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
	public void notify(TrNetPat91Instance element){
	ModelPattern genericPattern = new ModelPattern();
	
		genericPattern.nodes.add(element.column0);
	
	
	notifyListeners(genericPattern);
	
	}
	public void notify(TrNetPat94Instance element){
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
	public void notify(TrNetPat11Instance element){
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
	public void notify(TrNetPat16Instance element){
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
	public void notify(TrNetPat48Instance element){
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
	public void notify(TrNetPat54Instance element){
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
	public void notify(TrNetPat21Instance element){
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

}


