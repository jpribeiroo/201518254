package Aula01;

import java.util.ArrayList;

public class Geometria {
	
		public static String cut(String a) {
			int b = a.length();
			return a.substring(11, b);
		}
	
	public static void main(String args[]) {
		
		ArrayList<Figura> figuras = new ArrayList<>();
		
		//Digite o raio para o circulo
		figuras.add(new Circulo(30));
		
		//Digite parametro altura, parametro base
		figuras.add(new Quadrado(30, 30));
		//Digite parametro altura, parametro base
		figuras.add(new Retangulo(35, 45));
		//Digite parametro altura, parametro base
		figuras.add(new Losango(30, 30));
		//Digite parametro base, parametro altura, parametro lateral
		figuras.add(new Triangulo(30, 30, 30));
		//Digite parametro base, parametro base, parametro altura
		figuras.add(new Trapezio(30, 30, 30));
		
		//Digite parametro raio
		figuras.add(new Esfera(30));
		//Digite parametro raio, parametro altura
		figuras.add(new Cilindro(30, 30));
		//Digite parametro base, parametro altura
		figuras.add(new Cubo(30, 30));
		//Digite parametro lado, parametro altura
		figuras.add(new Piramide(30, 30));
		
		for (Figura a : figuras) {
			
			//fiz a negação pelo motivo das formas que tem volume estavam imprimindo o perimetro sem precisão
			System.out.println("\n" + a.getClass().getSimpleName() + 
								"\nArea: " + a.area() +
								"\nPerimetro: " + a.perimetro()
								);
		
		if(a instanceof Diagonal) {
				System.out.println("Diagonal: " + ((Diagonal)a).calculaDiagonal());
				}
		if(a instanceof Volume) {
			System.out.print("Volume: " + ((Volume)a).calculaVolume()+"\n");
			}
		
		}
		
		
		
	}


}
