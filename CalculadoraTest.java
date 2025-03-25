package pruebaunitaria1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {
	 @Test
	    public void testSumar() {
	        Calculadora calculadora = new Calculadora();
	        int resultado = calculadora.sumar(2, 3);
	        assertEquals(5, resultado);
	    }

	    @Test
	    public void testRestar() {
	        Calculadora calculadora = new Calculadora();
	        int resultado = calculadora.restar(5, 3);
	        assertEquals(2, resultado);
	    }



}
