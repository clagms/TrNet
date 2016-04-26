package activitymigration;

public interface TrNetPat55InstancePublisher{
	public void registerListener(TrNetPat55InstanceListener listener);
	
	public void notifyListeners(TrNetPat55Instance element);
}