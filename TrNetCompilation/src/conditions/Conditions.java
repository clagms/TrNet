package conditions;

import generic.ModelNode;

public class Conditions {

	public static boolean isNotKindOfObjectFlowState(ModelNode node) {
		return ! node.types.contains("ObjectFlowState");
	}

	public static boolean hasKindOfObjectFlowState(ModelNode node1,
			ModelNode node2) {
		return node1.types.contains("ObjectFlowState") || node2.types.contains("ObjectFlowState");
	}

}
