package class2relationaloriginal;

public interface TrNetPat45InstancePublisher{
	public void registerListener(TrNetPat45InstanceListener listener);
	
	public void notifyListeners(TrNetPat45Instance element);
}