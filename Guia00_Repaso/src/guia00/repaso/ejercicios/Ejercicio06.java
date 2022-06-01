package guia00.repaso.ejercicios;

import java.util.Arrays;

/**
 * Escribir una función que reciba dos arreglos ​a1 y ​a2​, de enteros ordenados
 * de mayor a menor e intercale los elementos de los arreglos que recibe en un
 * nuevo arreglo, tal que el arreglo resultante también esté ordenado. Por
 * ejemplo:
 *
 * a1 = [-5, 0, 0, 1, 5]
 *
 * a2 = [-10, 0, 7]
 *
 * resultado = [-10, -5, 0, 0, 0, 1, 5, 7]
 */
public class Ejercicio06 {
    private int[] arreglo1;
    private int[] arreglo2;
    private int[] arregloResultante;

    public Ejercicio06(int[] arreglo1, int[] arreglo2) {
        this.arreglo1 = arreglo1;
        this.arreglo2 = arreglo2;
        this.arregloResultante = intercalarArreglos();
    }

    public int[] getArreglo1() {
        return arreglo1;
    }

    public int[] getArreglo2() {
        return arreglo2;
    }

    public int[] getArregloResultante() {
        return arregloResultante;
    }
    
    private int[] intercalarArreglos(){
        int tamanioArreglo1 = this.arreglo1.length;
        int tamanioArreglo2 = this.arreglo2.length;
        
        int[] arregloNuevo = Arrays.copyOf(arreglo1, tamanioArreglo1 + tamanioArreglo2);        
        /*
        int j = 0;
        for (int i = tamanioArreglo1; i < arregloNuevo.length; i++) {
            arregloNuevo[i] = this.arreglo2[j];
            j++;
        }*/
        System.arraycopy(this.arreglo2, 0, arregloNuevo, tamanioArreglo1, tamanioArreglo2);
        
        Arrays.sort(arregloNuevo);
        return arregloNuevo;
    }
    
}
