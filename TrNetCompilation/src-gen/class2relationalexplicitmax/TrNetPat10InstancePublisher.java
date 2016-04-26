package class2relationalexplicitmax;

public interface TrNetPat10InstancePublisher{
	public void registerListener(TrNetPat10InstanceListener listener);
	
	public void notifyListeners(TrNetPat10Instance element);
}