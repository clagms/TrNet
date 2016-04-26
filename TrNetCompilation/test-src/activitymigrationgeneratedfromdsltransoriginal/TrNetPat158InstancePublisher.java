package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat158InstancePublisher{
	public void registerListener(TrNetPat158InstanceListener listener);
	
	public void notifyListeners(TrNetPat158Instance element);
}