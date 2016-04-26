package class2relationalexplicitmax;

public interface TrNetPat15InstancePublisher{
	public void registerListener(TrNetPat15InstanceListener listener);
	
	public void notifyListeners(TrNetPat15Instance element);
}