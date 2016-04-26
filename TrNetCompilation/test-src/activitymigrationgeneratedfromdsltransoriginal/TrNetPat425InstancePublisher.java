package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat425InstancePublisher{
	public void registerListener(TrNetPat425InstanceListener listener);
	
	public void notifyListeners(TrNetPat425Instance element);
}