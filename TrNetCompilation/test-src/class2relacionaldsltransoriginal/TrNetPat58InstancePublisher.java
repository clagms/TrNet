package class2relacionaldsltransoriginal;

public interface TrNetPat58InstancePublisher{
	public void registerListener(TrNetPat58InstanceListener listener);
	
	public void notifyListeners(TrNetPat58Instance element);
}