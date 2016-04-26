package class2relacionaldsltransoriginal;

public interface TrNetPat25InstancePublisher{
	public void registerListener(TrNetPat25InstanceListener listener);
	
	public void notifyListeners(TrNetPat25Instance element);
}