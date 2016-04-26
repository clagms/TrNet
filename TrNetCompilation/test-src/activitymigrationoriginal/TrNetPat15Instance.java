package activitymigrationoriginal;

import generic.*;

public class TrNetPat15Instance{
	public ModelNode activityNode0;
	public ModelNode activity0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((activityNode0==null) ? 0 : activityNode0.hashCode());
		result = prime * result + ((activity0==null) ? 0 : activity0.hashCode());
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
		TrNetPat15Instance other = (TrNetPat15Instance) obj;
		if (activityNode0==null) {
			if (other.activityNode0 != null) {
				return false;
			}
		} else if (! activityNode0.equals(other.activityNode0)) {
			return false;
		}
		if (activity0==null) {
			if (other.activity0 != null) {
				return false;
			}
		} else if (! activity0.equals(other.activity0)) {
			return false;
		}
		return true;
	}

}