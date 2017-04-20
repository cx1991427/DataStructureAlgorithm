import java.util.Iterator;

public class MyArrayList<T> implements Iterable<T> {
	int size;
	T[] arr;
	
	public MyArrayList(){
		this.size=0;
		arr=(T[])new Object[11];
	}
	
	public int size(){
		return this.size;
	}
	
	
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return  new ArrayListIterator();
	}
	
}
class ArrayListIterator<T> implements Iterator<T>{

	public boolean hasNext() {
		return false;
	}

	public T next() {
		return null;
	}
	
}
