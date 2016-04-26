package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat270InstancePublisher{
	public void registerListener(TrNetPat270InstanceListener listener);
	
	public void notifyListeners(TrNetPat270Instance element);
}