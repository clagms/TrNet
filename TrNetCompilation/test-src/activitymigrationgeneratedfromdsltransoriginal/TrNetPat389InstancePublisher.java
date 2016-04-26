package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat389InstancePublisher{
	public void registerListener(TrNetPat389InstanceListener listener);
	
	public void notifyListeners(TrNetPat389Instance element);
}