package Aula01;

public class Cubo extends Losango implements Volume{

	public Cubo(double altura, double base) {
		super(altura, base);
	}

	@Override
	public double calculaVolume() {
		return Math.pow(getAltura(), 3);
	}

}
