package class2relationalexplicitmin;

public interface TrNetPat999InstancePublisher{
	public void registerListener(TrNetPat999InstanceListener listener);
	
	public void notifyListeners(TrNetPat999Instance element);
}