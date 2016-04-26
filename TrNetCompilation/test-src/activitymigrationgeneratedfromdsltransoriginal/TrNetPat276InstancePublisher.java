package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat276InstancePublisher{
	public void registerListener(TrNetPat276InstanceListener listener);
	
	public void notifyListeners(TrNetPat276Instance element);
}