
package guia00.repaso.ejercicios;
/**
 * Escribir una función que reciba un número n y devuelva true si n es primo o false
 * en caso contrario.
 */
public class Ejercicio01 {
    private int num;
    private boolean primo;

    public Ejercicio01(int num) {
        this.num = num;
        this.primo = this.esUnNumeroPrimo(num);
    }

    public int getNum() {
        return num;
    }

    public boolean isPrimo() {
        return primo;
    }
    
    
    public boolean esUnNumeroPrimo(int n){
        if (n == 2)return true;
        if (n<2) return false;
        
        int raizCuadradaDeN = (int) Math.sqrt(n);
        for (int i=2; i<=raizCuadradaDeN; i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
}
