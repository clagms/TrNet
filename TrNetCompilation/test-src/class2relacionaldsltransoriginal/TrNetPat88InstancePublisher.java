package class2relacionaldsltransoriginal;

public interface TrNetPat88InstancePublisher{
	public void registerListener(TrNetPat88InstanceListener listener);
	
	public void notifyListeners(TrNetPat88Instance element);
}