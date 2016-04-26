package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat286InstancePublisher{
	public void registerListener(TrNetPat286InstanceListener listener);
	
	public void notifyListeners(TrNetPat286Instance element);
}