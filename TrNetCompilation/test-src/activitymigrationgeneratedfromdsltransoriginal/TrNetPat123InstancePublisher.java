package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat123InstancePublisher{
	public void registerListener(TrNetPat123InstanceListener listener);
	
	public void notifyListeners(TrNetPat123Instance element);
}