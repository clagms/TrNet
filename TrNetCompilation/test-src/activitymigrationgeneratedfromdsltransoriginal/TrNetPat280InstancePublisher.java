package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat280InstancePublisher{
	public void registerListener(TrNetPat280InstanceListener listener);
	
	public void notifyListeners(TrNetPat280Instance element);
}