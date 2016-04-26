package activitymigrationoriginal;

public interface TrNetPat62InstancePublisher{
	public void registerListener(TrNetPat62InstanceListener listener);
	
	public void notifyListeners(TrNetPat62Instance element);
}