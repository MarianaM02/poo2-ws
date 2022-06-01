package guia.ej02;

import pilas_colas.ArrayStack;

public class Palabra {

	private String palabra;

	public Palabra(String palabra) {
		if (palabra.isBlank() || palabra.isEmpty()) {
			throw new RuntimeException("El String no contiene una palabra");
		}
		this.palabra = palabra.toLowerCase();
	}

	public boolean esPalindroma() {
		// Comprobando hasta la mitad de la palabra
		ArrayStack<Character> pila = new ArrayStack<>(this.palabra.length());

		for (int i = 0; i < this.palabra.length(); i++) {
			pila.push(this.palabra.charAt(i));
		}
		
		for (int i = 0; i < this.palabra.length() / 2; i++) {
			if(!pila.pop().equals(this.palabra.charAt(i))) {
				return false;
			}
		}

		return true;
	}

	public boolean esPalindroma2() {
		// Dando vuelta el string
		ArrayStack<Character> pila = new ArrayStack<>(this.palabra.length());
		String alReves = "";

		for (int i = 0; i < this.palabra.length(); i++) {
			pila.push(this.palabra.charAt(i));
		}

		while (!pila.isEmpty()) {
			alReves += pila.pop();
		}

		return this.palabra.equalsIgnoreCase(alReves);
	}

}
