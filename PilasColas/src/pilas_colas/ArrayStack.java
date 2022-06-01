package pilas_colas;

import java.util.NoSuchElementException;

public class ArrayStack<T> implements StackInterface<T> {

	private T[] items;
	private int size;

	@SuppressWarnings("unchecked")
	public ArrayStack(int max) {
		items = (T[]) new Object[max];
		size = 0;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@SuppressWarnings("unchecked")
	private void resize(int newSize) {
		T[] previousItems = items;
		items = (T[]) new Object[newSize];
		for (int i = 0; i < previousItems.length; i++) {
			items[i] = previousItems[i];
		}
	}

	@Override
	public void push(T newItem) {
		// duplica el tamaño del array si hace falta
		if (size == items.length) {
			resize(2 * items.length);
		}
		items[size++] = newItem;

	}

	@Override
	public T pop() throws NoSuchElementException {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		return items[--size];
	}

	@Override
	public T peek() throws NoSuchElementException {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		return items[size-1];
	}
	
	
	@Override
	public int getSize() {
		return this.size;
	}

}
