package activitymigration;

import generic.*;

public class TrNetPat9Instance{
	public ModelNode activityGraph0;
	public ModelNode transition0;
	public ModelNode activity0;
	public ModelNode objectFlow0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((activityGraph0==null) ? 0 : activityGraph0.hashCode());
		result = prime * result + ((transition0==null) ? 0 : transition0.hashCode());
		result = prime * result + ((activity0==null) ? 0 : activity0.hashCode());
		result = prime * result + ((objectFlow0==null) ? 0 : objectFlow0.hashCode());
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
		TrNetPat9Instance other = (TrNetPat9Instance) obj;
		if (activityGraph0==null) {
			if (other.activityGraph0 != null) {
				return false;
			}
		} else if (! activityGraph0.equals(other.activityGraph0)) {
			return false;
		}
		if (transition0==null) {
			if (other.transition0 != null) {
				return false;
			}
		} else if (! transition0.equals(other.transition0)) {
			return false;
		}
		if (activity0==null) {
			if (other.activity0 != null) {
				return false;
			}
		} else if (! activity0.equals(other.activity0)) {
			return false;
		}
		if (objectFlow0==null) {
			if (other.objectFlow0 != null) {
				return false;
			}
		} else if (! objectFlow0.equals(other.objectFlow0)) {
			return false;
		}
		return true;
	}

}