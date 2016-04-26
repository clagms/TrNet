package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat322InstancePublisher{
	public void registerListener(TrNetPat322InstanceListener listener);
	
	public void notifyListeners(TrNetPat322Instance element);
}