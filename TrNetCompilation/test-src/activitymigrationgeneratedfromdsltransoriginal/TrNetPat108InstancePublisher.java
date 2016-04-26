package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat108InstancePublisher{
	public void registerListener(TrNetPat108InstanceListener listener);
	
	public void notifyListeners(TrNetPat108Instance element);
}