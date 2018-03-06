package Aula01;

public class Retangulo extends Poligono implements Diagonal{
	
	public Retangulo(double altura, double base) {
		super.setAltura(altura);
		super.setBase(base);
	}

	@Override
	double area() {
		return super.area();
	}

	@Override
	public double calculaDiagonal() {
		return Math.sqrt(Math.pow(getAltura(), 2) + Math.pow(getBase(), 2));
	}
	
	@Override
	double perimetro() {
		return 2 * (super.getAltura() + super.getBase());
	}
	

}
