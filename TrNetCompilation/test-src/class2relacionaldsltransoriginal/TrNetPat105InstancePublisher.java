package class2relacionaldsltransoriginal;

public interface TrNetPat105InstancePublisher{
	public void registerListener(TrNetPat105InstanceListener listener);
	
	public void notifyListeners(TrNetPat105Instance element);
}