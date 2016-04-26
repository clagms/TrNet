package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat316InstancePublisher{
	public void registerListener(TrNetPat316InstanceListener listener);
	
	public void notifyListeners(TrNetPat316Instance element);
}