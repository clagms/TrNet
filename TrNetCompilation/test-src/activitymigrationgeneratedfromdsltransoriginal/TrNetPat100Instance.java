package activitymigrationgeneratedfromdsltransoriginal;

import generic.*;

public class TrNetPat100Instance{
	public ModelNode transition0;
	public ModelNode pseudostate0;
	public ModelNode objectFlow0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((transition0==null) ? 0 : transition0.hashCode());
		result = prime * result + ((pseudostate0==null) ? 0 : pseudostate0.hashCode());
		result = prime * result + ((objectFlow0==null) ? 0 : objectFlow0.hashCode());
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
		TrNetPat100Instance other = (TrNetPat100Instance) obj;
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
		if (objectFlow0==null) {
			if (other.objectFlow0 != null) {
				return false;
			}
		} else if (! objectFlow0.equals(other.objectFlow0)) {
			return false;
		}
		return true;
	}

}