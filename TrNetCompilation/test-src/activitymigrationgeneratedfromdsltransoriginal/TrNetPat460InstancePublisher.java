package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat460InstancePublisher{
	public void registerListener(TrNetPat460InstanceListener listener);
	
	public void notifyListeners(TrNetPat460Instance element);
}