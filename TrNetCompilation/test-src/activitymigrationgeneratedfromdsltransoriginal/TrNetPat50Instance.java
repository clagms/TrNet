package activitymigrationgeneratedfromdsltransoriginal;

import generic.*;

public class TrNetPat50Instance{
	public ModelNode activityPartition0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((activityPartition0==null) ? 0 : activityPartition0.hashCode());
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
		TrNetPat50Instance other = (TrNetPat50Instance) obj;
		if (activityPartition0==null) {
			if (other.activityPartition0 != null) {
				return false;
			}
		} else if (! activityPartition0.equals(other.activityPartition0)) {
			return false;
		}
		return true;
	}

}