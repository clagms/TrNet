package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat307InstancePublisher{
	public void registerListener(TrNetPat307InstanceListener listener);
	
	public void notifyListeners(TrNetPat307Instance element);
}