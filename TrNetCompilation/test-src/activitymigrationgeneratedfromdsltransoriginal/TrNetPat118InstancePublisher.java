package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat118InstancePublisher{
	public void registerListener(TrNetPat118InstanceListener listener);
	
	public void notifyListeners(TrNetPat118Instance element);
}