package class2relationaloriginal;

public interface TrNetPat6InstancePublisher{
	public void registerListener(TrNetPat6InstanceListener listener);
	
	public void notifyListeners(TrNetPat6Instance element);
}