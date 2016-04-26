package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat465InstancePublisher{
	public void registerListener(TrNetPat465InstanceListener listener);
	
	public void notifyListeners(TrNetPat465Instance element);
}