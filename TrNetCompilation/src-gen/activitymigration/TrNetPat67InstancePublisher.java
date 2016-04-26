package activitymigration;

public interface TrNetPat67InstancePublisher{
	public void registerListener(TrNetPat67InstanceListener listener);
	
	public void notifyListeners(TrNetPat67Instance element);
}