package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat466InstancePublisher{
	public void registerListener(TrNetPat466InstanceListener listener);
	
	public void notifyListeners(TrNetPat466Instance element);
}