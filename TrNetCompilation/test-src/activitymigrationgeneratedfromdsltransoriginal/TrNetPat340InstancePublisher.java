package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat340InstancePublisher{
	public void registerListener(TrNetPat340InstanceListener listener);
	
	public void notifyListeners(TrNetPat340Instance element);
}