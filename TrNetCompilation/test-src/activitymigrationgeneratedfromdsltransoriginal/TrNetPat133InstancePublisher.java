package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat133InstancePublisher{
	public void registerListener(TrNetPat133InstanceListener listener);
	
	public void notifyListeners(TrNetPat133Instance element);
}