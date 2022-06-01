package guia00.repaso.ejercicios;

import guia00.repaso.ejercicios.exceptions.MatricesDiferentesTamaniosException;
import java.util.Arrays;

/**
 * Escribir una función que reciba dos matrices de ​NxN y devuelva la suma de
 * las mismas. Podemos considerar que las matrices se representan como un
 * arreglo bidimensional.
 */
public class Ejercicio05 {

    private int[][] matriz1;
    private int[][] matriz2;
    private int[][] matrizResultanteSuma;

    public Ejercicio05(int[][] matriz1, int[][] matriz2) {
        verificarTamanios(matriz1, matriz2);
        this.matriz1 = matriz1;
        this.matriz2 = matriz2;
        this.matrizResultanteSuma = suma();
    }

    public int[][] getMatriz1() {
        return matriz1;
    }

    public int[][] getMatriz2() {
        return matriz2;
    }

    public int[][] getMatrizResultanteSuma() {
        return matrizResultanteSuma;
    }

    private void verificarTamanios(int[][] matriz1, int[][] matriz2) {
        int filasMatriz1 = matriz1.length;
        int filasMatriz2 = matriz2.length;
        int columnasMatriz1 = matriz1[0].length;
        int columnasMatriz2 = matriz2[0].length;
        
        if ((filasMatriz1 != filasMatriz2) || (columnasMatriz1 != columnasMatriz2)) {
            throw new MatricesDiferentesTamaniosException();
        }
    }
    
    private int[][] suma() {
        int filas = this.matriz1.length;
        int columnas = this.matriz1[0].length;
        
        int[][] nuevaMatriz = Arrays.copyOf(matriz1, filas);
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                nuevaMatriz[i][j] += this.matriz2[i][j]; 
            }
        }
        return nuevaMatriz;
    }
}
