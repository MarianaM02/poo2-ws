package pilas_colas;

import java.util.NoSuchElementException;

public interface StackInterface<T> {
	
	public boolean isEmpty();

	public void push(T newItem);

	public T pop() throws NoSuchElementException;

	public T peek() throws NoSuchElementException;
	
	public int getSize();
	
}
