package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat414InstancePublisher{
	public void registerListener(TrNetPat414InstanceListener listener);
	
	public void notifyListeners(TrNetPat414Instance element);
}