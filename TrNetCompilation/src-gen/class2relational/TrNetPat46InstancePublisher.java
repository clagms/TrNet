package class2relational;

public interface TrNetPat46InstancePublisher{
	public void registerListener(TrNetPat46InstanceListener listener);
	
	public void notifyListeners(TrNetPat46Instance element);
}