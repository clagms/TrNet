package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat352InstancePublisher{
	public void registerListener(TrNetPat352InstanceListener listener);
	
	public void notifyListeners(TrNetPat352Instance element);
}