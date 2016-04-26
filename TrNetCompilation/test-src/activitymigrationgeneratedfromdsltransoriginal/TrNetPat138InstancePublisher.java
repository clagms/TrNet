package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat138InstancePublisher{
	public void registerListener(TrNetPat138InstanceListener listener);
	
	public void notifyListeners(TrNetPat138Instance element);
}