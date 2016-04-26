package class2relationalexplicitmed;

import generic.*;

public class UnionTrNetPat18_TrNetPat26_TrNetPat2_0Instance{
	public ModelNode cClass0;
	public ModelNode table0;
	public ModelNode column0;
	public ModelNode attribute0;
	public ModelNode datatype0;
	public ModelNode database0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((cClass0==null) ? 0 : cClass0.hashCode());
		result = prime * result + ((table0==null) ? 0 : table0.hashCode());
		result = prime * result + ((column0==null) ? 0 : column0.hashCode());
		result = prime * result + ((attribute0==null) ? 0 : attribute0.hashCode());
		result = prime * result + ((datatype0==null) ? 0 : datatype0.hashCode());
		result = prime * result + ((database0==null) ? 0 : database0.hashCode());
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
		UnionTrNetPat18_TrNetPat26_TrNetPat2_0Instance other = (UnionTrNetPat18_TrNetPat26_TrNetPat2_0Instance) obj;
		if (cClass0==null) {
			if (other.cClass0 != null) {
				return false;
			}
		} else if (! cClass0.equals(other.cClass0)) {
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
		if (attribute0==null) {
			if (other.attribute0 != null) {
				return false;
			}
		} else if (! attribute0.equals(other.attribute0)) {
			return false;
		}
		if (datatype0==null) {
			if (other.datatype0 != null) {
				return false;
			}
		} else if (! datatype0.equals(other.datatype0)) {
			return false;
		}
		if (database0==null) {
			if (other.database0 != null) {
				return false;
			}
		} else if (! database0.equals(other.database0)) {
			return false;
		}
		return true;
	}

}