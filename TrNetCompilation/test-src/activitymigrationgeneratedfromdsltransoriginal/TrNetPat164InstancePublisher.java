package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat164InstancePublisher{
	public void registerListener(TrNetPat164InstanceListener listener);
	
	public void notifyListeners(TrNetPat164Instance element);
}