package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat149InstancePublisher{
	public void registerListener(TrNetPat149InstanceListener listener);
	
	public void notifyListeners(TrNetPat149Instance element);
}