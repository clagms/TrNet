package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat204InstancePublisher{
	public void registerListener(TrNetPat204InstanceListener listener);
	
	public void notifyListeners(TrNetPat204Instance element);
}