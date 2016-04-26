package class2relationalexplicitmin;

public interface TrNetPat17InstancePublisher{
	public void registerListener(TrNetPat17InstanceListener listener);
	
	public void notifyListeners(TrNetPat17Instance element);
}