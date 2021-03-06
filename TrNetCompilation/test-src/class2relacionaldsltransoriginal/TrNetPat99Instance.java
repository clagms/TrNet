package class2relacionaldsltransoriginal;

import generic.*;

public class TrNetPat99Instance{
	public ModelNode cModel0;
	public ModelNode database0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((cModel0==null) ? 0 : cModel0.hashCode());
		result = prime * result + ((database0==null) ? 0 : database0.hashCode());
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
		TrNetPat99Instance other = (TrNetPat99Instance) obj;
		if (cModel0==null) {
			if (other.cModel0 != null) {
				return false;
			}
		} else if (! cModel0.equals(other.cModel0)) {
			return false;
		}
		if (database0==null) {
			if (other.database0 != null) {
				return false;
			}
		} else if (! database0.equals(other.database0)) {
			return false;
		}
		return true;
	}

}