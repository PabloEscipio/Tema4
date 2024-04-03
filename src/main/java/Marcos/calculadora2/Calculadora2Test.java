package Marcos.calculadora2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Calculadora2Test {

calculadora2.Calculadora2 cal;
	
	@Before
	public void before() {
		cal=new calculadora2.Calculadora2();
	}
	
	@Test
	public void test() {
		int esperado;
		cal.add(2,3);
		esperado=5;
		assertEquals("Assert 1 suma",esperado,cal.getBf());
		cal.add(2);
		esperado=7;
		assertEquals("Assert 2 suma a memoria",esperado,cal.getBf());
		cal.subs(3,2);
		esperado=1;
		assertEquals("Assert 3 resta",esperado,cal.getBf());
		cal.subs(2);
		esperado=-1;
		assertEquals("Assert 4 resta a memoria",esperado,cal.getBf());
		cal.div(4,2);
		esperado=2;
		assertEquals("Assert 5 division",esperado,cal.getBf());
	}
	
	
	@After
	public void after() {
		cal.clear();
	}

}
