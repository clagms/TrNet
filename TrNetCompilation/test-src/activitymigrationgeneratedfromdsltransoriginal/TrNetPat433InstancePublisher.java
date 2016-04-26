package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat433InstancePublisher{
	public void registerListener(TrNetPat433InstanceListener listener);
	
	public void notifyListeners(TrNetPat433Instance element);
}