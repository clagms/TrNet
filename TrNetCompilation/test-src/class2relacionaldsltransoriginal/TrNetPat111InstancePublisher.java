package class2relacionaldsltransoriginal;

public interface TrNetPat111InstancePublisher{
	public void registerListener(TrNetPat111InstanceListener listener);
	
	public void notifyListeners(TrNetPat111Instance element);
}