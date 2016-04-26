package activitymigrationgeneratedfromdsltransoriginal;

import generic.*;

public class TrNetPat42Instance{
	public ModelNode activity0;
	public ModelNode initialNode0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((activity0==null) ? 0 : activity0.hashCode());
		result = prime * result + ((initialNode0==null) ? 0 : initialNode0.hashCode());
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
		TrNetPat42Instance other = (TrNetPat42Instance) obj;
		if (activity0==null) {
			if (other.activity0 != null) {
				return false;
			}
		} else if (! activity0.equals(other.activity0)) {
			return false;
		}
		if (initialNode0==null) {
			if (other.initialNode0 != null) {
				return false;
			}
		} else if (! initialNode0.equals(other.initialNode0)) {
			return false;
		}
		return true;
	}

}