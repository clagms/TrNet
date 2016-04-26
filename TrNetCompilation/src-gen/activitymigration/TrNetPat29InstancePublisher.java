package activitymigration;

public interface TrNetPat29InstancePublisher{
	public void registerListener(TrNetPat29InstanceListener listener);
	
	public void notifyListeners(TrNetPat29Instance element);
}