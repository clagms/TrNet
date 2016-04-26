package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat175InstancePublisher{
	public void registerListener(TrNetPat175InstanceListener listener);
	
	public void notifyListeners(TrNetPat175Instance element);
}