package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat283InstancePublisher{
	public void registerListener(TrNetPat283InstanceListener listener);
	
	public void notifyListeners(TrNetPat283Instance element);
}