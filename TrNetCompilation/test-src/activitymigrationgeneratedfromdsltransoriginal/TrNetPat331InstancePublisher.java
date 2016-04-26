package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat331InstancePublisher{
	public void registerListener(TrNetPat331InstanceListener listener);
	
	public void notifyListeners(TrNetPat331Instance element);
}