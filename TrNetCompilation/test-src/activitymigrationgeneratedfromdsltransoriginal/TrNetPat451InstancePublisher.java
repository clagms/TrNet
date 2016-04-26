package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat451InstancePublisher{
	public void registerListener(TrNetPat451InstanceListener listener);
	
	public void notifyListeners(TrNetPat451Instance element);
}