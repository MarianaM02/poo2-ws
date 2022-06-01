package guia00.repaso.tests;

import guia00.repaso.ejercicios.Ejercicio04;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Ejercicio04Test {
    private Ejercicio04 objeto1;
    private Ejercicio04 objeto2;
    private Ejercicio04 objeto3;
    
    public Ejercicio04Test() {
    }

    @Before
    public void setUp() {
        objeto1 = new Ejercicio04(new int[] {1, 2, 13 ,4, 8, 6});
        objeto2 = new Ejercicio04(new int[] {0, 22, 1 ,45, 2, 50, 3});
        objeto3 = new Ejercicio04(new int[] {-5, 2, -10 ,4, 120});
    }

    @Test
    public void ej04SumatoriaPosicionesParesTest() {
        assertEquals(22, objeto1.getSuma());
        assertEquals(6, objeto2.getSuma());
        assertEquals(105, objeto3.getSuma());
    }
}
