package activitymigrationgeneratedfromdsltransoriginal;

import generic.*;

public class TrNetPat30Instance{
	public ModelNode activity0;
	public ModelNode activityParameterNode0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((activity0==null) ? 0 : activity0.hashCode());
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
		TrNetPat30Instance other = (TrNetPat30Instance) obj;
		if (activity0==null) {
			if (other.activity0 != null) {
				return false;
			}
		} else if (! activity0.equals(other.activity0)) {
			return false;
		}
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