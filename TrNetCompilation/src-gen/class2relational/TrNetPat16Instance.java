package class2relational;

import generic.*;

public class TrNetPat16Instance{
	public ModelNode column0;
	public ModelNode foreignKey0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((column0==null) ? 0 : column0.hashCode());
		result = prime * result + ((foreignKey0==null) ? 0 : foreignKey0.hashCode());
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
		TrNetPat16Instance other = (TrNetPat16Instance) obj;
		if (column0==null) {
			if (other.column0 != null) {
				return false;
			}
		} else if (! column0.equals(other.column0)) {
			return false;
		}
		if (foreignKey0==null) {
			if (other.foreignKey0 != null) {
				return false;
			}
		} else if (! foreignKey0.equals(other.foreignKey0)) {
			return false;
		}
		return true;
	}

}