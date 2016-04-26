package generic;

import java.util.ArrayList;

public class ModelPattern{

	public ArrayList<ModelEdge> edges;
	public ArrayList<ModelNode> nodes;
	
	
	public ModelPattern() {
		edges = new ArrayList<ModelEdge>(5);
		nodes = new ArrayList<ModelNode>(5);
	}


	@Override
	public String toString() {
		return "ModelPattern [edges=" + edges + ", nodes=" + nodes + "]";
	}
	
	
}