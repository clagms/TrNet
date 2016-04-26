package class2relationalexplicitmax;

public interface PatternTypeInstancePublisher{
	public void registerListener(PatternTypeInstanceListener listener);
	
	public void notifyListeners(PatternTypeInstance element);
}