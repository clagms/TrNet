package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat349InstancePublisher{
	public void registerListener(TrNetPat349InstanceListener listener);
	
	public void notifyListeners(TrNetPat349Instance element);
}