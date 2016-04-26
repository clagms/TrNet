package class2relacionaldsltransoriginal;

public interface TrNetPat97InstancePublisher{
	public void registerListener(TrNetPat97InstanceListener listener);
	
	public void notifyListeners(TrNetPat97Instance element);
}