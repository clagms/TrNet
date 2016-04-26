package class2relacionaldsltransoriginal;

public interface TrNetPat61InstancePublisher{
	public void registerListener(TrNetPat61InstanceListener listener);
	
	public void notifyListeners(TrNetPat61Instance element);
}