package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat437InstancePublisher{
	public void registerListener(TrNetPat437InstanceListener listener);
	
	public void notifyListeners(TrNetPat437Instance element);
}