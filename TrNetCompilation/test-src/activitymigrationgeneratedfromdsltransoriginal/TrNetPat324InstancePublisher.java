package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat324InstancePublisher{
	public void registerListener(TrNetPat324InstanceListener listener);
	
	public void notifyListeners(TrNetPat324Instance element);
}