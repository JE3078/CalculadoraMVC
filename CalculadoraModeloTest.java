package org.example.modelo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraModeloTest {

    private CalculadoraModelo modelo;

    @Before
    public void setUp() {
        modelo = new CalculadoraModelo();
    }

    @Test
    public void testSumar() {
        modelo.sumar(5, 3);
        assertEquals(8.0, modelo.getResultado(), 0.001);
    }

    @Test
    public void testRestar() {
        modelo.restar(10, 4);
        assertEquals(6.0, modelo.getResultado(), 0.001);
    }

    @Test
    public void testMultiplicar() {
        modelo.multiplicar(2, 3.5);
        assertEquals(7.0, modelo.getResultado(), 0.001);
    }

    @Test
    public void testDividir() {
        modelo.dividir(10, 2);
        assertEquals(5.0, modelo.getResultado(), 0.001);
    }

    @Test
    public void testDividirPorCero() {
        modelo.dividir(5, 0);
        assertTrue(Double.isNaN(modelo.getResultado()));
    }
}
