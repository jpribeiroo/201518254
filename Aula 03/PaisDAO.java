package Aula3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Aula3.ConnectionFactory;
import Aula3.Pais;

public class PaisDAO {
	
	Pais pais;
	
	PreparedStatement stm = null;
	ResultSet res = null;
	Connection conn = null;
	
	//CRUD
		public void consultar() {
			String sql = "select * from Pais;";
			
			conn = ConnectionFactory.getConexao();
			try {
			stm = conn.prepareStatement(sql);
			res = stm.executeQuery();
			
				while(res.next()) {
						int id = res.getInt("id");
						String nome = res.getString("nome");
						long populacao = res.getLong("populacao");
						double area = res.getDouble("area");
						System.out.print("\nID: " + id +
									"\nNome: " + nome +
									"\nPopulação: " + populacao+
									"\nArea: " + area);
				}
			}catch (Exception e) {
				e.getStackTrace();
			}
		}
		
		public ArrayList<Pais> toArrayPais(int quantidade) {
			String sql = "select * from Pais limit "+ quantidade +";";
			ArrayList<Pais> paises = new ArrayList<>();

			conn = ConnectionFactory.getConexao();
			try {
			stm = conn.prepareStatement(sql);
			res = stm.executeQuery();
			
				while(res.next()) {
						int id = res.getInt("id");
						String nome = res.getString("nome");
						long populacao = res.getLong("populacao");
						double area = res.getDouble("area");
						
						Pais p = new Pais(id, nome, populacao, area);
						paises.add(p);
					
				}
			}catch (Exception e) {
				e.getStackTrace();
			}
		
			return paises;
		}
		
		
		
		public void adicionar(Pais pais) {
			String sql ="INSERT INTO Pais(`nome`,`populacao`,`area`)VALUES(?, ?, ?);";
			
			try {
			conn = ConnectionFactory.getConexao();
			stm = conn.prepareStatement(sql);

			stm.setString(1, pais.getNome() );
			stm.setLong(2, pais.getPopulacao());
			stm.setDouble(3, pais.getArea());
			
			//linha inserida, o executeupdate retorna numero acima de zero se for bem sucedido
				int rowsInserted = stm.executeUpdate();
				if (rowsInserted > 0) {
					System.out.println("País adicionado com sucesso");
				}
			}catch(Exception e) {
				e.getStackTrace();
			}
			
		}
		
		public void delete(Pais pais) {
			String sql = "delete from Pais where nome = ?";
			
			try {
			conn = ConnectionFactory.getConexao();
			stm = conn.prepareStatement(sql);
			stm.setInt(1, pais.getId());
			
			int rowdelected = stm.executeUpdate(); 
			if (rowdelected > 0) {
				System.out.println("\nID: " + pais.getId() + " removido com sucesso.");
			}
			}catch (Exception e) {e.getStackTrace();}
		}
		
		public void atualizar(Pais pais){
			String sql = "UPDATE Pais SET nome = ?, populacao = ?, area = ? WHERE nome = ?;";
			
			try {
				conn = ConnectionFactory.getConexao();
				stm = conn.prepareStatement(sql);
				stm.setString(1, pais.getNome());
				stm.setLong(2, pais.getPopulacao());
				stm.setDouble(3, pais.getArea());
				stm.setDouble(4, pais.getId());
				
				int rowdelected = stm.executeUpdate(); 
				if (rowdelected > 0) {
					System.out.println("\nID atualizado com sucesso.");
				}
				}catch (Exception e) {e.getStackTrace();}
			}
			
		public Pais consultaMaiorPopulacao() {
			String sql = "select id, nome, populacao, area from Pais order by populacao desc limit 1;";
			
			conn = ConnectionFactory.getConexao();
			try {
			stm = conn.prepareStatement(sql);
			res = stm.executeQuery();
			
				while(res.next()) {
						int id = res.getInt("id");
						String nome = res.getString("nome");
						long populacao = res.getLong("populacao");
						double area = res.getDouble("area");
						pais = new Pais();
						pais.setId(id);
						pais.setNome(nome);
						pais.setPopulacao(populacao);
						pais.setArea(area);
						
				}
			}catch (Exception e) {
				e.getStackTrace();
			}
			return pais;
		}
		
		public Pais consultaMenorArea() {
			String sql = "select id, nome, populacao, area from Pais order by populacao asc limit 1;";
			
			conn = ConnectionFactory.getConexao();
			try {
			stm = conn.prepareStatement(sql);
			res = stm.executeQuery();
			
				while(res.next()) {
						int id = res.getInt("id");
						String nome = res.getString("nome");
						long populacao = res.getLong("populacao");
						double area = res.getDouble("area");
						pais = new Pais();
						pais.setId(id);
						pais.setNome(nome);
						pais.setPopulacao(populacao);
						pais.setArea(area);
				}
			}catch (Exception e) {
				e.getStackTrace();
			}
			return pais;
		}
}
