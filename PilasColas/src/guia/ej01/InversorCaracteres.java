package guia.ej01;

import pilas_colas.ArrayStack;
import pilas_colas.StackInterface;

public class InversorCaracteres {

	StackInterface<String> pila = new ArrayStack<String>(10);

	public void ingresarCaracteres(String in) {
		pila.push(in);
	}

	public String invertir() {
		String alReves = "";
		while (!pila.isEmpty()) {
			alReves += pila.pop();
		}
		return alReves;
	}

}
