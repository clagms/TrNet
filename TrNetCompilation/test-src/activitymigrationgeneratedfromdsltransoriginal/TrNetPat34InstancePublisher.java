package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat34InstancePublisher{
	public void registerListener(TrNetPat34InstanceListener listener);
	
	public void notifyListeners(TrNetPat34Instance element);
}