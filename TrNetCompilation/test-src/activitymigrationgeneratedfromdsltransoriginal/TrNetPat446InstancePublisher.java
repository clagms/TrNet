package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat446InstancePublisher{
	public void registerListener(TrNetPat446InstanceListener listener);
	
	public void notifyListeners(TrNetPat446Instance element);
}