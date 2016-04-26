package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat277InstancePublisher{
	public void registerListener(TrNetPat277InstanceListener listener);
	
	public void notifyListeners(TrNetPat277Instance element);
}