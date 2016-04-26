package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat440InstancePublisher{
	public void registerListener(TrNetPat440InstanceListener listener);
	
	public void notifyListeners(TrNetPat440Instance element);
}