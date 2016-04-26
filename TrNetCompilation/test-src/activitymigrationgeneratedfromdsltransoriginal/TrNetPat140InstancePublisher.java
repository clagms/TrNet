package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat140InstancePublisher{
	public void registerListener(TrNetPat140InstanceListener listener);
	
	public void notifyListeners(TrNetPat140Instance element);
}