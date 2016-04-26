package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat471InstancePublisher{
	public void registerListener(TrNetPat471InstanceListener listener);
	
	public void notifyListeners(TrNetPat471Instance element);
}