package class2relationalexplicitmin;

import generic.*;

public class TrNetPat9Instance{
	public ModelNode column0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
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
		TrNetPat9Instance other = (TrNetPat9Instance) obj;
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