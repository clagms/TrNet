package class2relacionaldsltransoriginal;

public interface TrNetPat84InstancePublisher{
	public void registerListener(TrNetPat84InstanceListener listener);
	
	public void notifyListeners(TrNetPat84Instance element);
}