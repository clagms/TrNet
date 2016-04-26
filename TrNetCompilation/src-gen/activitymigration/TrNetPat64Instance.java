package activitymigration;

import generic.*;

public class TrNetPat64Instance{
	public ModelNode decisionNode0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((decisionNode0==null) ? 0 : decisionNode0.hashCode());
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
		TrNetPat64Instance other = (TrNetPat64Instance) obj;
		if (decisionNode0==null) {
			if (other.decisionNode0 != null) {
				return false;
			}
		} else if (! decisionNode0.equals(other.decisionNode0)) {
			return false;
		}
		return true;
	}

}