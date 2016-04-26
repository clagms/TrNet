package class2relationalexplicitmax;

import generic.*;

public class TrNetPat24Instance{
	public ModelNode type0;
	public ModelNode datatype0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((type0==null) ? 0 : type0.hashCode());
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
		TrNetPat24Instance other = (TrNetPat24Instance) obj;
		if (type0==null) {
			if (other.type0 != null) {
				return false;
			}
		} else if (! type0.equals(other.type0)) {
			return false;
		}
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