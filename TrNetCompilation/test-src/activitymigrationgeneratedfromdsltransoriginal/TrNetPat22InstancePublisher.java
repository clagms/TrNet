package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat22InstancePublisher{
	public void registerListener(TrNetPat22InstanceListener listener);
	
	public void notifyListeners(TrNetPat22Instance element);
}