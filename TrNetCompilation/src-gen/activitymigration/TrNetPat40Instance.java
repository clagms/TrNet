package activitymigration;

import generic.*;

public class TrNetPat40Instance{
	public ModelNode activityEdge0;
	public ModelNode activityNode0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((activityEdge0==null) ? 0 : activityEdge0.hashCode());
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
		TrNetPat40Instance other = (TrNetPat40Instance) obj;
		if (activityEdge0==null) {
			if (other.activityEdge0 != null) {
				return false;
			}
		} else if (! activityEdge0.equals(other.activityEdge0)) {
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