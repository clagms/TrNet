package activitymigration;

import generic.*;

public class TrNetPat50Instance{
	public ModelNode opaqueAction0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
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
		TrNetPat50Instance other = (TrNetPat50Instance) obj;
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