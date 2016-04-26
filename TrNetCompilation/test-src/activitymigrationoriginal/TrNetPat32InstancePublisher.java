package activitymigrationoriginal;

public interface TrNetPat32InstancePublisher{
	public void registerListener(TrNetPat32InstanceListener listener);
	
	public void notifyListeners(TrNetPat32Instance element);
}