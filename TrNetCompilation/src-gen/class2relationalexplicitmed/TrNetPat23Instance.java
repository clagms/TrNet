package class2relationalexplicitmed;

import generic.*;

public class TrNetPat23Instance{
	public ModelNode datatype0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((datatype0==null) ? 0 : datatype0.hashCode());
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
		TrNetPat23Instance other = (TrNetPat23Instance) obj;
		if (datatype0==null) {
			if (other.datatype0 != null) {
				return false;
			}
		} else if (! datatype0.equals(other.datatype0)) {
			return false;
		}
		return true;
	}

}