package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat182InstancePublisher{
	public void registerListener(TrNetPat182InstanceListener listener);
	
	public void notifyListeners(TrNetPat182Instance element);
}