package class2relational;

public interface TrNetPat9InstancePublisher{
	public void registerListener(TrNetPat9InstanceListener listener);
	
	public void notifyListeners(TrNetPat9Instance element);
}