package class2relacionaldsltransoriginal;

public interface TrNetPat107InstancePublisher{
	public void registerListener(TrNetPat107InstanceListener listener);
	
	public void notifyListeners(TrNetPat107Instance element);
}