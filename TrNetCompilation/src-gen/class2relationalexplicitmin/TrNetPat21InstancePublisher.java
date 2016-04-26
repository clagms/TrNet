package class2relationalexplicitmin;

public interface TrNetPat21InstancePublisher{
	public void registerListener(TrNetPat21InstanceListener listener);
	
	public void notifyListeners(TrNetPat21Instance element);
}