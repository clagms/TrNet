package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat161InstancePublisher{
	public void registerListener(TrNetPat161InstanceListener listener);
	
	public void notifyListeners(TrNetPat161Instance element);
}