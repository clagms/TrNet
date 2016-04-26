package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat470InstancePublisher{
	public void registerListener(TrNetPat470InstanceListener listener);
	
	public void notifyListeners(TrNetPat470Instance element);
}