package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat179InstancePublisher{
	public void registerListener(TrNetPat179InstanceListener listener);
	
	public void notifyListeners(TrNetPat179Instance element);
}