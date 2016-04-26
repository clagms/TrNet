package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat214InstancePublisher{
	public void registerListener(TrNetPat214InstanceListener listener);
	
	public void notifyListeners(TrNetPat214Instance element);
}