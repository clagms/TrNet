package class2relacionaldsltransoriginal;

public interface TrNetPat106InstancePublisher{
	public void registerListener(TrNetPat106InstanceListener listener);
	
	public void notifyListeners(TrNetPat106Instance element);
}