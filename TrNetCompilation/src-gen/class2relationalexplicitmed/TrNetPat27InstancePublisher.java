package class2relationalexplicitmed;

public interface TrNetPat27InstancePublisher{
	public void registerListener(TrNetPat27InstanceListener listener);
	
	public void notifyListeners(TrNetPat27Instance element);
}