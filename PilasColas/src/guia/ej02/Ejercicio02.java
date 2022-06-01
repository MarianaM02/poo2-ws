package guia.ej02;

import java.util.Scanner;

/**
 * Escribir un programa que verifique si una palabra es palíndroma (es decir que
 * una cadena es igual a su inversa. Por ejemplo: las cadenas "1456541" y
 * "145541" son palíndromos)
 *
 */
public class Ejercicio02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(">>> Palindromos <<<");
		System.out.println("Ingrese la palabra a evaluar");
		Palabra p = new Palabra(sc.nextLine());
		sc.close();
		System.out.println(p.esPalindroma());
	}
}
