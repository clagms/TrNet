package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat187InstancePublisher{
	public void registerListener(TrNetPat187InstanceListener listener);
	
	public void notifyListeners(TrNetPat187Instance element);
}