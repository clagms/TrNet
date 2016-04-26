package class2relationalexplicitmax;

public interface PatExtendsInstancePublisher{
	public void registerListener(PatExtendsInstanceListener listener);
	
	public void notifyListeners(PatExtendsInstance element);
}