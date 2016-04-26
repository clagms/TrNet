package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat450InstancePublisher{
	public void registerListener(TrNetPat450InstanceListener listener);
	
	public void notifyListeners(TrNetPat450Instance element);
}