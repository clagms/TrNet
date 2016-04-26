package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat219InstancePublisher{
	public void registerListener(TrNetPat219InstanceListener listener);
	
	public void notifyListeners(TrNetPat219Instance element);
}