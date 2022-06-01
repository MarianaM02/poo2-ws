package guia.ej01;

import java.util.Scanner;

/**
 * Escribir un programa que lee una secuencia de caracteres y los imprime en
 * orden inverso.
 *
 */
public class Ejercicio01 {

	public static void main(String[] args) {

		InversorCaracteres ic = new InversorCaracteres();
		Scanner sc = new Scanner(System.in);

		System.out.println(">>> Invertir Caracteres <<<");
		System.out.println("Ingrese * para terminar");
		String in = sc.nextLine();
		while (!in.equals("*")) {
			ic.ingresarCaracteres(in);
			in = sc.nextLine();
		}
		sc.close();

		System.out.print(ic.invertir());

	}

}
