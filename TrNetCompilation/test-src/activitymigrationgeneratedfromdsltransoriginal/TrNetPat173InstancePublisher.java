package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat173InstancePublisher{
	public void registerListener(TrNetPat173InstanceListener listener);
	
	public void notifyListeners(TrNetPat173Instance element);
}