package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat146InstancePublisher{
	public void registerListener(TrNetPat146InstanceListener listener);
	
	public void notifyListeners(TrNetPat146Instance element);
}