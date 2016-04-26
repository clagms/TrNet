package activitymigrationoriginal;

public interface TrNetPat56InstancePublisher{
	public void registerListener(TrNetPat56InstanceListener listener);
	
	public void notifyListeners(TrNetPat56Instance element);
}