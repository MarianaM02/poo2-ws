package guia00.repaso.tests;

import guia00.repaso.ejercicios.Ejercicio05;
import guia00.repaso.ejercicios.exceptions.MatricesDiferentesTamaniosException;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Ejercicio05Test {

    private Ejercicio05 objeto1;
    private Ejercicio05 objeto2;
    private Ejercicio05 objeto3;

    public Ejercicio05Test() {
    }

    @Before
    public void setUp() {
        objeto1 = new Ejercicio05(
                new int[][]{{2, 5}, {5, 6}},
                new int[][]{{4, 5}, {3, 7}});
        objeto2 = new Ejercicio05(
                new int[][]{{2, 0, 1}, {3, 0, 0}, {5, 1, 1}},
                new int[][]{{1, 0, 1}, {1, 2, 1}, {1, 1, 0}});
    }

    @Test(expected = MatricesDiferentesTamaniosException.class)
    public void ej05ValidacionTest() {
        objeto3 = new Ejercicio05(
                new int[][]{{2, 5, 9}, {5, 6}},
                new int[][]{{4, 5}, {3, 7, 3}});
    }
    
    @Test
    public void ej05SumaTest() {
        assertArrayEquals(new int[][]{{6, 10}, {8, 13}}, objeto1.getMatrizResultanteSuma());
        assertArrayEquals(new int[][]{{3, 0, 2}, {4, 2, 1}, {6, 2, 1}}, objeto2.getMatrizResultanteSuma());
    }

}
