package activitymigrationgeneratedfromdsltransoriginal;

import generic.*;

public class TrNetPat362Instance{
	public ModelNode opaqueExpression0;
	public ModelNode booleanExpression0;
	public ModelNode guard0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((opaqueExpression0==null) ? 0 : opaqueExpression0.hashCode());
		result = prime * result + ((booleanExpression0==null) ? 0 : booleanExpression0.hashCode());
		result = prime * result + ((guard0==null) ? 0 : guard0.hashCode());
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
		TrNetPat362Instance other = (TrNetPat362Instance) obj;
		if (opaqueExpression0==null) {
			if (other.opaqueExpression0 != null) {
				return false;
			}
		} else if (! opaqueExpression0.equals(other.opaqueExpression0)) {
			return false;
		}
		if (booleanExpression0==null) {
			if (other.booleanExpression0 != null) {
				return false;
			}
		} else if (! booleanExpression0.equals(other.booleanExpression0)) {
			return false;
		}
		if (guard0==null) {
			if (other.guard0 != null) {
				return false;
			}
		} else if (! guard0.equals(other.guard0)) {
			return false;
		}
		return true;
	}

}