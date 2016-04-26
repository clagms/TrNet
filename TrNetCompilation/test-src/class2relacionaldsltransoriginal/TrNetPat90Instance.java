package class2relacionaldsltransoriginal;

import generic.*;

public class TrNetPat90Instance{
	public ModelNode column0;
	public ModelNode cClass0;
	public ModelNode cClass1;
	public ModelNode datatype0;
	public ModelNode type0;
	public ModelNode cClass2;
	public ModelNode cClass3;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + ((column0==null) ? 0 : column0.hashCode());
		result = prime * result + ((cClass0==null) ? 0 : cClass0.hashCode());
		result = prime * result + ((cClass1==null) ? 0 : cClass1.hashCode());
		result = prime * result + ((datatype0==null) ? 0 : datatype0.hashCode());
		result = prime * result + ((type0==null) ? 0 : type0.hashCode());
		result = prime * result + ((cClass2==null) ? 0 : cClass2.hashCode());
		result = prime * result + ((cClass3==null) ? 0 : cClass3.hashCode());
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
		TrNetPat90Instance other = (TrNetPat90Instance) obj;
		if (column0==null) {
			if (other.column0 != null) {
				return false;
			}
		} else if (! column0.equals(other.column0)) {
			return false;
		}
		if (cClass0==null) {
			if (other.cClass0 != null) {
				return false;
			}
		} else if (! cClass0.equals(other.cClass0)) {
			return false;
		}
		if (cClass1==null) {
			if (other.cClass1 != null) {
				return false;
			}
		} else if (! cClass1.equals(other.cClass1)) {
			return false;
		}
		if (datatype0==null) {
			if (other.datatype0 != null) {
				return false;
			}
		} else if (! datatype0.equals(other.datatype0)) {
			return false;
		}
		if (type0==null) {
			if (other.type0 != null) {
				return false;
			}
		} else if (! type0.equals(other.type0)) {
			return false;
		}
		if (cClass2==null) {
			if (other.cClass2 != null) {
				return false;
			}
		} else if (! cClass2.equals(other.cClass2)) {
			return false;
		}
		if (cClass3==null) {
			if (other.cClass3 != null) {
				return false;
			}
		} else if (! cClass3.equals(other.cClass3)) {
			return false;
		}
		return true;
	}

}