package activitymigrationgeneratedfromdsltransoriginal;

import generic.*;

public class TrNetPat18Instance{
	public ModelNode compositeState0;
	public ModelNode activity0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((compositeState0==null) ? 0 : compositeState0.hashCode());
		result = prime * result + ((activity0==null) ? 0 : activity0.hashCode());
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
		TrNetPat18Instance other = (TrNetPat18Instance) obj;
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
		return true;
	}

}