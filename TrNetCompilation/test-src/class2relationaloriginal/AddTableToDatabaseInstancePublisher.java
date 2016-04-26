package class2relationaloriginal;

public interface AddTableToDatabaseInstancePublisher{
	public void registerListener(AddTableToDatabaseInstanceListener listener);
	
	public void notifyListeners(AddTableToDatabaseInstance element);
}