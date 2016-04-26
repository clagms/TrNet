package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat457InstancePublisher{
	public void registerListener(TrNetPat457InstanceListener listener);
	
	public void notifyListeners(TrNetPat457Instance element);
}