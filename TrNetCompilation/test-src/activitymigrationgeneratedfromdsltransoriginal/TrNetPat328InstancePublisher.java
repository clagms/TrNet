package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat328InstancePublisher{
	public void registerListener(TrNetPat328InstanceListener listener);
	
	public void notifyListeners(TrNetPat328Instance element);
}