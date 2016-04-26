package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat224InstancePublisher{
	public void registerListener(TrNetPat224InstanceListener listener);
	
	public void notifyListeners(TrNetPat224Instance element);
}