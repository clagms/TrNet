package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat453InstancePublisher{
	public void registerListener(TrNetPat453InstanceListener listener);
	
	public void notifyListeners(TrNetPat453Instance element);
}