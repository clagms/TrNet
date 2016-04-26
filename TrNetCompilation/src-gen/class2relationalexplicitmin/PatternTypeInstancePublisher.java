package class2relationalexplicitmin;

public interface PatternTypeInstancePublisher{
	public void registerListener(PatternTypeInstanceListener listener);
	
	public void notifyListeners(PatternTypeInstance element);
}