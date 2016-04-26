package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat318InstancePublisher{
	public void registerListener(TrNetPat318InstanceListener listener);
	
	public void notifyListeners(TrNetPat318Instance element);
}