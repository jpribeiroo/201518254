package aula2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Pais {
	PreparedStatement stm = null;
	ResultSet res = null;
	Connection conn = null;
	
	static PreparedStatement stmS = null;
	static ResultSet resS = null;
	static Connection connS = null;
	
	private int id;
	private String nome;
	private long populacao;
	private double area;
	
	//construtor padrao
	public Pais() {};
	
	//construtor com atributos
	public Pais(int id, String nome, long populacao, double area) {
		this.id=id;
		this.nome=nome;
		this.populacao=populacao;
		this.area=area;
	}
	
	//CRUD
	public static void consultar() {
		String sql = "select * from Pais;";
		
		connS = Conexao.getConexao();
		try {
		stmS = connS.prepareStatement(sql);
		resS = stmS.executeQuery();
		
			while(resS.next()) {
					int id = resS.getInt("id");
					String nome = resS.getString("nome");
					long populacao = resS.getLong("populacao");
					double area = resS.getDouble("area");
					System.out.print("\nID: " + id +
								"\nNome: " + nome +
								"\nPopulação: " + populacao+
								"\nArea: " + area);
			}
		}catch (Exception e) {
			e.getStackTrace();
		}
	}
	
	public static ArrayList<Pais> toArrayPais(int quantidade) {
		String sql = "select * from Pais limit "+ quantidade +";";
		ArrayList<Pais> paises = new ArrayList<>();

		connS = Conexao.getConexao();
		try {
		stmS = connS.prepareStatement(sql);
		resS = stmS.executeQuery();
		
			while(resS.next()) {
					int id = resS.getInt("id");
					String nome = resS.getString("nome");
					long populacao = resS.getLong("populacao");
					double area = resS.getDouble("area");
					
					Pais p = new Pais(id, nome, populacao, area);
					paises.add(p);
				
			}
		}catch (Exception e) {
			e.getStackTrace();
		}
	
		return paises;
	}
	
	
	
	public void adicionar() {
		String sql ="INSERT INTO Pais(`nome`,`populacao`,`area`)VALUES(?, ?, ?);";
		
		try {
		conn = Conexao.getConexao();
		stm = conn.prepareStatement(sql);

		stm.setString(1, this.getNome() );
		stm.setLong(2, this.getPopulacao());
		stm.setDouble(3, this.getArea());
		
		//linha inserida, o executeupdate retorna numero acima de zero se for bem sucedido
			int rowsInserted = stm.executeUpdate();
			if (rowsInserted > 0) {
				System.out.println("País adicionado com sucesso");
			}
		}catch(Exception e) {
			e.getStackTrace();
		}
		
	}
	
	public void delete() {
		String sql = "delete from Pais where nome = ?";
		
		try {
		conn = Conexao.getConexao();
		stm = conn.prepareStatement(sql);
		stm.setString(1, this.getNome());
		
		int rowdelected = stm.executeUpdate(); //ou executequery
		if (rowdelected > 0) {
			System.out.println("\nID: " + id + " removido com sucesso.");
		}
		}catch (Exception e) {e.getStackTrace();}
	}
	
	public void atualizar(String nome, long populacao, double area){
		String sql = "UPDATE Pais SET nome = ?, populacao = ?, area = ? WHERE nome = ?;";
		
		try {
			conn = Conexao.getConexao();
			stm = conn.prepareStatement(sql);
			stm.setString(4, this.getNome());
			stm.setString(1, nome);
			stm.setLong(2, populacao);
			stm.setDouble(3, area);
			
			int rowdelected = stm.executeUpdate(); 
			if (rowdelected > 0) {
				System.out.println("\nID atualizado com sucesso.");
			}
			}catch (Exception e) {e.getStackTrace();}
		}
		
	public static void consultaMaiorPopulacao() {
		String sql = "select id, nome, populacao, area from Pais order by populacao desc limit 1;";
		
		connS = Conexao.getConexao();
		try {
		stmS = connS.prepareStatement(sql);
		resS = stmS.executeQuery();
		
			while(resS.next()) {
					int id = resS.getInt("id");
					String nome = resS.getString("nome");
					long populacao = resS.getLong("populacao");
					double area = resS.getDouble("area");
					System.out.print("\nID: " + id +
								"\nNome: " + nome +
								"\nPopulação: " + populacao+
								"\nArea: " + area);
			}
		}catch (Exception e) {
			e.getStackTrace();
		}
	}
	
	public static void consultaMenorArea() {
		String sql = "select id, nome, populacao, area from Pais order by populacao asc limit 1;";
		
		connS = Conexao.getConexao();
		try {
		stmS = connS.prepareStatement(sql);
		resS = stmS.executeQuery();
		
			while(resS.next()) {
					int id = resS.getInt("id");
					String nome = resS.getString("nome");
					long populacao = resS.getLong("populacao");
					double area = resS.getDouble("area");
					System.out.print("\nID: " + id +
								"\nNome: " + nome +
								"\nPopulação: " + populacao+
								"\nArea: " + area);
			}
		}catch (Exception e) {
			e.getStackTrace();
		}
	}

	
	//getters e setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getPopulacao() {
		return populacao;
	}
	public void setPopulacao(long populacao) {
		this.populacao = populacao;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
}
