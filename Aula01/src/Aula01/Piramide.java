package Aula01;

public class Piramide extends Poligono implements Volume{

	double lateral;
	
	public Piramide(double base, double altura) {
		setBase(base);
		setAltura(altura);
	}

	@Override
	double perimetro() {
		return getAltura() + getBase() + (lateral = getAltura());
	}

	@Override
	public double calculaVolume() {
		return ((Math.pow(getBase(),2) * getAltura()) / 3);
	}

}
