package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat444InstancePublisher{
	public void registerListener(TrNetPat444InstanceListener listener);
	
	public void notifyListeners(TrNetPat444Instance element);
}