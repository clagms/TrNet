package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat325InstancePublisher{
	public void registerListener(TrNetPat325InstanceListener listener);
	
	public void notifyListeners(TrNetPat325Instance element);
}