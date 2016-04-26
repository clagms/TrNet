package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat113InstancePublisher{
	public void registerListener(TrNetPat113InstanceListener listener);
	
	public void notifyListeners(TrNetPat113Instance element);
}