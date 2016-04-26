package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat464InstancePublisher{
	public void registerListener(TrNetPat464InstanceListener listener);
	
	public void notifyListeners(TrNetPat464Instance element);
}