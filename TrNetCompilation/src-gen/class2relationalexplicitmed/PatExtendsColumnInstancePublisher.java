package class2relationalexplicitmed;

public interface PatExtendsColumnInstancePublisher{
	public void registerListener(PatExtendsColumnInstanceListener listener);
	
	public void notifyListeners(PatExtendsColumnInstance element);
}