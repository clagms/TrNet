package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat155InstancePublisher{
	public void registerListener(TrNetPat155InstanceListener listener);
	
	public void notifyListeners(TrNetPat155Instance element);
}