package class2relacionaldsltransoriginal;

import generic.*;

public class TrNetPat79Instance{
	public ModelNode cClass0;
	public ModelNode table0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((cClass0==null) ? 0 : cClass0.hashCode());
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
		TrNetPat79Instance other = (TrNetPat79Instance) obj;
		if (cClass0==null) {
			if (other.cClass0 != null) {
				return false;
			}
		} else if (! cClass0.equals(other.cClass0)) {
			return false;
		}
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