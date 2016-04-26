package class2relacionaldsltransoriginal;

public interface TrNetPat30InstancePublisher{
	public void registerListener(TrNetPat30InstanceListener listener);
	
	public void notifyListeners(TrNetPat30Instance element);
}