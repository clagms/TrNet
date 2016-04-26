package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat229InstancePublisher{
	public void registerListener(TrNetPat229InstanceListener listener);
	
	public void notifyListeners(TrNetPat229Instance element);
}