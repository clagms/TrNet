package class2relationalexplicitmin;

public interface TrNetPat3InstancePublisher{
	public void registerListener(TrNetPat3InstanceListener listener);
	
	public void notifyListeners(TrNetPat3Instance element);
}