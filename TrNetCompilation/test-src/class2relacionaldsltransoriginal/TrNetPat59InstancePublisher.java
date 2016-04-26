package class2relacionaldsltransoriginal;

public interface TrNetPat59InstancePublisher{
	public void registerListener(TrNetPat59InstanceListener listener);
	
	public void notifyListeners(TrNetPat59Instance element);
}