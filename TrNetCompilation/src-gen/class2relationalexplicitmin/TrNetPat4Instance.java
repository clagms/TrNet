package class2relationalexplicitmin;

import generic.*;

public class TrNetPat4Instance{
	public ModelNode database0;
	public ModelNode type0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((database0==null) ? 0 : database0.hashCode());
		result = prime * result + ((type0==null) ? 0 : type0.hashCode());
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
		TrNetPat4Instance other = (TrNetPat4Instance) obj;
		if (database0==null) {
			if (other.database0 != null) {
				return false;
			}
		} else if (! database0.equals(other.database0)) {
			return false;
		}
		if (type0==null) {
			if (other.type0 != null) {
				return false;
			}
		} else if (! type0.equals(other.type0)) {
			return false;
		}
		return true;
	}

}