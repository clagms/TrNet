package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat185InstancePublisher{
	public void registerListener(TrNetPat185InstanceListener listener);
	
	public void notifyListeners(TrNetPat185Instance element);
}