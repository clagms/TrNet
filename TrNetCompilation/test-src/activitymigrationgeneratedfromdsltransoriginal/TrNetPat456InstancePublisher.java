package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat456InstancePublisher{
	public void registerListener(TrNetPat456InstanceListener listener);
	
	public void notifyListeners(TrNetPat456Instance element);
}