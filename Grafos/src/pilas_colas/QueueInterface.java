package pilas_colas;

import java.util.NoSuchElementException;

public interface QueueInterface<T> {

	public boolean isEmpty();

	public void enqueue(T newItem) throws RuntimeException;

	public T dequeue() throws NoSuchElementException;

	public T peek() throws NoSuchElementException;
	
	public int getSize();

}
