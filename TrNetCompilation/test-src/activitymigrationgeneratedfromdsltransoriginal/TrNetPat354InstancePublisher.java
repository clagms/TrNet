package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat354InstancePublisher{
	public void registerListener(TrNetPat354InstanceListener listener);
	
	public void notifyListeners(TrNetPat354Instance element);
}