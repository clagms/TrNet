package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat387InstancePublisher{
	public void registerListener(TrNetPat387InstanceListener listener);
	
	public void notifyListeners(TrNetPat387Instance element);
}