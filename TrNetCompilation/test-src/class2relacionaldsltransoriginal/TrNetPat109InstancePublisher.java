package class2relacionaldsltransoriginal;

public interface TrNetPat109InstancePublisher{
	public void registerListener(TrNetPat109InstanceListener listener);
	
	public void notifyListeners(TrNetPat109Instance element);
}