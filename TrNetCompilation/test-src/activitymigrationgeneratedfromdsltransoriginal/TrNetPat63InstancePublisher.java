package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat63InstancePublisher{
	public void registerListener(TrNetPat63InstanceListener listener);
	
	public void notifyListeners(TrNetPat63Instance element);
}