package guia00.repaso.ejercicios;

import java.util.Arrays;
import java.util.Collections;

/**
 * Escribir una función que reciba un arreglo de enteros y devuelva ​true si el
 * arreglo está ordenado de mayor a menor y ​false​ si está desordenado
 */
public class Ejercicio03 {
    private Integer[] arregloInicial;
    private boolean ordenadoMayorAMenor;

    public Ejercicio03(Integer[] arregloInicial) {
        this.arregloInicial = arregloInicial;
        this.ordenadoMayorAMenor = estaOrdenadoMayorAMenor();
    }

    public Integer[] getArregloInicial() {
        return arregloInicial;
    }

    public boolean isOrdenadoMayorAMenor() {
        return ordenadoMayorAMenor;
    }
    
    private boolean estaOrdenadoMayorAMenor() {
        Integer[] arrayOrdenado = Arrays.copyOf(arregloInicial, this.arregloInicial.length);
        Arrays.sort(arrayOrdenado, Collections.reverseOrder());
        return Arrays.equals(arrayOrdenado, this.arregloInicial);
    }
}
