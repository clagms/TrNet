package generic;

import java.util.HashMap;
import java.util.HashSet;

public class ModelNode {
	
	public HashSet<String> types;
	
	public HashMap<String, String> attributes;

	public ModelNode() {
		attributes = new HashMap<String, String>(10);
		types = new HashSet<String>(5);
	}

	@Override
	public String toString() {
		return "ModelNode [types=" + types + ", attributes=" + attributes + "]";
	}
	
}