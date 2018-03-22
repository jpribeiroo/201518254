package Aula3;

public class Teste {
	public static void main(String args[]) {
		PaisService pservice = new PaisService();
		
		Pais pais = new Pais(1, "Colombia", 324234, 3243234);
		pservice.adicionar(pais);
	}
}
