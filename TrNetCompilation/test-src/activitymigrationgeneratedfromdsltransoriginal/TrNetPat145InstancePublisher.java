package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat145InstancePublisher{
	public void registerListener(TrNetPat145InstanceListener listener);
	
	public void notifyListeners(TrNetPat145Instance element);
}