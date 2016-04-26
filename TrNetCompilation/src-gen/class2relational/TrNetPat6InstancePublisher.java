package class2relational;

public interface TrNetPat6InstancePublisher{
	public void registerListener(TrNetPat6InstanceListener listener);
	
	public void notifyListeners(TrNetPat6Instance element);
}