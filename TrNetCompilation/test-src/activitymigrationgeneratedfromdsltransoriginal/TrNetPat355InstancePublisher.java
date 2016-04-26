package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat355InstancePublisher{
	public void registerListener(TrNetPat355InstanceListener listener);
	
	public void notifyListeners(TrNetPat355Instance element);
}