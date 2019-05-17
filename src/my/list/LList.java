package my.list;

//ÏßÐÔ±í
public interface LList<T> {
	public T get(int index);

	public void insert(T element);
	
	public void insert(int i, T element);

	public T delete(int i);

	public int length();

}
