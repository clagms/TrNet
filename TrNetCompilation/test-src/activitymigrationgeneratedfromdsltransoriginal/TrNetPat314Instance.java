package activitymigrationgeneratedfromdsltransoriginal;

import generic.*;

public class TrNetPat314Instance{
	public ModelNode transition0;
	public ModelNode finalState0;
	public ModelNode finalState1;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((transition0==null) ? 0 : transition0.hashCode());
		result = prime * result + ((finalState0==null) ? 0 : finalState0.hashCode());
		result = prime * result + ((finalState1==null) ? 0 : finalState1.hashCode());
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
		TrNetPat314Instance other = (TrNetPat314Instance) obj;
		if (transition0==null) {
			if (other.transition0 != null) {
				return false;
			}
		} else if (! transition0.equals(other.transition0)) {
			return false;
		}
		if (finalState0==null) {
			if (other.finalState0 != null) {
				return false;
			}
		} else if (! finalState0.equals(other.finalState0)) {
			return false;
		}
		if (finalState1==null) {
			if (other.finalState1 != null) {
				return false;
			}
		} else if (! finalState1.equals(other.finalState1)) {
			return false;
		}
		return true;
	}

}