package activitymigration;

import generic.*;

public class TrNetPat3Instance{
	public ModelNode activity0;
	public ModelNode package0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((activity0==null) ? 0 : activity0.hashCode());
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
		TrNetPat3Instance other = (TrNetPat3Instance) obj;
		if (activity0==null) {
			if (other.activity0 != null) {
				return false;
			}
		} else if (! activity0.equals(other.activity0)) {
			return false;
		}
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