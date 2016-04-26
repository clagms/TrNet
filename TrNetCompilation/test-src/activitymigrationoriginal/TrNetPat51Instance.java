package activitymigrationoriginal;

import generic.*;

public class TrNetPat51Instance{
	public ModelNode stateVertex0;
	public ModelNode activityNode0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((stateVertex0==null) ? 0 : stateVertex0.hashCode());
		result = prime * result + ((activityNode0==null) ? 0 : activityNode0.hashCode());
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
		TrNetPat51Instance other = (TrNetPat51Instance) obj;
		if (stateVertex0==null) {
			if (other.stateVertex0 != null) {
				return false;
			}
		} else if (! stateVertex0.equals(other.stateVertex0)) {
			return false;
		}
		if (activityNode0==null) {
			if (other.activityNode0 != null) {
				return false;
			}
		} else if (! activityNode0.equals(other.activityNode0)) {
			return false;
		}
		return true;
	}

}