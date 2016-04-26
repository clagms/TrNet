package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat448InstancePublisher{
	public void registerListener(TrNetPat448InstanceListener listener);
	
	public void notifyListeners(TrNetPat448Instance element);
}