package class2relationalexplicitmin;

public interface TrNetPat13InstancePublisher{
	public void registerListener(TrNetPat13InstanceListener listener);
	
	public void notifyListeners(TrNetPat13Instance element);
}