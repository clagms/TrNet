package class2relationalexplicitmax;

import generic.*;

public class TrNetPat3Instance{
	public ModelNode database0;
	public ModelNode table0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((database0==null) ? 0 : database0.hashCode());
		result = prime * result + ((table0==null) ? 0 : table0.hashCode());
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
		TrNetPat3Instance other = (TrNetPat3Instance) obj;
		if (database0==null) {
			if (other.database0 != null) {
				return false;
			}
		} else if (! database0.equals(other.database0)) {
			return false;
		}
		if (table0==null) {
			if (other.table0 != null) {
				return false;
			}
		} else if (! table0.equals(other.table0)) {
			return false;
		}
		return true;
	}

}