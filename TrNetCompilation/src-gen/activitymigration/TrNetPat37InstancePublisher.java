package activitymigration;

public interface TrNetPat37InstancePublisher{
	public void registerListener(TrNetPat37InstanceListener listener);
	
	public void notifyListeners(TrNetPat37Instance element);
}