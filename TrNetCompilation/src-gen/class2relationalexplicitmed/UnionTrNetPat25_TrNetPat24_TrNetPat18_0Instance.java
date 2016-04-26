package class2relationalexplicitmed;

import generic.*;

public class UnionTrNetPat25_TrNetPat24_TrNetPat18_0Instance{
	public ModelNode attribute0;
	public ModelNode type0;
	public ModelNode datatype0;
	public ModelNode cClass0_0;
	public ModelNode table0;
	public ModelNode column0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((attribute0==null) ? 0 : attribute0.hashCode());
		result = prime * result + ((type0==null) ? 0 : type0.hashCode());
		result = prime * result + ((datatype0==null) ? 0 : datatype0.hashCode());
		result = prime * result + ((cClass0_0==null) ? 0 : cClass0_0.hashCode());
		result = prime * result + ((table0==null) ? 0 : table0.hashCode());
		result = prime * result + ((column0==null) ? 0 : column0.hashCode());
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
		UnionTrNetPat25_TrNetPat24_TrNetPat18_0Instance other = (UnionTrNetPat25_TrNetPat24_TrNetPat18_0Instance) obj;
		if (attribute0==null) {
			if (other.attribute0 != null) {
				return false;
			}
		} else if (! attribute0.equals(other.attribute0)) {
			return false;
		}
		if (type0==null) {
			if (other.type0 != null) {
				return false;
			}
		} else if (! type0.equals(other.type0)) {
			return false;
		}
		if (datatype0==null) {
			if (other.datatype0 != null) {
				return false;
			}
		} else if (! datatype0.equals(other.datatype0)) {
			return false;
		}
		if (cClass0_0==null) {
			if (other.cClass0_0 != null) {
				return false;
			}
		} else if (! cClass0_0.equals(other.cClass0_0)) {
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
		return true;
	}

}