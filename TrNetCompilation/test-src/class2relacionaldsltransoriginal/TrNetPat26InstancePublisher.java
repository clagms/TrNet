package class2relacionaldsltransoriginal;

public interface TrNetPat26InstancePublisher{
	public void registerListener(TrNetPat26InstanceListener listener);
	
	public void notifyListeners(TrNetPat26Instance element);
}