package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat458InstancePublisher{
	public void registerListener(TrNetPat458InstanceListener listener);
	
	public void notifyListeners(TrNetPat458Instance element);
}