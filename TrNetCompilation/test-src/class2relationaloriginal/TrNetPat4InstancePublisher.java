package class2relationaloriginal;

public interface TrNetPat4InstancePublisher{
	public void registerListener(TrNetPat4InstanceListener listener);
	
	public void notifyListeners(TrNetPat4Instance element);
}