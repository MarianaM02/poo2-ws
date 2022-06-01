package guia.ej05;

import java.util.Scanner;

/**
 * Escribir un programa que eval�a expresiones aritm�ticas escritas en notaci�n
 * polaca inversa. Si recibe la expresi�n 4 + 7 * 8 tiene que devolver un error.
 * 
 * Por ejemplo: 4 7 8 * + = 60. 5 1 2 + 4 * + 3 - = 14
 *
 */
public class Ejercicio05 {
	public static void main(String[] args) {
		CalculadoraNotacionPolacaInversa calculadora = new CalculadoraNotacionPolacaInversa();
		Scanner sc = new Scanner(System.in);

		System.out.println(">>> Calculadora Notaci�n Polaca Inversa <<<");
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
