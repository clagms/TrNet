package class2relationalexplicitmin;

public interface PatExtendsInstancePublisher{
	public void registerListener(PatExtendsInstanceListener listener);
	
	public void notifyListeners(PatExtendsInstance element);
}