package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat336InstancePublisher{
	public void registerListener(TrNetPat336InstanceListener listener);
	
	public void notifyListeners(TrNetPat336Instance element);
}