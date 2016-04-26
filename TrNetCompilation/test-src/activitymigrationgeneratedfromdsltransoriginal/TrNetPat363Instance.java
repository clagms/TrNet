package activitymigrationgeneratedfromdsltransoriginal;

import generic.*;

public class TrNetPat363Instance{
	public ModelNode opaqueExpression0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
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
		TrNetPat363Instance other = (TrNetPat363Instance) obj;
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