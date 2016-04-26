package activitymigrationoriginal;

public interface TrNetPat28InstancePublisher{
	public void registerListener(TrNetPat28InstanceListener listener);
	
	public void notifyListeners(TrNetPat28Instance element);
}