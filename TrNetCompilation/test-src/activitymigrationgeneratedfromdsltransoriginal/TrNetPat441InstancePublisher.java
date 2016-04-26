package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat441InstancePublisher{
	public void registerListener(TrNetPat441InstanceListener listener);
	
	public void notifyListeners(TrNetPat441Instance element);
}