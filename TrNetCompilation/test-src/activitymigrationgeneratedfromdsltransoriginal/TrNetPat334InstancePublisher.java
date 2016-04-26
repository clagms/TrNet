package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat334InstancePublisher{
	public void registerListener(TrNetPat334InstanceListener listener);
	
	public void notifyListeners(TrNetPat334Instance element);
}