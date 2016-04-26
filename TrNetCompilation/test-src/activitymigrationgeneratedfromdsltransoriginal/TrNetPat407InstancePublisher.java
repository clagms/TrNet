package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat407InstancePublisher{
	public void registerListener(TrNetPat407InstanceListener listener);
	
	public void notifyListeners(TrNetPat407Instance element);
}