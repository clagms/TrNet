package activitymigrationgeneratedfromdsltransoriginal;

import generic.*;

public class TrNetPat88Instance{
	public ModelNode objectFlow0;
	public ModelNode activityFinalNode0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((objectFlow0==null) ? 0 : objectFlow0.hashCode());
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
		TrNetPat88Instance other = (TrNetPat88Instance) obj;
		if (objectFlow0==null) {
			if (other.objectFlow0 != null) {
				return false;
			}
		} else if (! objectFlow0.equals(other.objectFlow0)) {
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