package activitymigrationgeneratedfromdsltransoriginal;

import generic.*;

public class TrNetPat425Instance{
	public ModelNode initialNode0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
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
		TrNetPat425Instance other = (TrNetPat425Instance) obj;
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