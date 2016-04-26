package class2relationaloriginal;

public interface TrNetPat11InstancePublisher{
	public void registerListener(TrNetPat11InstanceListener listener);
	
	public void notifyListeners(TrNetPat11Instance element);
}