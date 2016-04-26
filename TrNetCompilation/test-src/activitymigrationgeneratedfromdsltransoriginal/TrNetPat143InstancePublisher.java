package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat143InstancePublisher{
	public void registerListener(TrNetPat143InstanceListener listener);
	
	public void notifyListeners(TrNetPat143Instance element);
}