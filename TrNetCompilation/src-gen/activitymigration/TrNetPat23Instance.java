package activitymigration;

import generic.*;

public class TrNetPat23Instance{
	public ModelNode activityPartition0;
	public ModelNode activityEdge0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((activityPartition0==null) ? 0 : activityPartition0.hashCode());
		result = prime * result + ((activityEdge0==null) ? 0 : activityEdge0.hashCode());
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
		TrNetPat23Instance other = (TrNetPat23Instance) obj;
		if (activityPartition0==null) {
			if (other.activityPartition0 != null) {
				return false;
			}
		} else if (! activityPartition0.equals(other.activityPartition0)) {
			return false;
		}
		if (activityEdge0==null) {
			if (other.activityEdge0 != null) {
				return false;
			}
		} else if (! activityEdge0.equals(other.activityEdge0)) {
			return false;
		}
		return true;
	}

}