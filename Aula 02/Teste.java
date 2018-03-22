package aula2;
import static aula2.Pais.*;

import java.util.ArrayList;

public class Teste {
	public static void main(String[] args) {
		
		Pais china = new Pais(1, "China", 10000, 20000);
		china.adicionar();
		china.atualizar("CHINA", 453453453, 453453453);
		china.delete();
		
		consultar();													//consulta tudo
	
		ArrayList<Pais> paises = new ArrayList<>(toArrayPais(3)); 		//Consulta por qunatidade e retorna um array
		for (Pais e : paises) {
			System.out.println(
					"ID: "+e.getId()+
					" Nome: "+e.getNome()+
					" População: "+e.getPopulacao()+
					" Area: "+e.getArea()
					);
		}
		
		consultaMaiorPopulacao();										//consulta maior populacao
		consultaMenorArea();											//consulta menor area

	}
}
