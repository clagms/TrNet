package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat181InstancePublisher{
	public void registerListener(TrNetPat181InstanceListener listener);
	
	public void notifyListeners(TrNetPat181Instance element);
}