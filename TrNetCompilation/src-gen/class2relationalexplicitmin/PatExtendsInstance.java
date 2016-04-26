package class2relationalexplicitmin;

import generic.*;

public class PatExtendsInstance{
	public ModelNode cClassSpecific;
	public ModelNode cClassParent;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((cClassSpecific==null) ? 0 : cClassSpecific.hashCode());
		result = prime * result + ((cClassParent==null) ? 0 : cClassParent.hashCode());
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
		PatExtendsInstance other = (PatExtendsInstance) obj;
		if (cClassSpecific==null) {
			if (other.cClassSpecific != null) {
				return false;
			}
		} else if (! cClassSpecific.equals(other.cClassSpecific)) {
			return false;
		}
		if (cClassParent==null) {
			if (other.cClassParent != null) {
				return false;
			}
		} else if (! cClassParent.equals(other.cClassParent)) {
			return false;
		}
		return true;
	}

}