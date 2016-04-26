package activitymigrationgeneratedfromdsltransoriginal;

public interface TrNetPat405InstancePublisher{
	public void registerListener(TrNetPat405InstanceListener listener);
	
	public void notifyListeners(TrNetPat405Instance element);
}