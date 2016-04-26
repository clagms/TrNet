package activitymigrationoriginal;

import generic.*;

public class TrNetPat60Instance{
	public ModelNode joinNode0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((joinNode0==null) ? 0 : joinNode0.hashCode());
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
		TrNetPat60Instance other = (TrNetPat60Instance) obj;
		if (joinNode0==null) {
			if (other.joinNode0 != null) {
				return false;
			}
		} else if (! joinNode0.equals(other.joinNode0)) {
			return false;
		}
		return true;
	}

}