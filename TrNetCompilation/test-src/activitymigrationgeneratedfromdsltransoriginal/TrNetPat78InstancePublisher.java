package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat78InstancePublisher{
	public void registerListener(TrNetPat78InstanceListener listener);
	
	public void notifyListeners(TrNetPat78Instance element);
}