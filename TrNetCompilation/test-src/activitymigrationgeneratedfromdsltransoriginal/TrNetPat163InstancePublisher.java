package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat163InstancePublisher{
	public void registerListener(TrNetPat163InstanceListener listener);
	
	public void notifyListeners(TrNetPat163Instance element);
}