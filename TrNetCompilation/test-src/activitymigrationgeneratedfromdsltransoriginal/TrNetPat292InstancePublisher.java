package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat292InstancePublisher{
	public void registerListener(TrNetPat292InstanceListener listener);
	
	public void notifyListeners(TrNetPat292Instance element);
}