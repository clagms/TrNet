package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat157InstancePublisher{
	public void registerListener(TrNetPat157InstanceListener listener);
	
	public void notifyListeners(TrNetPat157Instance element);
}