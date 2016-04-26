package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat369InstancePublisher{
	public void registerListener(TrNetPat369InstanceListener listener);
	
	public void notifyListeners(TrNetPat369Instance element);
}