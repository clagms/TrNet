package class2relacionaldsltransoriginal;

public interface TrNetPat40InstancePublisher{
	public void registerListener(TrNetPat40InstanceListener listener);
	
	public void notifyListeners(TrNetPat40Instance element);
}