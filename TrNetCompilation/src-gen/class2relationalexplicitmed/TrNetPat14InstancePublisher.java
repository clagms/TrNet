package class2relationalexplicitmed;

public interface TrNetPat14InstancePublisher{
	public void registerListener(TrNetPat14InstanceListener listener);
	
	public void notifyListeners(TrNetPat14Instance element);
}