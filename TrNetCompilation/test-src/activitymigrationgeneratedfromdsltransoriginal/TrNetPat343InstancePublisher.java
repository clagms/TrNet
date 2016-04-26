package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat343InstancePublisher{
	public void registerListener(TrNetPat343InstanceListener listener);
	
	public void notifyListeners(TrNetPat343Instance element);
}