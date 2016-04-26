package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat469InstancePublisher{
	public void registerListener(TrNetPat469InstanceListener listener);
	
	public void notifyListeners(TrNetPat469Instance element);
}