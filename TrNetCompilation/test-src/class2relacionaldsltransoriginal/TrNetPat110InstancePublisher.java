package class2relacionaldsltransoriginal;

public interface TrNetPat110InstancePublisher{
	public void registerListener(TrNetPat110InstanceListener listener);
	
	public void notifyListeners(TrNetPat110Instance element);
}