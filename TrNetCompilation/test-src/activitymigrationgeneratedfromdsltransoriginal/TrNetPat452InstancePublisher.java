package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat452InstancePublisher{
	public void registerListener(TrNetPat452InstanceListener listener);
	
	public void notifyListeners(TrNetPat452Instance element);
}