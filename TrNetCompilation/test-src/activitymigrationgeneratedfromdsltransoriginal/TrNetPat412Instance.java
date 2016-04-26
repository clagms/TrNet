package activitymigrationgeneratedfromdsltransoriginal;

import generic.*;

public class TrNetPat412Instance{
	public ModelNode forkNode0;
	public ModelNode pseudostate0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((forkNode0==null) ? 0 : forkNode0.hashCode());
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
		TrNetPat412Instance other = (TrNetPat412Instance) obj;
		if (forkNode0==null) {
			if (other.forkNode0 != null) {
				return false;
			}
		} else if (! forkNode0.equals(other.forkNode0)) {
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