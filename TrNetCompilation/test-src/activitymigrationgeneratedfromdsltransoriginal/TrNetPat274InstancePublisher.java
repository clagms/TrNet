package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat274InstancePublisher{
	public void registerListener(TrNetPat274InstanceListener listener);
	
	public void notifyListeners(TrNetPat274Instance element);
}