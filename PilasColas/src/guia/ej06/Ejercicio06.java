package guia.ej06;

/**
 * Escribir un método para determinar si una secuencia de caracteres de entrada
 * es de la forma: X & Y siendo X una cadena de caracteres e Y la cadena
 * inversa. El carácter & es el separador.
 *
 */
public class Ejercicio06 {
	public static void main(String[] args) {
		CadenaSimetrica cs1 = new CadenaSimetrica("X & Y");
		System.out.println(cs1.esSimetrica(" & "));
		CadenaSimetrica cs2 = new CadenaSimetrica("Nami & imaN");
		System.out.println(cs2.esSimetrica(" & "));
		CadenaSimetrica cs3 = new CadenaSimetrica("Cadena & Asimetrica");
		System.out.println(cs3.esSimetrica(" & "));
		CadenaSimetrica cs4 = new CadenaSimetrica("A & A");
		System.out.println(cs4.esSimetrica(" & "));
	}
}
