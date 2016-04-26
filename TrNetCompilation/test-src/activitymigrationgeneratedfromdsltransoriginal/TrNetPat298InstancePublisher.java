package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat298InstancePublisher{
	public void registerListener(TrNetPat298InstanceListener listener);
	
	public void notifyListeners(TrNetPat298Instance element);
}