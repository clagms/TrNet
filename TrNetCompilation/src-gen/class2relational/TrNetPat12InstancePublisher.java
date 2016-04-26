package class2relational;

public interface TrNetPat12InstancePublisher{
	public void registerListener(TrNetPat12InstanceListener listener);
	
	public void notifyListeners(TrNetPat12Instance element);
}