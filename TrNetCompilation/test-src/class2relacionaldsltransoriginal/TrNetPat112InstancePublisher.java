package class2relacionaldsltransoriginal;

public interface TrNetPat112InstancePublisher{
	public void registerListener(TrNetPat112InstanceListener listener);
	
	public void notifyListeners(TrNetPat112Instance element);
}