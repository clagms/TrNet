package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat244InstancePublisher{
	public void registerListener(TrNetPat244InstanceListener listener);
	
	public void notifyListeners(TrNetPat244Instance element);
}