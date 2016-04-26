package activitymigration;

public interface TrNetPat50InstancePublisher{
	public void registerListener(TrNetPat50InstanceListener listener);
	
	public void notifyListeners(TrNetPat50Instance element);
}