package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat209InstancePublisher{
	public void registerListener(TrNetPat209InstanceListener listener);
	
	public void notifyListeners(TrNetPat209Instance element);
}