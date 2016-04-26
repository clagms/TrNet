package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat312InstancePublisher{
	public void registerListener(TrNetPat312InstanceListener listener);
	
	public void notifyListeners(TrNetPat312Instance element);
}