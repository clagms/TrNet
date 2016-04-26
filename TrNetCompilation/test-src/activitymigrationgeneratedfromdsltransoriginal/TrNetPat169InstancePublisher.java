package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat169InstancePublisher{
	public void registerListener(TrNetPat169InstanceListener listener);
	
	public void notifyListeners(TrNetPat169Instance element);
}