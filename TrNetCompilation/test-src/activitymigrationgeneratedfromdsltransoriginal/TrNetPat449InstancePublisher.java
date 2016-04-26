package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat449InstancePublisher{
	public void registerListener(TrNetPat449InstanceListener listener);
	
	public void notifyListeners(TrNetPat449Instance element);
}