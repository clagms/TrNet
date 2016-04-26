package class2relationalexplicitmin;

import generic.*;

public class UnionTrNetPat26_TrNetPat24_0Instance{
	public ModelNode attribute0;
	public ModelNode type0;
	public ModelNode datatype0_0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((attribute0==null) ? 0 : attribute0.hashCode());
		result = prime * result + ((type0==null) ? 0 : type0.hashCode());
		result = prime * result + ((datatype0_0==null) ? 0 : datatype0_0.hashCode());
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
		UnionTrNetPat26_TrNetPat24_0Instance other = (UnionTrNetPat26_TrNetPat24_0Instance) obj;
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
		if (datatype0_0==null) {
			if (other.datatype0_0 != null) {
				return false;
			}
		} else if (! datatype0_0.equals(other.datatype0_0)) {
			return false;
		}
		return true;
	}

}