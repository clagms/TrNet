package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat53InstancePublisher{
	public void registerListener(TrNetPat53InstanceListener listener);
	
	public void notifyListeners(TrNetPat53Instance element);
}