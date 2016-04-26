package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat139InstancePublisher{
	public void registerListener(TrNetPat139InstanceListener listener);
	
	public void notifyListeners(TrNetPat139Instance element);
}