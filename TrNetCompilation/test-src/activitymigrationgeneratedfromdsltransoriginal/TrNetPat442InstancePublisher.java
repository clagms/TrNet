package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat442InstancePublisher{
	public void registerListener(TrNetPat442InstanceListener listener);
	
	public void notifyListeners(TrNetPat442Instance element);
}