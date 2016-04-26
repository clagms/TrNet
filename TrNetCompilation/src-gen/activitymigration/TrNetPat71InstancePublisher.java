package activitymigration;

public interface TrNetPat71InstancePublisher{
	public void registerListener(TrNetPat71InstanceListener listener);
	
	public void notifyListeners(TrNetPat71Instance element);
}