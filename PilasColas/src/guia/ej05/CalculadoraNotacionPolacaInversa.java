package guia.ej05;

import pilas_colas.ArrayStack;

public class CalculadoraNotacionPolacaInversa {

	ArrayStack<Integer> pila = new ArrayStack<Integer>(10);

	public void calcular(String in) {
		if(in.matches("\\d+")) {
			pila.push(Integer.parseInt(in));
			return;
		}
		
		if(!in.matches("[+*-/]")) {
			throw new RuntimeException("No es una operacion valida");
		}
		
		int b = pila.pop();
		int a = pila.pop();
		
		switch (in) {
			case "+" ->	pila.push(a + b);
			case "-" ->	pila.push(a - b);
			case "*" ->	pila.push(a * b);
			case "/" ->	pila.push(a / b);
		}
	}

	public int mostrarResultado() {
		return pila.peek();
	}

}
