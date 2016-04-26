package class2relationalexplicitmin;

import generic.*;

public class UnionTrNetPat27_TrNetPat25_TrNetPat2_0Instance{
	public ModelNode attribute0;
	public ModelNode cClass0;
	public ModelNode cClass0_0;
	public ModelNode database0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((attribute0==null) ? 0 : attribute0.hashCode());
		result = prime * result + ((cClass0==null) ? 0 : cClass0.hashCode());
		result = prime * result + ((cClass0_0==null) ? 0 : cClass0_0.hashCode());
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
		UnionTrNetPat27_TrNetPat25_TrNetPat2_0Instance other = (UnionTrNetPat27_TrNetPat25_TrNetPat2_0Instance) obj;
		if (attribute0==null) {
			if (other.attribute0 != null) {
				return false;
			}
		} else if (! attribute0.equals(other.attribute0)) {
			return false;
		}
		if (cClass0==null) {
			if (other.cClass0 != null) {
				return false;
			}
		} else if (! cClass0.equals(other.cClass0)) {
			return false;
		}
		if (cClass0_0==null) {
			if (other.cClass0_0 != null) {
				return false;
			}
		} else if (! cClass0_0.equals(other.cClass0_0)) {
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