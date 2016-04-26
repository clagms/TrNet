package class2relationalexplicitmin;

import generic.*;

public class TrNetPat5Instance{
	public ModelNode database0;
	public ModelNode table0;
	public ModelNode column0;
	public ModelNode type0;
	public ModelNode column1;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((database0==null) ? 0 : database0.hashCode());
		result = prime * result + ((table0==null) ? 0 : table0.hashCode());
		result = prime * result + ((column0==null) ? 0 : column0.hashCode());
		result = prime * result + ((type0==null) ? 0 : type0.hashCode());
		result = prime * result + ((column1==null) ? 0 : column1.hashCode());
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
		TrNetPat5Instance other = (TrNetPat5Instance) obj;
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
		if (column0==null) {
			if (other.column0 != null) {
				return false;
			}
		} else if (! column0.equals(other.column0)) {
			return false;
		}
		if (type0==null) {
			if (other.type0 != null) {
				return false;
			}
		} else if (! type0.equals(other.type0)) {
			return false;
		}
		if (column1==null) {
			if (other.column1 != null) {
				return false;
			}
		} else if (! column1.equals(other.column1)) {
			return false;
		}
		return true;
	}

}