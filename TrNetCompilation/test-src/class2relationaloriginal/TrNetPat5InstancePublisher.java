package class2relationaloriginal;

public interface TrNetPat5InstancePublisher{
	public void registerListener(TrNetPat5InstanceListener listener);
	
	public void notifyListeners(TrNetPat5Instance element);
}