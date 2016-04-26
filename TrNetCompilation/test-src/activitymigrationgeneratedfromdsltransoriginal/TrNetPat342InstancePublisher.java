package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat342InstancePublisher{
	public void registerListener(TrNetPat342InstanceListener listener);
	
	public void notifyListeners(TrNetPat342Instance element);
}