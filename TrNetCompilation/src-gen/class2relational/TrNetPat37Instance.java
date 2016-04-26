package class2relational;

import generic.*;

public class TrNetPat37Instance{
	public ModelNode table0;
	public ModelNode column0;
	public ModelNode column1;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((table0==null) ? 0 : table0.hashCode());
		result = prime * result + ((column0==null) ? 0 : column0.hashCode());
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
		TrNetPat37Instance other = (TrNetPat37Instance) obj;
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