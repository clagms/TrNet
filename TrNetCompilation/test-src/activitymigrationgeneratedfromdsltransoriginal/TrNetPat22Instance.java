package activitymigrationgeneratedfromdsltransoriginal;

import generic.*;

public class TrNetPat22Instance{
	public ModelNode activity0;
	public ModelNode opaqueAction0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((activity0==null) ? 0 : activity0.hashCode());
		result = prime * result + ((opaqueAction0==null) ? 0 : opaqueAction0.hashCode());
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
		TrNetPat22Instance other = (TrNetPat22Instance) obj;
		if (activity0==null) {
			if (other.activity0 != null) {
				return false;
			}
		} else if (! activity0.equals(other.activity0)) {
			return false;
		}
		if (opaqueAction0==null) {
			if (other.opaqueAction0 != null) {
				return false;
			}
		} else if (! opaqueAction0.equals(other.opaqueAction0)) {
			return false;
		}
		return true;
	}

}