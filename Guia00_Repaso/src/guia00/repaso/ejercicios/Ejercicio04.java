package guia00.repaso.ejercicios;

/**
 * Escribir una función que reciba un arreglo de enteros y devuelva la suma de
 * los elementos que se encuentran en posiciones pares (incluido el elemento de
 * la posición 0). Por ejemplo: Dado el arreglo [1, 2, 13 ,4, 8, 6] devuelve 22
 * (1+13+8)
 */
public class Ejercicio04 {

    private int[] arregloInicial;
    private int suma;

    public Ejercicio04(int[] arregloInicial) {
        this.arregloInicial = arregloInicial;
        this.suma = sumatoriaPosicionesPares();
    }

    public int[] getArregloInicial() {
        return arregloInicial;
    }

    public int getSuma() {
        return suma;
    }

    private int sumatoriaPosicionesPares() {
        int sumatoria = 0;
        for (int i = 0; i < this.arregloInicial.length; i+= 2) {
            sumatoria += this.arregloInicial[i];
        }
        return sumatoria;
    }

}
