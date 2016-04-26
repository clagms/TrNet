package class2relacionaldsltransoriginal;

public interface TrNetPat94InstancePublisher{
	public void registerListener(TrNetPat94InstanceListener listener);
	
	public void notifyListeners(TrNetPat94Instance element);
}