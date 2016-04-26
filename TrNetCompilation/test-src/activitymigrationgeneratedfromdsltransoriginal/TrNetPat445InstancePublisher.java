package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat445InstancePublisher{
	public void registerListener(TrNetPat445InstanceListener listener);
	
	public void notifyListeners(TrNetPat445Instance element);
}