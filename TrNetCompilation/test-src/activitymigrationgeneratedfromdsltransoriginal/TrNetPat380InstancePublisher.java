package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat380InstancePublisher{
	public void registerListener(TrNetPat380InstanceListener listener);
	
	public void notifyListeners(TrNetPat380Instance element);
}