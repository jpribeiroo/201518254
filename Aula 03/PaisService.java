package Aula3;

import java.util.ArrayList;

import Aula3.Pais;

public class PaisService {
	
		PaisDAO dao;
		Pais pais;
		
	public PaisService() {
		dao = new PaisDAO();
	}
	
	public void atualizar(Pais pais) {   
		dao.atualizar(pais);
		} 
	
	public void criar(Pais pais) {   
		  dao.adicionar(pais);
		  } 
	 
	public void excluir(Pais pais) {   
		dao.delete(pais);  
		} 
	 
	public Pais Consultar() {   
		return pais;  } 
	 
	public ArrayList<Pais> toArrayPais(int quantidade){
		return dao.toArrayPais(quantidade);
	}
	
	public void adicionar(Pais pais) {
		dao.adicionar(pais);
	}
	
	public Pais consultaMaiorPopulacao() {
		return dao.consultaMaiorPopulacao();
	}
	
	public Pais consultaMenorArea() {
		return dao.consultaMenorArea();
	}
	 
	 
	 
	 
}
