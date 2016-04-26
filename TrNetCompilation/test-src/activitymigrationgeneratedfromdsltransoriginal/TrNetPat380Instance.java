package activitymigrationgeneratedfromdsltransoriginal;

import generic.*;

public class TrNetPat380Instance{
	public ModelNode activityFinalNode0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
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
		TrNetPat380Instance other = (TrNetPat380Instance) obj;
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