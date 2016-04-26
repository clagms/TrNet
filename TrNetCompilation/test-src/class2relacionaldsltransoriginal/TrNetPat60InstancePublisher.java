package class2relacionaldsltransoriginal;

public interface TrNetPat60InstancePublisher{
	public void registerListener(TrNetPat60InstanceListener listener);
	
	public void notifyListeners(TrNetPat60Instance element);
}