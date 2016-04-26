package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat93InstancePublisher{
	public void registerListener(TrNetPat93InstanceListener listener);
	
	public void notifyListeners(TrNetPat93Instance element);
}