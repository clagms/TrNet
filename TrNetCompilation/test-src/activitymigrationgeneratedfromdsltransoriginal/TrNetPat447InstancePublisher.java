package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat447InstancePublisher{
	public void registerListener(TrNetPat447InstanceListener listener);
	
	public void notifyListeners(TrNetPat447Instance element);
}