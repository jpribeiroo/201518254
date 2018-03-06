package Aula01;

public abstract class Poligono extends Figura{
	
	private double base;
	private double altura;


	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	double area() {
		return getAltura() * getBase();
	}
	
	@Override
	abstract double perimetro();
	
	
	
}