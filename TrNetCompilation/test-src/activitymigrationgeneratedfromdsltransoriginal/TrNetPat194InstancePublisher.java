package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat194InstancePublisher{
	public void registerListener(TrNetPat194InstanceListener listener);
	
	public void notifyListeners(TrNetPat194Instance element);
}