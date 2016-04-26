package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat423InstancePublisher{
	public void registerListener(TrNetPat423InstanceListener listener);
	
	public void notifyListeners(TrNetPat423Instance element);
}