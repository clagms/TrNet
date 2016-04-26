package activitymigration;

import generic.*;

public class TrNetPat35Instance{
	public ModelNode guard0;
	public ModelNode transition0;
	public ModelNode activityEdge0;
	public ModelNode booleanExpression0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((guard0==null) ? 0 : guard0.hashCode());
		result = prime * result + ((transition0==null) ? 0 : transition0.hashCode());
		result = prime * result + ((activityEdge0==null) ? 0 : activityEdge0.hashCode());
		result = prime * result + ((booleanExpression0==null) ? 0 : booleanExpression0.hashCode());
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
		TrNetPat35Instance other = (TrNetPat35Instance) obj;
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
		if (activityEdge0==null) {
			if (other.activityEdge0 != null) {
				return false;
			}
		} else if (! activityEdge0.equals(other.activityEdge0)) {
			return false;
		}
		if (booleanExpression0==null) {
			if (other.booleanExpression0 != null) {
				return false;
			}
		} else if (! booleanExpression0.equals(other.booleanExpression0)) {
			return false;
		}
		return true;
	}

}