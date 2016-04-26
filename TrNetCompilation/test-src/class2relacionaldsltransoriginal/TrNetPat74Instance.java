package class2relacionaldsltransoriginal;

import generic.*;

public class TrNetPat74Instance{
	public ModelNode attribute0;
	public ModelNode column0;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((attribute0==null) ? 0 : attribute0.hashCode());
		result = prime * result + ((column0==null) ? 0 : column0.hashCode());
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
		TrNetPat74Instance other = (TrNetPat74Instance) obj;
		if (attribute0==null) {
			if (other.attribute0 != null) {
				return false;
			}
		} else if (! attribute0.equals(other.attribute0)) {
			return false;
		}
		if (column0==null) {
			if (other.column0 != null) {
				return false;
			}
		} else if (! column0.equals(other.column0)) {
			return false;
		}
		return true;
	}

}