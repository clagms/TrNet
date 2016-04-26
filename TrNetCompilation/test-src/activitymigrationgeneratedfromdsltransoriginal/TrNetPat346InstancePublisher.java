package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat346InstancePublisher{
	public void registerListener(TrNetPat346InstanceListener listener);
	
	public void notifyListeners(TrNetPat346Instance element);
}