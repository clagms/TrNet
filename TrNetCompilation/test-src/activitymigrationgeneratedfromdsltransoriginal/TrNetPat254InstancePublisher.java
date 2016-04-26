package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat254InstancePublisher{
	public void registerListener(TrNetPat254InstanceListener listener);
	
	public void notifyListeners(TrNetPat254Instance element);
}