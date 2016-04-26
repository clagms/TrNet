package activitymigrationgeneratedfromdsltransoriginal;

import generic.*;

public class TrNetPat92Instance{
	public ModelNode objectFlow0;
	public ModelNode finalState0;
	public ModelNode activityFinalNode0;
	public ModelNode transition0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((objectFlow0==null) ? 0 : objectFlow0.hashCode());
		result = prime * result + ((finalState0==null) ? 0 : finalState0.hashCode());
		result = prime * result + ((activityFinalNode0==null) ? 0 : activityFinalNode0.hashCode());
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
		TrNetPat92Instance other = (TrNetPat92Instance) obj;
		if (objectFlow0==null) {
			if (other.objectFlow0 != null) {
				return false;
			}
		} else if (! objectFlow0.equals(other.objectFlow0)) {
			return false;
		}
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