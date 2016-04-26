package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat439InstancePublisher{
	public void registerListener(TrNetPat439InstanceListener listener);
	
	public void notifyListeners(TrNetPat439Instance element);
}