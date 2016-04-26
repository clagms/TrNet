package activitymigrationoriginal;

import generic.*;

public class TrNetPat70Instance{
	public ModelNode partition0;
	public ModelNode transition0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((partition0==null) ? 0 : partition0.hashCode());
		result = prime * result + ((transition0==null) ? 0 : transition0.hashCode());
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
		TrNetPat70Instance other = (TrNetPat70Instance) obj;
		if (partition0==null) {
			if (other.partition0 != null) {
				return false;
			}
		} else if (! partition0.equals(other.partition0)) {
			return false;
		}
		if (transition0==null) {
			if (other.transition0 != null) {
				return false;
			}
		} else if (! transition0.equals(other.transition0)) {
			return false;
		}
		return true;
	}

}