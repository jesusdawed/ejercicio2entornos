package ejercicios;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SalarioTest {
	Salario s;
	@Before
	public void setUp() throws Exception {
		s=new Salario();
	}

	@Test
	public void testCalculaSalarioBruto() {
		assertEquals(1360, s.calculaSalarioBruto("Vendedor",2000,8), 0.001);
		assertEquals(1260, s.calculaSalarioBruto("Vendedor",1500,3), 0.001);
		assertEquals(1100, s.calculaSalarioBruto("Vendedor",(float)1499.99,0), 0.001);
		assertEquals(1760, s.calculaSalarioBruto("Encargado", 1250, 8), 0.001);
		assertEquals(1600, s.calculaSalarioBruto("Encargado",1000,0), 0.001);
		assertEquals(1560, s.calculaSalarioBruto("Encargado",(float)999.99,3), 0.001);
		assertEquals(1500, s.calculaSalarioBruto("Encargado",500,0), 0.001);
		assertEquals(1660, s.calculaSalarioBruto("Encargado",0,8), 0.001);
	}

	@Test
	public void testCalculaSalarioNeto() {
		assertEquals(1640, s.calculaSalarioNeto(2000), 0.001);
		assertEquals(1230, s.calculaSalarioNeto(1500), 0.001);
		assertEquals(1259.9916, s.calculaSalarioNeto((float)1499.99), 0.001);
		assertEquals(1050, s.calculaSalarioNeto(1250), 0.001);
		assertEquals(840, s.calculaSalarioNeto(1000), 0.001);
		assertEquals(999.99, s.calculaSalarioNeto((float)999.99), 0.001);
		assertEquals(500, s.calculaSalarioNeto(500), 0.001);
		assertEquals(0, s.calculaSalarioNeto(0), 0.001);
	}

}
