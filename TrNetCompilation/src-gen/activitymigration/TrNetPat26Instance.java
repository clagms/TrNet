package activitymigration;

import generic.*;

public class TrNetPat26Instance{
	public ModelNode activityPartition0;
	public ModelNode activityNode0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((activityPartition0==null) ? 0 : activityPartition0.hashCode());
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
		TrNetPat26Instance other = (TrNetPat26Instance) obj;
		if (activityPartition0==null) {
			if (other.activityPartition0 != null) {
				return false;
			}
		} else if (! activityPartition0.equals(other.activityPartition0)) {
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