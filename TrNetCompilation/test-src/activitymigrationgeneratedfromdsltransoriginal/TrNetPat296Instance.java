package activitymigrationgeneratedfromdsltransoriginal;

import generic.*;

public class TrNetPat296Instance{
	public ModelNode transition0;
	public ModelNode actionState0;
	public ModelNode actionState1;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((transition0==null) ? 0 : transition0.hashCode());
		result = prime * result + ((actionState0==null) ? 0 : actionState0.hashCode());
		result = prime * result + ((actionState1==null) ? 0 : actionState1.hashCode());
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
		TrNetPat296Instance other = (TrNetPat296Instance) obj;
		if (transition0==null) {
			if (other.transition0 != null) {
				return false;
			}
		} else if (! transition0.equals(other.transition0)) {
			return false;
		}
		if (actionState0==null) {
			if (other.actionState0 != null) {
				return false;
			}
		} else if (! actionState0.equals(other.actionState0)) {
			return false;
		}
		if (actionState1==null) {
			if (other.actionState1 != null) {
				return false;
			}
		} else if (! actionState1.equals(other.actionState1)) {
			return false;
		}
		return true;
	}

}