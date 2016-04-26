package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat288InstancePublisher{
	public void registerListener(TrNetPat288InstanceListener listener);
	
	public void notifyListeners(TrNetPat288Instance element);
}