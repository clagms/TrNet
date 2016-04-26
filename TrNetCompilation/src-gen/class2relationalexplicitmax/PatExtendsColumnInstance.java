package class2relationalexplicitmax;

import generic.*;

public class PatExtendsColumnInstance{
	public ModelNode table;
	public ModelNode column;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((table==null) ? 0 : table.hashCode());
		result = prime * result + ((column==null) ? 0 : column.hashCode());
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
		PatExtendsColumnInstance other = (PatExtendsColumnInstance) obj;
		if (table==null) {
			if (other.table != null) {
				return false;
			}
		} else if (! table.equals(other.table)) {
			return false;
		}
		if (column==null) {
			if (other.column != null) {
				return false;
			}
		} else if (! column.equals(other.column)) {
			return false;
		}
		return true;
	}

}