package activitymigrationgeneratedfromdsltransoriginal;

import generic.*;

public class TrNetPat418Instance{
	public ModelNode pseudostate0;
	public ModelNode compositeState0;
	public ModelNode decisionNode0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((pseudostate0==null) ? 0 : pseudostate0.hashCode());
		result = prime * result + ((compositeState0==null) ? 0 : compositeState0.hashCode());
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
		TrNetPat418Instance other = (TrNetPat418Instance) obj;
		if (pseudostate0==null) {
			if (other.pseudostate0 != null) {
				return false;
			}
		} else if (! pseudostate0.equals(other.pseudostate0)) {
			return false;
		}
		if (compositeState0==null) {
			if (other.compositeState0 != null) {
				return false;
			}
		} else if (! compositeState0.equals(other.compositeState0)) {
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