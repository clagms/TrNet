package class2relational;

public interface TrNetPat16InstancePublisher{
	public void registerListener(TrNetPat16InstanceListener listener);
	
	public void notifyListeners(TrNetPat16Instance element);
}