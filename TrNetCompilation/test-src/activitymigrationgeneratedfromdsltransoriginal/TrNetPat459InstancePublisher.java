package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat459InstancePublisher{
	public void registerListener(TrNetPat459InstanceListener listener);
	
	public void notifyListeners(TrNetPat459Instance element);
}