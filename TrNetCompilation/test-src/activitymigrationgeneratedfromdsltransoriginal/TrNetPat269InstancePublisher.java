package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat269InstancePublisher{
	public void registerListener(TrNetPat269InstanceListener listener);
	
	public void notifyListeners(TrNetPat269Instance element);
}