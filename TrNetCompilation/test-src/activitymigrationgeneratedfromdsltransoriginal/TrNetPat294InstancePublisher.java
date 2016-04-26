package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat294InstancePublisher{
	public void registerListener(TrNetPat294InstanceListener listener);
	
	public void notifyListeners(TrNetPat294Instance element);
}