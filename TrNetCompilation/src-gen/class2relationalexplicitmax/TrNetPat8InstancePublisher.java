package class2relationalexplicitmax;

public interface TrNetPat8InstancePublisher{
	public void registerListener(TrNetPat8InstanceListener listener);
	
	public void notifyListeners(TrNetPat8Instance element);
}