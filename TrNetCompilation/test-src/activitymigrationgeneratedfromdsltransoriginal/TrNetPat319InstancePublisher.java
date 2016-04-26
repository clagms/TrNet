package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat319InstancePublisher{
	public void registerListener(TrNetPat319InstanceListener listener);
	
	public void notifyListeners(TrNetPat319Instance element);
}