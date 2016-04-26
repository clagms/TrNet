package activitymigrationgeneratedfromdsltransoriginal;

import generic.*;

public class TrNetPat2Instance{
	public ModelNode activity0;
	public ModelNode activityGraph0;
	public ModelNode compositeState0;
	public ModelNode package0;
	public ModelNode activityGraph1;
	public ModelNode compositeState1;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((activity0==null) ? 0 : activity0.hashCode());
		result = prime * result + ((activityGraph0==null) ? 0 : activityGraph0.hashCode());
		result = prime * result + ((compositeState0==null) ? 0 : compositeState0.hashCode());
		result = prime * result + ((package0==null) ? 0 : package0.hashCode());
		result = prime * result + ((activityGraph1==null) ? 0 : activityGraph1.hashCode());
		result = prime * result + ((compositeState1==null) ? 0 : compositeState1.hashCode());
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
		TrNetPat2Instance other = (TrNetPat2Instance) obj;
		if (activity0==null) {
			if (other.activity0 != null) {
				return false;
			}
		} else if (! activity0.equals(other.activity0)) {
			return false;
		}
		if (activityGraph0==null) {
			if (other.activityGraph0 != null) {
				return false;
			}
		} else if (! activityGraph0.equals(other.activityGraph0)) {
			return false;
		}
		if (compositeState0==null) {
			if (other.compositeState0 != null) {
				return false;
			}
		} else if (! compositeState0.equals(other.compositeState0)) {
			return false;
		}
		if (package0==null) {
			if (other.package0 != null) {
				return false;
			}
		} else if (! package0.equals(other.package0)) {
			return false;
		}
		if (activityGraph1==null) {
			if (other.activityGraph1 != null) {
				return false;
			}
		} else if (! activityGraph1.equals(other.activityGraph1)) {
			return false;
		}
		if (compositeState1==null) {
			if (other.compositeState1 != null) {
				return false;
			}
		} else if (! compositeState1.equals(other.compositeState1)) {
			return false;
		}
		return true;
	}

}