package hn.sus.taread;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
    
{
	@BeforeClass
	public static void configuracionInicial() {
		System.out.println("Método de tipo Setup, se ejecuta antes de cada prueba");
	}
	
@Test
	public void testcuadrado1() {
		assertEquals(App.cuadrado(3), 9, 0001);
	}
   @Test
   public void testcuadrado2() {
		assertTrue(App.cuadrado(4)==16);
	}
   @Test
   public void testcuadrado3() {
		assertTrue(App.cuadrado(5)==25);
	}
   @Test

   public void testtriangulo() {
		assertTrue(App.Triangulo(8, 4)==16);
	}
   @Test

   public void testtriangulo2() {
	   assertEquals(App.Triangulo(3, 7), 10.5, 0001);
	}
   @Test
   public void testtriangulo3() {
	   assertEquals(App.Triangulo(9, 7), 31.5, 0001);
	}
   @Test
   public void circulo() {
	   assertEquals(App.circulo(9), 254.460,001);
	}
   @Test
   public void circulo2() {
	   assertEquals(App.circulo(0), 0,001);
	}
   @Test
   public void circulo3() {
	   assertEquals(App.circulo(3), 28.2743,001);
	}
   @Test
	public void testrect1() {
		assertEquals(App.rectangulo(30, 15), 450, 001);
	}
   @Test
   public void testrect2() {
		assertTrue(App.rectangulo(0, 5)==0);
	}
   @Test
   public void testrect3() {
		assertTrue(App.rectangulo(5, 36)==180);
	}
}
