package aula2;

import static aula2.Pais.toArrayPais;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PaisTeste {
	Pais p;
	@BeforeEach
	void setUp() throws Exception {
		p = new Pais(1, "PaisTeste", 344444, 33333);
	}

	@Test
	void testConsultar() {
		p.consultar();
	}

	@Test
	void testToArrayPais() {
		ArrayList<Pais> paises = new ArrayList<>(toArrayPais(3)); 		//Consulta por qunatidade e retorna um array
		for (Pais e : paises) {
			System.out.println(
					"ID: "+e.getId()+
					" Nome: "+e.getNome()+
					" População: "+e.getPopulacao()+
					" Area: "+e.getArea()
					);
		}
	}

	@Test
	void testAdicionar() {
		p.adicionar();
	}

	@Test
	void testDelete() {
		p.delete();
	}

	@Test
	void testAtualizar() {
		p.atualizar("Modificado", 44444, 4444444);
	}

	@Test
	void testConsultaMaiorPopulacao() {
		p.consultaMaiorPopulacao();
	}

	@Test
	void testConsultaMenorArea() {
		p.consultaMenorArea();
	}

	@Test
	void testEqualsObject() {
		Pais p2 = new Pais(999,"Falha", 33333, 3333);
		p.equals(p2);
	}

}
