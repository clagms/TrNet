package class2relacionaldsltransoriginal;

public interface TrNetPat91InstancePublisher{
	public void registerListener(TrNetPat91InstanceListener listener);
	
	public void notifyListeners(TrNetPat91Instance element);
}