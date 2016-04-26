package class2relacionaldsltransoriginal;

public interface TrNetPat87InstancePublisher{
	public void registerListener(TrNetPat87InstanceListener listener);
	
	public void notifyListeners(TrNetPat87Instance element);
}