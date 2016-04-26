package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat461InstancePublisher{
	public void registerListener(TrNetPat461InstanceListener listener);
	
	public void notifyListeners(TrNetPat461Instance element);
}