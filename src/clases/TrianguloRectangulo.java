package clases;

public class TrianguloRectangulo {
	
	private int a;
	private int b;
	private double c;
	
	/**
	 * Constructor por defecto
	 */
	public TrianguloRectangulo() {
		this.a = 1;
		this.b = 1;
	}
	
	/**
	 * Constructor con parametros
	 * @param a cateto
	 * @param b cateto
	 * @throws IllegalArgumentException Si el número es menor que cero
	 */
	public TrianguloRectangulo(int a, int b) {
		if (a <= 0 || b <= 0) {
	            throw new IllegalArgumentException("El número debe ser mayor o igual a cero.");
		} else {
		this.a = a;
		this.b = b;
		}
	}
	
	/**
	 * @return el area del triangulo rectangulo
	 */
	public int area() {
		return (a*b)/2;
	}
	
	/**
	 * @return la hipotenusa del triangulo rectangulo
	 */
	public double hipotenusa() {
		c = Math.sqrt((a*a)+(b*b));
		return c;
	}
	
	/**
	 * @return el perimetro del triangulo rectangulo
	 */
	public double perimetro() {
		return a + b + hipotenusa();
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "TrianguloRectangulo [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	
	
	

}
