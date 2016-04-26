package activitymigrationgeneratedfromdsltransoriginal;

import generic.*;

public class TrNetPat407Instance{
	public ModelNode forkNode0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
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
		TrNetPat407Instance other = (TrNetPat407Instance) obj;
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