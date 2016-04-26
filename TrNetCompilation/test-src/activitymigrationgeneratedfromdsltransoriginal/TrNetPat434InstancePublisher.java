package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat434InstancePublisher{
	public void registerListener(TrNetPat434InstanceListener listener);
	
	public void notifyListeners(TrNetPat434Instance element);
}