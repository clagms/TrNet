package class2relationalexplicitmin;

public interface TrNetPat2InstancePublisher{
	public void registerListener(TrNetPat2InstanceListener listener);
	
	public void notifyListeners(TrNetPat2Instance element);
}