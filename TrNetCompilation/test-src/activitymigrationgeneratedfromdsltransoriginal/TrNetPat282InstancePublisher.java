package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat282InstancePublisher{
	public void registerListener(TrNetPat282InstanceListener listener);
	
	public void notifyListeners(TrNetPat282Instance element);
}