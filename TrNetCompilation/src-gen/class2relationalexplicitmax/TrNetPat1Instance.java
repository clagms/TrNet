package class2relationalexplicitmax;

import generic.*;

public class TrNetPat1Instance{
	public ModelNode cModel0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((cModel0==null) ? 0 : cModel0.hashCode());
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
		TrNetPat1Instance other = (TrNetPat1Instance) obj;
		if (cModel0==null) {
			if (other.cModel0 != null) {
				return false;
			}
		} else if (! cModel0.equals(other.cModel0)) {
			return false;
		}
		return true;
	}

}