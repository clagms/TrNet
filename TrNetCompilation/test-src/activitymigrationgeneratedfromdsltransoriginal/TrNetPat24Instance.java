package activitymigrationgeneratedfromdsltransoriginal;

import generic.*;

public class TrNetPat24Instance{
	public ModelNode finalState0;
	public ModelNode compositeState0;
	public ModelNode activity0;
	public ModelNode activityFinalNode0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((finalState0==null) ? 0 : finalState0.hashCode());
		result = prime * result + ((compositeState0==null) ? 0 : compositeState0.hashCode());
		result = prime * result + ((activity0==null) ? 0 : activity0.hashCode());
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
		TrNetPat24Instance other = (TrNetPat24Instance) obj;
		if (finalState0==null) {
			if (other.finalState0 != null) {
				return false;
			}
		} else if (! finalState0.equals(other.finalState0)) {
			return false;
		}
		if (compositeState0==null) {
			if (other.compositeState0 != null) {
				return false;
			}
		} else if (! compositeState0.equals(other.compositeState0)) {
			return false;
		}
		if (activity0==null) {
			if (other.activity0 != null) {
				return false;
			}
		} else if (! activity0.equals(other.activity0)) {
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