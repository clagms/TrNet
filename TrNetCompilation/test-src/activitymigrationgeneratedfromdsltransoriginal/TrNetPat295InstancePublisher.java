package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat295InstancePublisher{
	public void registerListener(TrNetPat295InstanceListener listener);
	
	public void notifyListeners(TrNetPat295Instance element);
}