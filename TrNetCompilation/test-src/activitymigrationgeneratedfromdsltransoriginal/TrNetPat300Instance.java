package activitymigrationgeneratedfromdsltransoriginal;

import generic.*;

public class TrNetPat300Instance{
	public ModelNode actionState0;
	public ModelNode transition0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((actionState0==null) ? 0 : actionState0.hashCode());
		result = prime * result + ((transition0==null) ? 0 : transition0.hashCode());
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
		TrNetPat300Instance other = (TrNetPat300Instance) obj;
		if (actionState0==null) {
			if (other.actionState0 != null) {
				return false;
			}
		} else if (! actionState0.equals(other.actionState0)) {
			return false;
		}
		if (transition0==null) {
			if (other.transition0 != null) {
				return false;
			}
		} else if (! transition0.equals(other.transition0)) {
			return false;
		}
		return true;
	}

}