package guia00.repaso.ejercicios;

/**
 * Escribir una función que calcule la suma de los múltiplos de 3 y 5, mayores o
 * iguales que 0 y menores que un parámetro ​n​. Por ejemplo la llamada:
 * sumaMultiplos(10); // devuelve 23 (3+5+6+9) 
 * sumaMultiplos(16); // devuelve 60 (3+5+6+9+10+12+15)
 */
public class Ejercicio02 {
    private int limite;
    private int suma;

    public Ejercicio02(int limite) {
        this.limite = limite;
        this.suma = sumaMultiplos();
    }
    
    public int getLimite() {
        return limite;
    }

    public int getSuma() {
        return suma;
    }
    
    private int sumaMultiplos() {
        int suma = 0;
        for (int i = 1; i < limite; i++) {
            if (i%3 == 0 || i%5==0){
                suma += i;
            }
        }
        return suma;
    }
    
}
