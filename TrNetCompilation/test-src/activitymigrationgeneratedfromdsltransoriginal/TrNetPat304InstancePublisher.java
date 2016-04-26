package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat304InstancePublisher{
	public void registerListener(TrNetPat304InstanceListener listener);
	
	public void notifyListeners(TrNetPat304Instance element);
}