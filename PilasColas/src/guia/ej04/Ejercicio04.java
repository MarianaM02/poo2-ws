package guia.ej04;

/**
 * Escribir un método que evalúa si una cadena de paréntesis, corchetes y llaves
 * está bien balanceada y devuelve true si está bien balanceada y false si está
 * mal balanceada. Por ejemplo: [()]{}{[()()]()} debe devolver true, mientras
 * que [(]) debe devolver false.
 * 
 */
public class Ejercicio04 {
	public static void main(String[] args) {

		CadenaBalanceada cb1 = new CadenaBalanceada("[()]{}{[()()]()}");
		System.out.println(cb1.estaBalanceada());
		CadenaBalanceada cb2 = new CadenaBalanceada("[(])");
		System.out.println(cb2.estaBalanceada());
		
	}
}
