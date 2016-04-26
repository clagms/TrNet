package activitymigrationgeneratedfromdsltransoriginal;

import generic.*;

public class TrNetPat409Instance{
	public ModelNode pseudostate0;
	public ModelNode compositeState0;
	public ModelNode forkNode0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((pseudostate0==null) ? 0 : pseudostate0.hashCode());
		result = prime * result + ((compositeState0==null) ? 0 : compositeState0.hashCode());
		result = prime * result + ((forkNode0==null) ? 0 : forkNode0.hashCode());
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
		TrNetPat409Instance other = (TrNetPat409Instance) obj;
		if (pseudostate0==null) {
			if (other.pseudostate0 != null) {
				return false;
			}
		} else if (! pseudostate0.equals(other.pseudostate0)) {
			return false;
		}
		if (compositeState0==null) {
			if (other.compositeState0 != null) {
				return false;
			}
		} else if (! compositeState0.equals(other.compositeState0)) {
			return false;
		}
		if (forkNode0==null) {
			if (other.forkNode0 != null) {
				return false;
			}
		} else if (! forkNode0.equals(other.forkNode0)) {
			return false;
		}
		return true;
	}

}