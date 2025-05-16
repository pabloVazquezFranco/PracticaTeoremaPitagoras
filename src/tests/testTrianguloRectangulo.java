package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.TrianguloRectangulo;

class testTrianguloRectangulo {

	@Test
	void testArea1() {
		TrianguloRectangulo TR = new TrianguloRectangulo(4,10);
        assertEquals(20,TrianguloRectangulo.area());
	}
	
	@Test
	void testArea2() {
		TrianguloRectangulo TR = new TrianguloRectangulo();
        assertEquals(0,TrianguloRectangulo.area());
	}
	
	@Test
	void testHipotenusa1() {
		TrianguloRectangulo TR = new TrianguloRectangulo(4,10);
        assertEquals(10.770329614269007,TrianguloRectangulo.hipotenusa());
	}
	
	@Test
	void testHipotenusa2() {
		TrianguloRectangulo TR = new TrianguloRectangulo();
        assertEquals(1.4142135623730951,TrianguloRectangulo.hipotenusa());
	}
	
	@Test
	void testPerimetro1() {
		TrianguloRectangulo TR = new TrianguloRectangulo(4,10);
        assertEquals(24.77032961426901,TrianguloRectangulo.perimetro());
	}
	
	@Test
	void testPerimetro2() {
		TrianguloRectangulo TR = new TrianguloRectangulo();
        assertEquals(3.414213562373095,TrianguloRectangulo.perimetro());
	}
	
	/*
	@Test
    void testPrimoExcepcion() {
		TrianguloRectangulo TR = new TrianguloRectangulo(-4,10);
        assertThrows(IllegalArgumentException.class, () -> TrianguloRectangulo.getA);
    }
    */
    
	
	
	
	

}
