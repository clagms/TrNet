package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat289InstancePublisher{
	public void registerListener(TrNetPat289InstanceListener listener);
	
	public void notifyListeners(TrNetPat289Instance element);
}