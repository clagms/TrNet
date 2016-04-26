package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat193InstancePublisher{
	public void registerListener(TrNetPat193InstanceListener listener);
	
	public void notifyListeners(TrNetPat193Instance element);
}