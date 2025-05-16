package app;

import clases.TrianguloRectangulo;

public class Principal {

	public static void main(String[] args) {
		
		TrianguloRectangulo TR = new TrianguloRectangulo(4,10);
		TrianguloRectangulo TRd = new TrianguloRectangulo();
		
		double aTR = TR.area();
		double pTR= TR.perimetro();
		double aTRp = TRd.area();
		double pTRp = TRd.perimetro();

	}

}
