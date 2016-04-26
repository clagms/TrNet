package class2relationalexplicitmed;

import generic.*;

public class PatternTypeInstance{
	public ModelNode type;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((type==null) ? 0 : type.hashCode());
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
		PatternTypeInstance other = (PatternTypeInstance) obj;
		if (type==null) {
			if (other.type != null) {
				return false;
			}
		} else if (! type.equals(other.type)) {
			return false;
		}
		return true;
	}

}