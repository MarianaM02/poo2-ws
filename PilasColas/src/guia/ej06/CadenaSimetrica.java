package guia.ej06;

import pilas_colas.ArrayQueue;
import pilas_colas.ArrayStack;

public class CadenaSimetrica {
	private String cadena;

	public CadenaSimetrica(String cadena) {
		this.cadena = cadena;
	}

	public boolean esSimetrica(String separador) {
		String[] array = this.cadena.split(separador);
		if (array.length == 2 && array[0].length() != array[1].length()) {
			return false;
		}
		ArrayQueue<Character> cola = new ArrayQueue<Character>(array[0].length());
		ArrayStack<Character> pila = new ArrayStack<Character>(array[1].length());
		for (int i = 0; i < array[0].length(); i++) {
			cola.enqueue(array[0].charAt(i));
			pila.push(array[1].charAt(i));
		}
		while (!pila.isEmpty()) {
			if (!pila.pop().equals(cola.dequeue())) {
				return false;
			}
		}
		return true;
	}

}
