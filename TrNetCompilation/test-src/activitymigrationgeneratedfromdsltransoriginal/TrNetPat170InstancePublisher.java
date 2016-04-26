package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat170InstancePublisher{
	public void registerListener(TrNetPat170InstanceListener listener);
	
	public void notifyListeners(TrNetPat170Instance element);
}