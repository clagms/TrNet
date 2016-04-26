package generic;

public interface ModelPatternPublisher{
	public void registerListener(ModelPatternListener listener);
	
	public void notifyListeners(ModelPattern element);
}