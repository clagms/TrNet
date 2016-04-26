package class2relacionaldsltransoriginal;

public interface TrNetPat57InstancePublisher{
	public void registerListener(TrNetPat57InstanceListener listener);
	
	public void notifyListeners(TrNetPat57Instance element);
}