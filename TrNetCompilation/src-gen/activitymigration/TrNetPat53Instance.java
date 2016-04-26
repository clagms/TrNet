package activitymigration;

import generic.*;

public class TrNetPat53Instance{
	public ModelNode finalState0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((finalState0==null) ? 0 : finalState0.hashCode());
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
		TrNetPat53Instance other = (TrNetPat53Instance) obj;
		if (finalState0==null) {
			if (other.finalState0 != null) {
				return false;
			}
		} else if (! finalState0.equals(other.finalState0)) {
			return false;
		}
		return true;
	}

}