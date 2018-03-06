package Aula01;

public class Trapezio extends Poligono{
		double base;
	
	public Trapezio(double base, double segundaBase, double altura) {
		super.setAltura(altura);
		super.setBase(base);
		this.base = segundaBase;
	}

	@Override
	double area() {
		return ((getBase() + base)*getAltura()) / 2;
	}
	
	@Override
	double perimetro() {
		return Math.pow(super.getAltura(), 2) + getBase() + base;
	}

}
