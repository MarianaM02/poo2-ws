package guia.ej05;

import java.util.Scanner;

/**
 * Escribir un programa que evalúa expresiones aritméticas escritas en notación
 * polaca inversa. Si recibe la expresión 4 + 7 * 8 tiene que devolver un error.
 * 
 * Por ejemplo: 4 7 8 * + = 60. 5 1 2 + 4 * + 3 - = 14
 *
 */
public class Ejercicio05 {
	public static void main(String[] args) {
		CalculadoraNotacionPolacaInversa calculadora = new CalculadoraNotacionPolacaInversa();
		Scanner sc = new Scanner(System.in);

		System.out.println(">>> Calculadora Notación Polaca Inversa <<<");
		System.out.println("Ingrese cualquier letra para salir");

		try {
			while (true) {
				calculadora.calcular(sc.nextLine());
			}
		} catch (RuntimeException e) {
			System.out.println("Resultado =" + calculadora.mostrarResultado());
		}

		sc.close();
	}
}
