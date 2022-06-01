package guia00.repaso.tests;

import guia00.repaso.ejercicios.Ejercicio03;
import java.util.Arrays;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Ejercicio03Test {

    private Ejercicio03 objeto1;
    private Ejercicio03 objeto2;
    private Ejercicio03 objeto3;

    @Before
    public void setUp() throws Exception {
        objeto1 = new Ejercicio03(new Integer[]{1, 3, 8, 10});
        objeto2 = new Ejercicio03(new Integer[]{1, -3, 8, -10});
        objeto3 = new Ejercicio03(new Integer[]{10, 8, 3, -1});
    }

    @Test
    public void ej03OrdenadoTest() {
        assertFalse(objeto1.isOrdenadoMayorAMenor());
        assertFalse(objeto2.isOrdenadoMayorAMenor());
        assertTrue(objeto3.isOrdenadoMayorAMenor());
    }

}
