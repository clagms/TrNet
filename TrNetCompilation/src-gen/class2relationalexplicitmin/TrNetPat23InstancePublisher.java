package class2relationalexplicitmin;

public interface TrNetPat23InstancePublisher{
	public void registerListener(TrNetPat23InstanceListener listener);
	
	public void notifyListeners(TrNetPat23Instance element);
}