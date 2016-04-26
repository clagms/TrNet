package activitymigration;

import generic.*;

public class TrNetPat38Instance{
	public ModelNode activityEdge0;
	public ModelNode transition0;
	public ModelNode stateVertex0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((activityEdge0==null) ? 0 : activityEdge0.hashCode());
		result = prime * result + ((transition0==null) ? 0 : transition0.hashCode());
		result = prime * result + ((stateVertex0==null) ? 0 : stateVertex0.hashCode());
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
		TrNetPat38Instance other = (TrNetPat38Instance) obj;
		if (activityEdge0==null) {
			if (other.activityEdge0 != null) {
				return false;
			}
		} else if (! activityEdge0.equals(other.activityEdge0)) {
			return false;
		}
		if (transition0==null) {
			if (other.transition0 != null) {
				return false;
			}
		} else if (! transition0.equals(other.transition0)) {
			return false;
		}
		if (stateVertex0==null) {
			if (other.stateVertex0 != null) {
				return false;
			}
		} else if (! stateVertex0.equals(other.stateVertex0)) {
			return false;
		}
		return true;
	}

}