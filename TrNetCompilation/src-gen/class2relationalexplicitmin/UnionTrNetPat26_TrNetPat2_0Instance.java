package class2relationalexplicitmin;

import generic.*;

public class UnionTrNetPat26_TrNetPat2_0Instance{
	public ModelNode attribute0;
	public ModelNode datatype0;
	public ModelNode database0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
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
		UnionTrNetPat26_TrNetPat2_0Instance other = (UnionTrNetPat26_TrNetPat2_0Instance) obj;
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