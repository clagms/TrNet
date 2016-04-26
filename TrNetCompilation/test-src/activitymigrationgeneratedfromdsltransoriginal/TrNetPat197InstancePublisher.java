package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat197InstancePublisher{
	public void registerListener(TrNetPat197InstanceListener listener);
	
	public void notifyListeners(TrNetPat197Instance element);
}