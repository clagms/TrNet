package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat467InstancePublisher{
	public void registerListener(TrNetPat467InstanceListener listener);
	
	public void notifyListeners(TrNetPat467Instance element);
}