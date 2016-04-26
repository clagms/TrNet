package activitymigrationoriginal;

public interface TrNetPat43InstancePublisher{
	public void registerListener(TrNetPat43InstanceListener listener);
	
	public void notifyListeners(TrNetPat43Instance element);
}