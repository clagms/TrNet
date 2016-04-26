package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat191InstancePublisher{
	public void registerListener(TrNetPat191InstanceListener listener);
	
	public void notifyListeners(TrNetPat191Instance element);
}