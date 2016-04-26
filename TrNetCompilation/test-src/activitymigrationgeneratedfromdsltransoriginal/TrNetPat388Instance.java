package activitymigrationgeneratedfromdsltransoriginal;

import generic.*;

public class TrNetPat388Instance{
	public ModelNode activityParameterNode0;
	public ModelNode objectFlowState0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((activityParameterNode0==null) ? 0 : activityParameterNode0.hashCode());
		result = prime * result + ((objectFlowState0==null) ? 0 : objectFlowState0.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TrNetPat388Instance other = (TrNetPat388Instance) obj;
		if (activityParameterNode0==null) {
			if (other.activityParameterNode0 != null) {
				return false;
			}
		} else if (! activityParameterNode0.equals(other.activityParameterNode0)) {
			return false;
		}
		if (objectFlowState0==null) {
			if (other.objectFlowState0 != null) {
				return false;
			}
		} else if (! objectFlowState0.equals(other.objectFlowState0)) {
			return false;
		}
		return true;
	}

}