package class2relational;

public interface TrNetPat1InstancePublisher{
	public void registerListener(TrNetPat1InstanceListener listener);
	
	public void notifyListeners(TrNetPat1Instance element);
}