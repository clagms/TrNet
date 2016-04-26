package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat468InstancePublisher{
	public void registerListener(TrNetPat468InstanceListener listener);
	
	public void notifyListeners(TrNetPat468Instance element);
}