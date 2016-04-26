package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat462InstancePublisher{
	public void registerListener(TrNetPat462InstanceListener listener);
	
	public void notifyListeners(TrNetPat462Instance element);
}