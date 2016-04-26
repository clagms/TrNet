package activitymigrationgeneratedfromdsltransoriginal;

import generic.*;

public class TrNetPat38Instance{
	public ModelNode activity0;
	public ModelNode forkNode0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((activity0==null) ? 0 : activity0.hashCode());
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
		TrNetPat38Instance other = (TrNetPat38Instance) obj;
		if (activity0==null) {
			if (other.activity0 != null) {
				return false;
			}
		} else if (! activity0.equals(other.activity0)) {
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