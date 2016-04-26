package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat455InstancePublisher{
	public void registerListener(TrNetPat455InstanceListener listener);
	
	public void notifyListeners(TrNetPat455Instance element);
}