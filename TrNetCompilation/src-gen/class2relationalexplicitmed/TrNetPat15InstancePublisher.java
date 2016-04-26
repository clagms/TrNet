package class2relationalexplicitmed;

public interface TrNetPat15InstancePublisher{
	public void registerListener(TrNetPat15InstanceListener listener);
	
	public void notifyListeners(TrNetPat15Instance element);
}