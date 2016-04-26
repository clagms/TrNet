package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat98InstancePublisher{
	public void registerListener(TrNetPat98InstanceListener listener);
	
	public void notifyListeners(TrNetPat98Instance element);
}