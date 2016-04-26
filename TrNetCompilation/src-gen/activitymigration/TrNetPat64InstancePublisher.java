package activitymigration;

public interface TrNetPat64InstancePublisher{
	public void registerListener(TrNetPat64InstanceListener listener);
	
	public void notifyListeners(TrNetPat64Instance element);
}