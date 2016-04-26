package activitymigration;

import generic.*;

public class TrNetPat5Instance{
	public ModelNode package0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((package0==null) ? 0 : package0.hashCode());
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
		TrNetPat5Instance other = (TrNetPat5Instance) obj;
		if (package0==null) {
			if (other.package0 != null) {
				return false;
			}
		} else if (! package0.equals(other.package0)) {
			return false;
		}
		return true;
	}

}