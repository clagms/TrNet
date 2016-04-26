package activitymigrationgeneratedfromdsltransoriginal;

import generic.*;

public class TrNetPat78Instance{
	public ModelNode objectFlow0;
	public ModelNode opaqueAction0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((objectFlow0==null) ? 0 : objectFlow0.hashCode());
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
		TrNetPat78Instance other = (TrNetPat78Instance) obj;
		if (objectFlow0==null) {
			if (other.objectFlow0 != null) {
				return false;
			}
		} else if (! objectFlow0.equals(other.objectFlow0)) {
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