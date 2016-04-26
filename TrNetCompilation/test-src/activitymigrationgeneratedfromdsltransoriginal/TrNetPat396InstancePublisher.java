package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat396InstancePublisher{
	public void registerListener(TrNetPat396InstanceListener listener);
	
	public void notifyListeners(TrNetPat396Instance element);
}