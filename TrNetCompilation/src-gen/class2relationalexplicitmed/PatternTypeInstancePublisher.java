package class2relationalexplicitmed;

public interface PatternTypeInstancePublisher{
	public void registerListener(PatternTypeInstanceListener listener);
	
	public void notifyListeners(PatternTypeInstance element);
}