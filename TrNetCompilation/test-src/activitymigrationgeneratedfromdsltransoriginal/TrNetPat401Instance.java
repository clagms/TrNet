package activitymigrationgeneratedfromdsltransoriginal;

import generic.*;

public class TrNetPat401Instance{
	public ModelNode joinNode0;
	public ModelNode pseudostate0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((joinNode0==null) ? 0 : joinNode0.hashCode());
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
		TrNetPat401Instance other = (TrNetPat401Instance) obj;
		if (joinNode0==null) {
			if (other.joinNode0 != null) {
				return false;
			}
		} else if (! joinNode0.equals(other.joinNode0)) {
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