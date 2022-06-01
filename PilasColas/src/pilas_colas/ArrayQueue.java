package pilas_colas;

import java.util.NoSuchElementException;

public class ArrayQueue<T> implements QueueInterface<T> {

	private T[] queue;
	private int size;
	private int first;
	private int last;

	@SuppressWarnings("unchecked")
	public ArrayQueue(int max) {
		queue = (T[]) new Object[max];
		size = 0;
		first = 0;
		last = -1;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public void enqueue(T newItem) throws RuntimeException {
		if (size == queue.length) {
			throw new RuntimeException("Queue is full");
		}
		last = (last + 1) % queue.length;
		queue[last] = newItem;
		size++;
	}

	@Override
	public T dequeue() throws NoSuchElementException {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		T aux = queue[first];
		first = (first + 1) % queue.length;
		size--;
		return aux;
	}

	@Override
	public T peek() throws NoSuchElementException {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		return queue[first];
	}
	
	@Override
	public int getSize() {
		return this.size;
	}

}
