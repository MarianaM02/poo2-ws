package guia.ej04;

import pilas_colas.ArrayStack;

public class CadenaBalanceada {
	private String cadena;

	public CadenaBalanceada(String cadena) {
		this.cadena = cadena;
	}

	public boolean estaBalanceada() {
		ArrayStack<Character> pila = new ArrayStack<Character>(10);
		for (int i = 0; i < cadena.length(); i++) {
			Character chActual = cadena.charAt(i);
			if (!pila.isEmpty()) {
				Character anterior = pila.peek();
				boolean cierra = (chActual.equals('}') && anterior.equals('{'))
						|| (chActual.equals(']') && anterior.equals('['))
						|| (chActual.equals(')') && anterior.equals('('));
				if (cierra) {
					pila.pop();
				} else {
					pila.push(chActual);
				}
			} else {
				pila.push(chActual);
			}
		}
		return pila.isEmpty();
	}

}
