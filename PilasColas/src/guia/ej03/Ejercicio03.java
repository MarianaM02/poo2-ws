package guia.ej03;

import pilas_colas.ArrayQueue;

/**
 * Escribir un método que, dadas dos colas de enteros, construya una cola con el
 * resultado de poner una a continuación de la otra. Por ejemplo: si q1 =
 * [1,2,3] (con 1 al frente y 3 al final) y q2 = [5,7], el resultado es
 * [1,2,3,5,7] (con 1 al frente y 7 al final).
 * 
 */
public class Ejercicio03 {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3};
		int[] arr2 = {5,7};
		
		ArrayQueue<Integer> cola1 = new ArrayQueue<Integer>(arr1.length); 
		ArrayQueue<Integer> cola2 = new ArrayQueue<Integer>(arr2.length);
		
		for (int i : arr1) {
			cola1.enqueue(i);
		}
		for (int i : arr2) {
			cola2.enqueue(i);
		}
		
		QueueMerger qm = new QueueMerger();
		
		ArrayQueue<Integer> resultante = qm.combinarColas(cola1, cola2);
		
		while (!resultante.isEmpty()) {
			System.out.print(resultante.dequeue());
		}
	}
}
