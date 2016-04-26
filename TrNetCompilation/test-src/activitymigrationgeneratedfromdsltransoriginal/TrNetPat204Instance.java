package activitymigrationgeneratedfromdsltransoriginal;

import generic.*;

public class TrNetPat204Instance{
	public ModelNode controlFlow0;
	public ModelNode opaqueExpression0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((controlFlow0==null) ? 0 : controlFlow0.hashCode());
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
		TrNetPat204Instance other = (TrNetPat204Instance) obj;
		if (controlFlow0==null) {
			if (other.controlFlow0 != null) {
				return false;
			}
		} else if (! controlFlow0.equals(other.controlFlow0)) {
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