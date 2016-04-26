package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat259InstancePublisher{
	public void registerListener(TrNetPat259InstanceListener listener);
	
	public void notifyListeners(TrNetPat259Instance element);
}