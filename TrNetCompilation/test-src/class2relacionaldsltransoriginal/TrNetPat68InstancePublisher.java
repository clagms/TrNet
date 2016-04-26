package class2relacionaldsltransoriginal;

public interface TrNetPat68InstancePublisher{
	public void registerListener(TrNetPat68InstanceListener listener);
	
	public void notifyListeners(TrNetPat68Instance element);
}