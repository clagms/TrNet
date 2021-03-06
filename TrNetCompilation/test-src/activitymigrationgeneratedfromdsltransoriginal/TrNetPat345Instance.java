package activitymigrationgeneratedfromdsltransoriginal;

import generic.*;

public class TrNetPat345Instance{
	public ModelNode controlFlow0;
	public ModelNode transition0;
	public ModelNode compositeState0;
	public ModelNode compositeState1;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((controlFlow0==null) ? 0 : controlFlow0.hashCode());
		result = prime * result + ((transition0==null) ? 0 : transition0.hashCode());
		result = prime * result + ((compositeState0==null) ? 0 : compositeState0.hashCode());
		result = prime * result + ((compositeState1==null) ? 0 : compositeState1.hashCode());
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
		TrNetPat345Instance other = (TrNetPat345Instance) obj;
		if (controlFlow0==null) {
			if (other.controlFlow0 != null) {
				return false;
			}
		} else if (! controlFlow0.equals(other.controlFlow0)) {
			return false;
		}
		if (transition0==null) {
			if (other.transition0 != null) {
				return false;
			}
		} else if (! transition0.equals(other.transition0)) {
			return false;
		}
		if (compositeState0==null) {
			if (other.compositeState0 != null) {
				return false;
			}
		} else if (! compositeState0.equals(other.compositeState0)) {
			return false;
		}
		if (compositeState1==null) {
			if (other.compositeState1 != null) {
				return false;
			}
		} else if (! compositeState1.equals(other.compositeState1)) {
			return false;
		}
		return true;
	}

}