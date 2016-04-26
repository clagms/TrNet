package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat360InstancePublisher{
	public void registerListener(TrNetPat360InstanceListener listener);
	
	public void notifyListeners(TrNetPat360Instance element);
}