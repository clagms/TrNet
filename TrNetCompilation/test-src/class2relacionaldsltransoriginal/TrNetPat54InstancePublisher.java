package class2relacionaldsltransoriginal;

public interface TrNetPat54InstancePublisher{
	public void registerListener(TrNetPat54InstanceListener listener);
	
	public void notifyListeners(TrNetPat54Instance element);
}