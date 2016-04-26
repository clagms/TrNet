package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat436InstancePublisher{
	public void registerListener(TrNetPat436InstanceListener listener);
	
	public void notifyListeners(TrNetPat436Instance element);
}