package class2relationalexplicitmin;

public interface PatExtendsColumnInstancePublisher{
	public void registerListener(PatExtendsColumnInstanceListener listener);
	
	public void notifyListeners(PatExtendsColumnInstance element);
}