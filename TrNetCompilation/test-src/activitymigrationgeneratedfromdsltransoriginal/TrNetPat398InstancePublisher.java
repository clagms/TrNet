package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat398InstancePublisher{
	public void registerListener(TrNetPat398InstanceListener listener);
	
	public void notifyListeners(TrNetPat398Instance element);
}