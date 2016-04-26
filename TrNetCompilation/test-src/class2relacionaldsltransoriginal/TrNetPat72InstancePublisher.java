package class2relacionaldsltransoriginal;

public interface TrNetPat72InstancePublisher{
	public void registerListener(TrNetPat72InstanceListener listener);
	
	public void notifyListeners(TrNetPat72Instance element);
}