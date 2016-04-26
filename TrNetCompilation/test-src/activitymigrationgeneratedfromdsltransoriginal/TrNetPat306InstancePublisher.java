package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat306InstancePublisher{
	public void registerListener(TrNetPat306InstanceListener listener);
	
	public void notifyListeners(TrNetPat306Instance element);
}