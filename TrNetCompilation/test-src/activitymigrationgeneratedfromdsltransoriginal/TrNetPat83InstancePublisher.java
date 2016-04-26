package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat83InstancePublisher{
	public void registerListener(TrNetPat83InstanceListener listener);
	
	public void notifyListeners(TrNetPat83Instance element);
}