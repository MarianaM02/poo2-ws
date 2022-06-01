package recursion;

public class Recursividad {

	public static void imprimirDecimal(int n) {
		if (n >= 10) {
			imprimirDecimal(n / 10);
		}
		System.out.print(n % 10);
	}

	/*
	 * 1. El subprograma se invoca a s� mismo (esto es lo que lo convierte en
	 * recursivo).
	 * 
	 * 2. Cada llamada recursiva se hace con un par�metro de menor valor que el de
	 * la anterior llamada. As�, cada vez se est� invocando a otro problema id�ntico
	 * pero de menor tama�o.
	 * 
	 * 3. Existe un caso especial en el que se act�a de forma diferente, esto es, ya
	 * no se utiliza la recursividad. Lo importante es que la forma en la que el
	 * tama�o del problema disminuye asegura que se llegar� a este caso especial o
	 * caso base. Esto es necesario, porque de lo contrario el programa estar�a
	 * ejecut�ndose indefinidamente.
	 */

	public static boolean esPalindromo(String texto) {
		if (texto.length() <= 1) {
			return true;
		}
		char primero = texto.charAt(0);
		char ultimo = texto.charAt(texto.length() - 1);
		String interior = removerExtremos(texto);
		return (primero == ultimo) && esPalindromo(interior);
	}

	private static String removerExtremos(String texto) {
		return texto.substring(1, texto.length() - 1);
	}

	public static void main(String[] args) {
		System.out.println(esPalindromo("neuquen"));
		imprimirDecimal(368);

	}
}
