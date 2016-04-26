package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat371InstancePublisher{
	public void registerListener(TrNetPat371InstanceListener listener);
	
	public void notifyListeners(TrNetPat371Instance element);
}