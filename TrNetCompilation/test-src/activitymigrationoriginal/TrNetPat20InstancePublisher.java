package activitymigrationoriginal;

public interface TrNetPat20InstancePublisher{
	public void registerListener(TrNetPat20InstanceListener listener);
	
	public void notifyListeners(TrNetPat20Instance element);
}