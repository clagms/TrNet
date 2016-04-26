package activitymigrationoriginal;

import generic.*;

public class TrNetPat27Instance{
	public ModelNode activityGraph0;
	public ModelNode partition0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((activityGraph0==null) ? 0 : activityGraph0.hashCode());
		result = prime * result + ((partition0==null) ? 0 : partition0.hashCode());
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
		TrNetPat27Instance other = (TrNetPat27Instance) obj;
		if (activityGraph0==null) {
			if (other.activityGraph0 != null) {
				return false;
			}
		} else if (! activityGraph0.equals(other.activityGraph0)) {
			return false;
		}
		if (partition0==null) {
			if (other.partition0 != null) {
				return false;
			}
		} else if (! partition0.equals(other.partition0)) {
			return false;
		}
		return true;
	}

}