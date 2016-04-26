package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat363InstancePublisher{
	public void registerListener(TrNetPat363InstanceListener listener);
	
	public void notifyListeners(TrNetPat363Instance element);
}