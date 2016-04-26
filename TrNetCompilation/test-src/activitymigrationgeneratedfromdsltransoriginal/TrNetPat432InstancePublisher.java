package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat432InstancePublisher{
	public void registerListener(TrNetPat432InstanceListener listener);
	
	public void notifyListeners(TrNetPat432Instance element);
}