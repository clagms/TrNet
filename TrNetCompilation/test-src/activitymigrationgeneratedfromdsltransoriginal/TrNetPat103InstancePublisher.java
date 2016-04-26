package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat103InstancePublisher{
	public void registerListener(TrNetPat103InstanceListener listener);
	
	public void notifyListeners(TrNetPat103Instance element);
}