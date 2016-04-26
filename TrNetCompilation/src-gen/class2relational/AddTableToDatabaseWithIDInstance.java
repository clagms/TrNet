package class2relational;

import generic.*;

public class AddTableToDatabaseWithIDInstance{
	public ModelNode table0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((table0==null) ? 0 : table0.hashCode());
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
		AddTableToDatabaseWithIDInstance other = (AddTableToDatabaseWithIDInstance) obj;
		if (table0==null) {
			if (other.table0 != null) {
				return false;
			}
		} else if (! table0.equals(other.table0)) {
			return false;
		}
		return true;
	}

}