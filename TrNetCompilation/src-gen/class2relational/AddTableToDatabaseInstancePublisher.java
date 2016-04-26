package class2relational;

public interface AddTableToDatabaseInstancePublisher{
	public void registerListener(AddTableToDatabaseInstanceListener listener);
	
	public void notifyListeners(AddTableToDatabaseInstance element);
}