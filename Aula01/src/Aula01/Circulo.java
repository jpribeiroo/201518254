package Aula01;

public class Circulo extends Figura {
	
	double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	@Override
	double area() {
		return Math.PI * Math.pow(raio, 2);
	}

	@Override
	double perimetro() {
		return 2 * Math.PI * raio;
	}
	
	
	
}