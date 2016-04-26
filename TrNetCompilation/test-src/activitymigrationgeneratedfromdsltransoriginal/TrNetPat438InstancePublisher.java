package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat438InstancePublisher{
	public void registerListener(TrNetPat438InstanceListener listener);
	
	public void notifyListeners(TrNetPat438Instance element);
}