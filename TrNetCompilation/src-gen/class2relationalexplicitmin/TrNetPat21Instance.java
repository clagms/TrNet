package class2relationalexplicitmin;

import generic.*;

public class TrNetPat21Instance{
	public ModelNode cClass0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((cClass0==null) ? 0 : cClass0.hashCode());
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
		TrNetPat21Instance other = (TrNetPat21Instance) obj;
		if (cClass0==null) {
			if (other.cClass0 != null) {
				return false;
			}
		} else if (! cClass0.equals(other.cClass0)) {
			return false;
		}
		return true;
	}

}