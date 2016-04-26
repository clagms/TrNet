package class2relacionaldsltransoriginal;

public interface TrNetPat86InstancePublisher{
	public void registerListener(TrNetPat86InstanceListener listener);
	
	public void notifyListeners(TrNetPat86Instance element);
}