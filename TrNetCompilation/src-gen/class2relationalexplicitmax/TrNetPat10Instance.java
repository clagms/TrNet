package class2relationalexplicitmax;

import generic.*;

public class TrNetPat10Instance{
	public ModelNode type0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((type0==null) ? 0 : type0.hashCode());
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
		TrNetPat10Instance other = (TrNetPat10Instance) obj;
		if (type0==null) {
			if (other.type0 != null) {
				return false;
			}
		} else if (! type0.equals(other.type0)) {
			return false;
		}
		return true;
	}

}