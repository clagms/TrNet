package activitymigrationgeneratedfromdsltransoriginal;

import generic.*;

public class TrNetPat196Instance{
	public ModelNode controlFlow0;
	public ModelNode transition0;
	public ModelNode pseudostate0;
	public ModelNode pseudostate1;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((controlFlow0==null) ? 0 : controlFlow0.hashCode());
		result = prime * result + ((transition0==null) ? 0 : transition0.hashCode());
		result = prime * result + ((pseudostate0==null) ? 0 : pseudostate0.hashCode());
		result = prime * result + ((pseudostate1==null) ? 0 : pseudostate1.hashCode());
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
		TrNetPat196Instance other = (TrNetPat196Instance) obj;
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
		if (pseudostate0==null) {
			if (other.pseudostate0 != null) {
				return false;
			}
		} else if (! pseudostate0.equals(other.pseudostate0)) {
			return false;
		}
		if (pseudostate1==null) {
			if (other.pseudostate1 != null) {
				return false;
			}
		} else if (! pseudostate1.equals(other.pseudostate1)) {
			return false;
		}
		return true;
	}

}