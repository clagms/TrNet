package class2relacionaldsltransoriginal;

public interface TrNetPat33InstancePublisher{
	public void registerListener(TrNetPat33InstanceListener listener);
	
	public void notifyListeners(TrNetPat33Instance element);
}