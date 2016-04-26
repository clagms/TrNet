package activitymigrationgeneratedfromdsltransoriginal;

import generic.*;

public class TrNetPat389Instance{
	public ModelNode activityParameterNode0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((activityParameterNode0==null) ? 0 : activityParameterNode0.hashCode());
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
		TrNetPat389Instance other = (TrNetPat389Instance) obj;
		if (activityParameterNode0==null) {
			if (other.activityParameterNode0 != null) {
				return false;
			}
		} else if (! activityParameterNode0.equals(other.activityParameterNode0)) {
			return false;
		}
		return true;
	}

}