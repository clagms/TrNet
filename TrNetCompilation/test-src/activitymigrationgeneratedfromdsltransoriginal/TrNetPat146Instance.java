package activitymigrationgeneratedfromdsltransoriginal;

import generic.*;

public class TrNetPat146Instance{
	public ModelNode transition0;
	public ModelNode objectFlowState0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((transition0==null) ? 0 : transition0.hashCode());
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
		TrNetPat146Instance other = (TrNetPat146Instance) obj;
		if (transition0==null) {
			if (other.transition0 != null) {
				return false;
			}
		} else if (! transition0.equals(other.transition0)) {
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