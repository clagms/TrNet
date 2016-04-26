package class2relationaloriginal;

import generic.*;

public class TrNetPat23Instance{
	public ModelNode table0;
	public ModelNode cClass0;
	public ModelNode cClass1;
	public ModelNode column0;
	public ModelNode table1;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((table0==null) ? 0 : table0.hashCode());
		result = prime * result + ((cClass0==null) ? 0 : cClass0.hashCode());
		result = prime * result + ((cClass1==null) ? 0 : cClass1.hashCode());
		result = prime * result + ((column0==null) ? 0 : column0.hashCode());
		result = prime * result + ((table1==null) ? 0 : table1.hashCode());
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
		TrNetPat23Instance other = (TrNetPat23Instance) obj;
		if (table0==null) {
			if (other.table0 != null) {
				return false;
			}
		} else if (! table0.equals(other.table0)) {
			return false;
		}
		if (cClass0==null) {
			if (other.cClass0 != null) {
				return false;
			}
		} else if (! cClass0.equals(other.cClass0)) {
			return false;
		}
		if (cClass1==null) {
			if (other.cClass1 != null) {
				return false;
			}
		} else if (! cClass1.equals(other.cClass1)) {
			return false;
		}
		if (column0==null) {
			if (other.column0 != null) {
				return false;
			}
		} else if (! column0.equals(other.column0)) {
			return false;
		}
		if (table1==null) {
			if (other.table1 != null) {
				return false;
			}
		} else if (! table1.equals(other.table1)) {
			return false;
		}
		return true;
	}

}