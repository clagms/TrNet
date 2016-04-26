package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat264InstancePublisher{
	public void registerListener(TrNetPat264InstanceListener listener);
	
	public void notifyListeners(TrNetPat264Instance element);
}