package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat313InstancePublisher{
	public void registerListener(TrNetPat313InstanceListener listener);
	
	public void notifyListeners(TrNetPat313Instance element);
}