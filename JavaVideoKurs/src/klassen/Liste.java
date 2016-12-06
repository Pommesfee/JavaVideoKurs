package klassen;

public class Liste<T> {

	private T[] array;
	private int nextFreeSlot = 0;
	
	public Liste(int capacity) {
		array = (T[]) new Object[capacity];
	}
	
	public void add(T t) {
		if (nextFreeSlot == array.length) {
			throw new IllegalStateException("Liste ist voll!");
		}
		array[nextFreeSlot] = t;
		nextFreeSlot++;
	}
	
	public T get(int index) {
		return array[index];
	}
	
	public int getCapacity() {
		return array.length;
	}
	
	public int getElementCount() {
		return nextFreeSlot;
	}
}
