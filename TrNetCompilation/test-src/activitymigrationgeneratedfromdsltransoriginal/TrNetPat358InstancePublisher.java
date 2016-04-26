package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat358InstancePublisher{
	public void registerListener(TrNetPat358InstanceListener listener);
	
	public void notifyListeners(TrNetPat358Instance element);
}