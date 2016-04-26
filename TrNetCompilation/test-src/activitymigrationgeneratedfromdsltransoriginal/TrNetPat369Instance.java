package activitymigrationgeneratedfromdsltransoriginal;

import generic.*;

public class TrNetPat369Instance{
	public ModelNode actionState0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((actionState0==null) ? 0 : actionState0.hashCode());
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
		TrNetPat369Instance other = (TrNetPat369Instance) obj;
		if (actionState0==null) {
			if (other.actionState0 != null) {
				return false;
			}
		} else if (! actionState0.equals(other.actionState0)) {
			return false;
		}
		return true;
	}

}