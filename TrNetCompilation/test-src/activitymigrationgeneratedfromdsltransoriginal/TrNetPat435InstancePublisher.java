package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat435InstancePublisher{
	public void registerListener(TrNetPat435InstanceListener listener);
	
	public void notifyListeners(TrNetPat435Instance element);
}