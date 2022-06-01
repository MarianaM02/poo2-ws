package guia00.repaso.tests;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import guia00.repaso.ejercicios.Ejercicio01;


public class Ejercicio01Test {
    
    public Ejercicio01Test() {
    }
    private Ejercicio01 objeto1;
    private Ejercicio01 objeto2;
    private Ejercicio01 objeto3;
    private Ejercicio01 objeto4;
    private Ejercicio01 objeto5;
    
    @Before
    public void setUp() {
        objeto1 = new Ejercicio01(1);
        objeto2 = new Ejercicio01(2);
        objeto3 = new Ejercicio01(7);
        objeto4 = new Ejercicio01(97);
        objeto5 = new Ejercicio01(52);
    }
    
    @Test
    public void ej01CreacionTest() {
    	assertEquals(1, objeto1.getNum());
        assertEquals(2, objeto2.getNum());
        assertEquals(7, objeto3.getNum());
        assertEquals(97, objeto4.getNum());
        assertEquals(52, objeto5.getNum());
    }
    
    @Test
    public void ej01EsPrimoTest(){
        assertFalse(objeto1.isPrimo());
        assertTrue(objeto2.isPrimo());
        assertTrue(objeto3.isPrimo());
        assertTrue(objeto4.isPrimo());
        assertFalse(objeto5.isPrimo());
    }
}
