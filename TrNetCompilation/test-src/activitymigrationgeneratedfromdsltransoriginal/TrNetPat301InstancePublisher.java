package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat301InstancePublisher{
	public void registerListener(TrNetPat301InstanceListener listener);
	
	public void notifyListeners(TrNetPat301Instance element);
}