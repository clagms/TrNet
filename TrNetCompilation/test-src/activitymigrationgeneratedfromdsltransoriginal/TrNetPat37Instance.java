package activitymigrationgeneratedfromdsltransoriginal;

import generic.*;

public class TrNetPat37Instance{
	public ModelNode forkNode0;
	public ModelNode compositeState0;
	public ModelNode activity0;
	public ModelNode pseudostate0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((forkNode0==null) ? 0 : forkNode0.hashCode());
		result = prime * result + ((compositeState0==null) ? 0 : compositeState0.hashCode());
		result = prime * result + ((activity0==null) ? 0 : activity0.hashCode());
		result = prime * result + ((pseudostate0==null) ? 0 : pseudostate0.hashCode());
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
		TrNetPat37Instance other = (TrNetPat37Instance) obj;
		if (forkNode0==null) {
			if (other.forkNode0 != null) {
				return false;
			}
		} else if (! forkNode0.equals(other.forkNode0)) {
			return false;
		}
		if (compositeState0==null) {
			if (other.compositeState0 != null) {
				return false;
			}
		} else if (! compositeState0.equals(other.compositeState0)) {
			return false;
		}
		if (activity0==null) {
			if (other.activity0 != null) {
				return false;
			}
		} else if (! activity0.equals(other.activity0)) {
			return false;
		}
		if (pseudostate0==null) {
			if (other.pseudostate0 != null) {
				return false;
			}
		} else if (! pseudostate0.equals(other.pseudostate0)) {
			return false;
		}
		return true;
	}

}