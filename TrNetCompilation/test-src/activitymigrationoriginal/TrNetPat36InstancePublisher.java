package activitymigrationoriginal;

public interface TrNetPat36InstancePublisher{
	public void registerListener(TrNetPat36InstanceListener listener);
	
	public void notifyListeners(TrNetPat36Instance element);
}