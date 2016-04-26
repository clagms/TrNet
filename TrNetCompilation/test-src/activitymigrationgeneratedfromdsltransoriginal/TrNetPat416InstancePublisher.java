package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat416InstancePublisher{
	public void registerListener(TrNetPat416InstanceListener listener);
	
	public void notifyListeners(TrNetPat416Instance element);
}