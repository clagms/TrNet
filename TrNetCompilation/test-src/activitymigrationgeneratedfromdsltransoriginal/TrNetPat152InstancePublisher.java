package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat152InstancePublisher{
	public void registerListener(TrNetPat152InstanceListener listener);
	
	public void notifyListeners(TrNetPat152Instance element);
}