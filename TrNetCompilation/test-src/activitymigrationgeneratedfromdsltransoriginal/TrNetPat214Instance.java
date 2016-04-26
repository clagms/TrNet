package activitymigrationgeneratedfromdsltransoriginal;

import generic.*;

public class TrNetPat214Instance{
	public ModelNode controlFlow0;
	public ModelNode decisionNode0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((controlFlow0==null) ? 0 : controlFlow0.hashCode());
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
		TrNetPat214Instance other = (TrNetPat214Instance) obj;
		if (controlFlow0==null) {
			if (other.controlFlow0 != null) {
				return false;
			}
		} else if (! controlFlow0.equals(other.controlFlow0)) {
			return false;
		}
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