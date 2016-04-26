package class2relacionaldsltransoriginal;

public interface TrNetPat24InstancePublisher{
	public void registerListener(TrNetPat24InstanceListener listener);
	
	public void notifyListeners(TrNetPat24Instance element);
}