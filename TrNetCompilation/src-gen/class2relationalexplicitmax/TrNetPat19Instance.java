package class2relationalexplicitmax;

import generic.*;

public class TrNetPat19Instance{
	public ModelNode column0;
	public ModelNode table0;
	public ModelNode type0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((column0==null) ? 0 : column0.hashCode());
		result = prime * result + ((table0==null) ? 0 : table0.hashCode());
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
		TrNetPat19Instance other = (TrNetPat19Instance) obj;
		if (column0==null) {
			if (other.column0 != null) {
				return false;
			}
		} else if (! column0.equals(other.column0)) {
			return false;
		}
		if (table0==null) {
			if (other.table0 != null) {
				return false;
			}
		} else if (! table0.equals(other.table0)) {
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