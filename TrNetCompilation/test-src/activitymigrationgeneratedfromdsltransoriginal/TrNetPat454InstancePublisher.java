package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat454InstancePublisher{
	public void registerListener(TrNetPat454InstanceListener listener);
	
	public void notifyListeners(TrNetPat454Instance element);
}