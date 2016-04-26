package activitymigrationoriginal;

public interface TrNetPat65InstancePublisher{
	public void registerListener(TrNetPat65InstanceListener listener);
	
	public void notifyListeners(TrNetPat65Instance element);
}