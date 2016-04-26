package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat443InstancePublisher{
	public void registerListener(TrNetPat443InstanceListener listener);
	
	public void notifyListeners(TrNetPat443Instance element);
}