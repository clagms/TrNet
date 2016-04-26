package activitymigrationgeneratedfromdsltransoriginal;

import generic.*;

public class TrNetPat438Instance{
	public ModelNode compositeState0;
	public ModelNode finalState0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((compositeState0==null) ? 0 : compositeState0.hashCode());
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
		TrNetPat438Instance other = (TrNetPat438Instance) obj;
		if (compositeState0==null) {
			if (other.compositeState0 != null) {
				return false;
			}
		} else if (! compositeState0.equals(other.compositeState0)) {
			return false;
		}
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