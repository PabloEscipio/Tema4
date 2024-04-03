package Marcos.calculadora1;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Calculadora1Test {

	@Test
	public void testSumar() {
		int res,esperado;
		res= calculadora1.Calculadora1.sumar(2,3);
		esperado=5;
		assertEquals(esperado,res);
	}

	@Test
	public void testRestar() {
		int res,esperado;
		res= calculadora1.Calculadora1.restar(3,2);
		esperado=1;
		assertEquals(esperado,res);
	}
	
	@Test(expected=ArithmeticException.class)
	public void testDividir() {
		int res,esperado;
		res= calculadora1.Calculadora1.dividir(5,0);
		esperado=0;
		assertEquals(esperado,res);
	}
	
}

