package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat463InstancePublisher{
	public void registerListener(TrNetPat463InstanceListener listener);
	
	public void notifyListeners(TrNetPat463Instance element);
}