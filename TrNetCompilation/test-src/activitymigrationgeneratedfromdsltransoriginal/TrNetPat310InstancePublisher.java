package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat310InstancePublisher{
	public void registerListener(TrNetPat310InstanceListener listener);
	
	public void notifyListeners(TrNetPat310Instance element);
}