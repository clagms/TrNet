package class2relationaloriginal;

public interface TrNetPat42InstancePublisher{
	public void registerListener(TrNetPat42InstanceListener listener);
	
	public void notifyListeners(TrNetPat42Instance element);
}