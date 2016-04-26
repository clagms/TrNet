package activitymigrationoriginal;

public interface TrNetPat70InstancePublisher{
	public void registerListener(TrNetPat70InstanceListener listener);
	
	public void notifyListeners(TrNetPat70Instance element);
}