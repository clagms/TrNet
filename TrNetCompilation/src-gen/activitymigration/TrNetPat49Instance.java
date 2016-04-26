package activitymigration;

import generic.*;

public class TrNetPat49Instance{
	public ModelNode actionState0;
	public ModelNode opaqueAction0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((actionState0==null) ? 0 : actionState0.hashCode());
		result = prime * result + ((opaqueAction0==null) ? 0 : opaqueAction0.hashCode());
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
		TrNetPat49Instance other = (TrNetPat49Instance) obj;
		if (actionState0==null) {
			if (other.actionState0 != null) {
				return false;
			}
		} else if (! actionState0.equals(other.actionState0)) {
			return false;
		}
		if (opaqueAction0==null) {
			if (other.opaqueAction0 != null) {
				return false;
			}
		} else if (! opaqueAction0.equals(other.opaqueAction0)) {
			return false;
		}
		return true;
	}

}