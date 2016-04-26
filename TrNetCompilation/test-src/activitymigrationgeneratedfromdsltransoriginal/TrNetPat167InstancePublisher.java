package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat167InstancePublisher{
	public void registerListener(TrNetPat167InstanceListener listener);
	
	public void notifyListeners(TrNetPat167Instance element);
}