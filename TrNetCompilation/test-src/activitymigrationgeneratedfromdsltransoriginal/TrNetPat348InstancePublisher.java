package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat348InstancePublisher{
	public void registerListener(TrNetPat348InstanceListener listener);
	
	public void notifyListeners(TrNetPat348Instance element);
}