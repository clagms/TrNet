package activitymigration;

import generic.*;

public class TrNetPat57Instance{
	public ModelNode pseudostate0;
	public ModelNode initialNode0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((pseudostate0==null) ? 0 : pseudostate0.hashCode());
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
		TrNetPat57Instance other = (TrNetPat57Instance) obj;
		if (pseudostate0==null) {
			if (other.pseudostate0 != null) {
				return false;
			}
		} else if (! pseudostate0.equals(other.pseudostate0)) {
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