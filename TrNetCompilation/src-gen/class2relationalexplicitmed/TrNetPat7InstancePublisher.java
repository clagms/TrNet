package class2relationalexplicitmed;

public interface TrNetPat7InstancePublisher{
	public void registerListener(TrNetPat7InstanceListener listener);
	
	public void notifyListeners(TrNetPat7Instance element);
}