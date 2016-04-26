package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat271InstancePublisher{
	public void registerListener(TrNetPat271InstanceListener listener);
	
	public void notifyListeners(TrNetPat271Instance element);
}