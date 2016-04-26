package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat330InstancePublisher{
	public void registerListener(TrNetPat330InstanceListener listener);
	
	public void notifyListeners(TrNetPat330Instance element);
}