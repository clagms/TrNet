package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat176InstancePublisher{
	public void registerListener(TrNetPat176InstanceListener listener);
	
	public void notifyListeners(TrNetPat176Instance element);
}