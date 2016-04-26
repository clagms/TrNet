package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat48InstancePublisher{
	public void registerListener(TrNetPat48InstanceListener listener);
	
	public void notifyListeners(TrNetPat48Instance element);
}