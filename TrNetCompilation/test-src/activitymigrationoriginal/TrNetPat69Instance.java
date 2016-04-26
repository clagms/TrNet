package activitymigrationoriginal;

import generic.*;

public class TrNetPat69Instance{
	public ModelNode booleanExpression0;
	public ModelNode guard0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
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
		TrNetPat69Instance other = (TrNetPat69Instance) obj;
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