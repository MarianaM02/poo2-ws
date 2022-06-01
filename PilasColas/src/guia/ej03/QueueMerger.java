package guia.ej03;

import pilas_colas.ArrayQueue;

public class QueueMerger {

	public ArrayQueue<Integer> combinarColas(ArrayQueue<Integer> cola1, ArrayQueue<Integer> cola2) {
		ArrayQueue<Integer> resultante = new ArrayQueue<Integer>(cola1.getSize() + cola2.getSize());
		while (!cola1.isEmpty()) {
			resultante.enqueue(cola1.dequeue());
		}
		while (!cola2.isEmpty()) {
			resultante.enqueue(cola2.dequeue());
		}
		return resultante;
	}

}
