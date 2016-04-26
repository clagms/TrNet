package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat361InstancePublisher{
	public void registerListener(TrNetPat361InstanceListener listener);
	
	public void notifyListeners(TrNetPat361Instance element);
}