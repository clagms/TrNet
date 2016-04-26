package class2relationaloriginal;

import generic.*;

public class TrNetPat17Instance{
	public ModelNode foreignKey0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
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
		TrNetPat17Instance other = (TrNetPat17Instance) obj;
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