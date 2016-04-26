package class2relacionaldsltransoriginal;

public interface TrNetPat102InstancePublisher{
	public void registerListener(TrNetPat102InstanceListener listener);
	
	public void notifyListeners(TrNetPat102Instance element);
}