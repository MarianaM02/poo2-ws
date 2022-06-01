package guia00.repaso.tests;

import guia00.repaso.ejercicios.Ejercicio06;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Ejercicio06Test {
    private int[] a1;
    private int[] a2;
    private Ejercicio06 objeto1;
    
    public Ejercicio06Test() {
    }
    
    @Before
    public void setUp() {
        a1 = new int[] {-5,0,0,1,5};
        a2 = new int[] {-10,0,7};
        objeto1 = new Ejercicio06(a1, a2);
    }
    
    @Test
    public void ej06ArregloResultanteTest(){
        int[] esperado = new int[] {-10, -5, 0, 0, 0, 1, 5, 7};
        assertArrayEquals(esperado, objeto1.getArregloResultante());
    }
    
}
