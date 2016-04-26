package activitymigrationoriginal;

public interface TrNetPat69InstancePublisher{
	public void registerListener(TrNetPat69InstanceListener listener);
	
	public void notifyListeners(TrNetPat69Instance element);
}