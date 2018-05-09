package service;

import java.io.IOException;

import model.Pais;
import dao.PaisDAO;


public class PaisService {
	PaisDAO dao = new PaisDAO();
	
	public int criar(Pais pais) throws IOException {
		return dao.criar(pais);
	}
	
	public void atualizar(Pais pais) throws IOException {
		dao.atualizar(pais);
	}
	
	public void excluir(int id) throws IOException {
		dao.excluir(id);
	}
	
	public Pais carregar(int id) throws IOException {
		return dao.carregar(id);
	}

}
