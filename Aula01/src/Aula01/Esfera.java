package Aula01;

public class Esfera extends Circulo implements Volume{

	public Esfera(double raio) {
		super(raio);
	}
	
	@Override
	double area() {
		return 4 * (Math.PI * Math.pow(raio, 2));
	}

	@Override
	public double calculaVolume() {
		return (4 * (Math.PI * Math.pow(raio, 3)) / 3);
	}

}
