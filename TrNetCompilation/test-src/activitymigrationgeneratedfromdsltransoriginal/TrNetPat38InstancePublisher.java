package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat38InstancePublisher{
	public void registerListener(TrNetPat38InstanceListener listener);
	
	public void notifyListeners(TrNetPat38Instance element);
}