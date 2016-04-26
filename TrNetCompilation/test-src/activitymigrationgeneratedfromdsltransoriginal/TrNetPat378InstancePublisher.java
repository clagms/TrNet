package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat378InstancePublisher{
	public void registerListener(TrNetPat378InstanceListener listener);
	
	public void notifyListeners(TrNetPat378Instance element);
}