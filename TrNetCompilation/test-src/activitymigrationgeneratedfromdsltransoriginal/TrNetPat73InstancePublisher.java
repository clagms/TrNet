package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat73InstancePublisher{
	public void registerListener(TrNetPat73InstanceListener listener);
	
	public void notifyListeners(TrNetPat73Instance element);
}