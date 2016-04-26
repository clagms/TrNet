package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat128InstancePublisher{
	public void registerListener(TrNetPat128InstanceListener listener);
	
	public void notifyListeners(TrNetPat128Instance element);
}