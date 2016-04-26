package activitymigration;

import generic.*;

public class TrNetPat54Instance{
	public ModelNode finalState0;
	public ModelNode activityFinalNode0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((finalState0==null) ? 0 : finalState0.hashCode());
		result = prime * result + ((activityFinalNode0==null) ? 0 : activityFinalNode0.hashCode());
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
		TrNetPat54Instance other = (TrNetPat54Instance) obj;
		if (finalState0==null) {
			if (other.finalState0 != null) {
				return false;
			}
		} else if (! finalState0.equals(other.finalState0)) {
			return false;
		}
		if (activityFinalNode0==null) {
			if (other.activityFinalNode0 != null) {
				return false;
			}
		} else if (! activityFinalNode0.equals(other.activityFinalNode0)) {
			return false;
		}
		return true;
	}

}