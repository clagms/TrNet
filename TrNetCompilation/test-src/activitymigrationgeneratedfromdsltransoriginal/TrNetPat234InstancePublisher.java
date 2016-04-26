package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat234InstancePublisher{
	public void registerListener(TrNetPat234InstanceListener listener);
	
	public void notifyListeners(TrNetPat234Instance element);
}