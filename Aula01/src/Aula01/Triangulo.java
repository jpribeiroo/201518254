package Aula01;

public class Triangulo extends Poligono{
	private double lateral;
	
	public Triangulo(double altura, double base, double lateral) {
		super.setAltura(altura);
		super.setBase(base);
		this.lateral = lateral;
	}
	@Override
	double area() {
		return super.area() / 2;
	}
	@Override
	double perimetro() {
		return getAltura() + getBase() + lateral ;
	}
	
	

}
