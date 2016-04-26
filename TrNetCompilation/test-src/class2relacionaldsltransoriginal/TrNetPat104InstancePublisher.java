package class2relacionaldsltransoriginal;

public interface TrNetPat104InstancePublisher{
	public void registerListener(TrNetPat104InstanceListener listener);
	
	public void notifyListeners(TrNetPat104Instance element);
}