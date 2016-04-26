package class2relationaloriginal;

public interface TrNetPat47InstancePublisher{
	public void registerListener(TrNetPat47InstanceListener listener);
	
	public void notifyListeners(TrNetPat47Instance element);
}