package class2relacionaldsltransoriginal;

public interface TrNetPat95InstancePublisher{
	public void registerListener(TrNetPat95InstanceListener listener);
	
	public void notifyListeners(TrNetPat95Instance element);
}