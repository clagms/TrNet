package class2relacionaldsltransoriginal;

import generic.*;

public class TrNetPat112Instance{
	public ModelNode datatype0;
	public ModelNode cModel0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((datatype0==null) ? 0 : datatype0.hashCode());
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
		TrNetPat112Instance other = (TrNetPat112Instance) obj;
		if (datatype0==null) {
			if (other.datatype0 != null) {
				return false;
			}
		} else if (! datatype0.equals(other.datatype0)) {
			return false;
		}
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