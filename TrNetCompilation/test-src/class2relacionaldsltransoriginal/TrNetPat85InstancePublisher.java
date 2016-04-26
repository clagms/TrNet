package class2relacionaldsltransoriginal;

public interface TrNetPat85InstancePublisher{
	public void registerListener(TrNetPat85InstanceListener listener);
	
	public void notifyListeners(TrNetPat85Instance element);
}