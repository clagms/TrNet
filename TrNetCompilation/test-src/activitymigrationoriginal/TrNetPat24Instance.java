package activitymigrationoriginal;

import generic.*;

public class TrNetPat24Instance{
	public ModelNode partition0;
	public ModelNode stateVertex0;
	public ModelNode activityPartition0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((partition0==null) ? 0 : partition0.hashCode());
		result = prime * result + ((stateVertex0==null) ? 0 : stateVertex0.hashCode());
		result = prime * result + ((activityPartition0==null) ? 0 : activityPartition0.hashCode());
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
		TrNetPat24Instance other = (TrNetPat24Instance) obj;
		if (partition0==null) {
			if (other.partition0 != null) {
				return false;
			}
		} else if (! partition0.equals(other.partition0)) {
			return false;
		}
		if (stateVertex0==null) {
			if (other.stateVertex0 != null) {
				return false;
			}
		} else if (! stateVertex0.equals(other.stateVertex0)) {
			return false;
		}
		if (activityPartition0==null) {
			if (other.activityPartition0 != null) {
				return false;
			}
		} else if (! activityPartition0.equals(other.activityPartition0)) {
			return false;
		}
		return true;
	}

}