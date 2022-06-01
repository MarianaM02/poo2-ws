package guia.ej04;

/**
 * Escribir un m�todo que eval�a si una cadena de par�ntesis, corchetes y llaves
 * est� bien balanceada y devuelve true si est� bien balanceada y false si est�
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
