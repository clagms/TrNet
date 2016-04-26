package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat151InstancePublisher{
	public void registerListener(TrNetPat151InstanceListener listener);
	
	public void notifyListeners(TrNetPat151Instance element);
}