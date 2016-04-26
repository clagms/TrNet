package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat188InstancePublisher{
	public void registerListener(TrNetPat188InstanceListener listener);
	
	public void notifyListeners(TrNetPat188Instance element);
}