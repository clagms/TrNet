package activitymigrationgeneratedfromdsltransoriginal;

import generic.*;

public class TrNetPat227Instance{
	public ModelNode transition0;
	public ModelNode actionState0;
	public ModelNode opaqueAction0;
	public ModelNode controlFlow0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((transition0==null) ? 0 : transition0.hashCode());
		result = prime * result + ((actionState0==null) ? 0 : actionState0.hashCode());
		result = prime * result + ((opaqueAction0==null) ? 0 : opaqueAction0.hashCode());
		result = prime * result + ((controlFlow0==null) ? 0 : controlFlow0.hashCode());
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
		TrNetPat227Instance other = (TrNetPat227Instance) obj;
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
		if (opaqueAction0==null) {
			if (other.opaqueAction0 != null) {
				return false;
			}
		} else if (! opaqueAction0.equals(other.opaqueAction0)) {
			return false;
		}
		if (controlFlow0==null) {
			if (other.controlFlow0 != null) {
				return false;
			}
		} else if (! controlFlow0.equals(other.controlFlow0)) {
			return false;
		}
		return true;
	}

}