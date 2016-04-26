package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat300InstancePublisher{
	public void registerListener(TrNetPat300InstanceListener listener);
	
	public void notifyListeners(TrNetPat300Instance element);
}