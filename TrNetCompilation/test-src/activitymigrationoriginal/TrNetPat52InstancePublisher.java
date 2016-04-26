package activitymigrationoriginal;

public interface TrNetPat52InstancePublisher{
	public void registerListener(TrNetPat52InstanceListener listener);
	
	public void notifyListeners(TrNetPat52Instance element);
}