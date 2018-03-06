package Aula01;

public class Quadrado extends Poligono implements Diagonal{
	
	public Quadrado(double altura, double base) {
		super.setAltura(altura);
		super.setBase(base);
	}

	@Override
	double area() {
		return super.area();
	}

	@Override
	public double calculaDiagonal() {
		return super.getAltura() * Math.sqrt(2);
	}
	
	@Override
	double perimetro() {
		return 4 * super.getAltura();
	}

}
