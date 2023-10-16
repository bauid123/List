
public class ArrayList<E> implements List<E> {
	public static final int CAPACITY = 16; // default array capacity
	private E[] data; // generic array used for storage
	private int size = 0; // current number of elements

	public ArrayList() {
		this(CAPACITY);
	} // constructs list with default capacity

	public ArrayList(int capacity) { // constructs list with given capacity
		data = (E[]) new Object[capacity]; // safe cast; compiler may give warning
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public E get(int i) throws IndexOutOfBoundsException {
		checkIndex(i, size);
		return data[i];
	}

	public E set(int i, E e) throws IndexOutOfBoundsException {
		checkIndex(i, size);
		E temp = data[i];
		data[i] = e;
		return temp;
	}

	public void add(int i, E e) throws IndexOutOfBoundsException, IllegalStateException {
		checkIndex(i, size + 1);
		if (size == data.length) // not enough capacity
			throw new IllegalStateException("Array is full");
		for (int k = size - 1; k >= i; k--) // start by shifting rightmost
			data[k + 1] = data[k];
		data[i] = e; // ready to place the new element
		size++;
	}

	public E remove(int i) throws IndexOutOfBoundsException {
		checkIndex(i, size);
		E temp = data[i];
		for (int k = i; k < size - 1; k++) // shift elements to fill hole
			data[k] = data[k + 1];
		data[size - 1] = null; // help garbage collection
		size--;
		return temp;
	}

	protected void checkIndex(int i, int n) throws IndexOutOfBoundsException {
		if (i < 0 || i >= n)
			throw new IndexOutOfBoundsException("Illegal index: " + i);
	}
}
