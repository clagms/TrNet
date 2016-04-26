package activitymigration;

import generic.*;

public class TrNetPat44Instance{
	public ModelNode transition0;
	public ModelNode stateVertex0;
	public ModelNode stateVertex1;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((transition0==null) ? 0 : transition0.hashCode());
		result = prime * result + ((stateVertex0==null) ? 0 : stateVertex0.hashCode());
		result = prime * result + ((stateVertex1==null) ? 0 : stateVertex1.hashCode());
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
		TrNetPat44Instance other = (TrNetPat44Instance) obj;
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
		if (stateVertex1==null) {
			if (other.stateVertex1 != null) {
				return false;
			}
		} else if (! stateVertex1.equals(other.stateVertex1)) {
			return false;
		}
		return true;
	}

}