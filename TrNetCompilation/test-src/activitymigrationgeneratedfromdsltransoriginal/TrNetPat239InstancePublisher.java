package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat239InstancePublisher{
	public void registerListener(TrNetPat239InstanceListener listener);
	
	public void notifyListeners(TrNetPat239Instance element);
}