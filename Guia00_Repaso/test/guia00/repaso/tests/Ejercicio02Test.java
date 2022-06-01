package guia00.repaso.tests;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import guia00.repaso.ejercicios.Ejercicio02;

public class Ejercicio02Test {

    private Ejercicio02 objeto1;
    private Ejercicio02 objeto2;
    private Ejercicio02 objeto3;
    private Ejercicio02 objeto4;
    private Ejercicio02 objeto5;

    public Ejercicio02Test() {
    }

    @Before
    public void setUp() {
        objeto1 = new Ejercicio02(10);
        objeto2 = new Ejercicio02(16);
        objeto3 = new Ejercicio02(100);
        objeto4 = new Ejercicio02(30);
        objeto5 = new Ejercicio02(25);
    }

    @Test
    public void ej02CreacionTest() {
        assertEquals(10, objeto1.getLimite());
        assertEquals(16, objeto2.getLimite());
        assertEquals(100, objeto3.getLimite());
        assertEquals(30, objeto4.getLimite());
        assertEquals(25, objeto5.getLimite());
    }

    @Test
    public void ej02SumaTest() {
        assertEquals(23, objeto1.getSuma());
        assertEquals(60, objeto2.getSuma());
        assertEquals(2318, objeto3.getSuma());
        assertEquals(195, objeto4.getSuma());
        assertEquals(143, objeto5.getSuma());
    }

}
