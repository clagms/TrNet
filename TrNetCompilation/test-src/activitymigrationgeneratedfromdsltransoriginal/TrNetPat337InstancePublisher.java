package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat337InstancePublisher{
	public void registerListener(TrNetPat337InstanceListener listener);
	
	public void notifyListeners(TrNetPat337Instance element);
}