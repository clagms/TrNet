package class2relacionaldsltransoriginal;

public interface TrNetPat39InstancePublisher{
	public void registerListener(TrNetPat39InstanceListener listener);
	
	public void notifyListeners(TrNetPat39Instance element);
}