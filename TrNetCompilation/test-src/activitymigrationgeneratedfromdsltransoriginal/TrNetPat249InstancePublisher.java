package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat249InstancePublisher{
	public void registerListener(TrNetPat249InstanceListener listener);
	
	public void notifyListeners(TrNetPat249Instance element);
}