package activitymigrationoriginal;

import generic.*;

public class TrNetPat14Instance{
	public ModelNode compositeState0;
	public ModelNode stateVertex0;
	public ModelNode activityGraph0;
	public ModelNode activity0;
	public ModelNode activityNode0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((compositeState0==null) ? 0 : compositeState0.hashCode());
		result = prime * result + ((stateVertex0==null) ? 0 : stateVertex0.hashCode());
		result = prime * result + ((activityGraph0==null) ? 0 : activityGraph0.hashCode());
		result = prime * result + ((activity0==null) ? 0 : activity0.hashCode());
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
		TrNetPat14Instance other = (TrNetPat14Instance) obj;
		if (compositeState0==null) {
			if (other.compositeState0 != null) {
				return false;
			}
		} else if (! compositeState0.equals(other.compositeState0)) {
			return false;
		}
		if (stateVertex0==null) {
			if (other.stateVertex0 != null) {
				return false;
			}
		} else if (! stateVertex0.equals(other.stateVertex0)) {
			return false;
		}
		if (activityGraph0==null) {
			if (other.activityGraph0 != null) {
				return false;
			}
		} else if (! activityGraph0.equals(other.activityGraph0)) {
			return false;
		}
		if (activity0==null) {
			if (other.activity0 != null) {
				return false;
			}
		} else if (! activity0.equals(other.activity0)) {
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