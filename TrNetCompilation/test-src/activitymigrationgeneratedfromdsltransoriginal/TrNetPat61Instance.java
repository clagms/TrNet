package activitymigrationgeneratedfromdsltransoriginal;

import generic.*;

public class TrNetPat61Instance{
	public ModelNode guard0;
	public ModelNode transition0;
	public ModelNode objectFlow0;
	public ModelNode opaqueExpression0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((guard0==null) ? 0 : guard0.hashCode());
		result = prime * result + ((transition0==null) ? 0 : transition0.hashCode());
		result = prime * result + ((objectFlow0==null) ? 0 : objectFlow0.hashCode());
		result = prime * result + ((opaqueExpression0==null) ? 0 : opaqueExpression0.hashCode());
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
		TrNetPat61Instance other = (TrNetPat61Instance) obj;
		if (guard0==null) {
			if (other.guard0 != null) {
				return false;
			}
		} else if (! guard0.equals(other.guard0)) {
			return false;
		}
		if (transition0==null) {
			if (other.transition0 != null) {
				return false;
			}
		} else if (! transition0.equals(other.transition0)) {
			return false;
		}
		if (objectFlow0==null) {
			if (other.objectFlow0 != null) {
				return false;
			}
		} else if (! objectFlow0.equals(other.objectFlow0)) {
			return false;
		}
		if (opaqueExpression0==null) {
			if (other.opaqueExpression0 != null) {
				return false;
			}
		} else if (! opaqueExpression0.equals(other.opaqueExpression0)) {
			return false;
		}
		return true;
	}

}