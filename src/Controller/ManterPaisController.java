package Controller;

import Service.PaisService;
import Negocio.Pais;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/ManterPais.do","/inserir"})
public class ManterPaisController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();
		Pais pais;
		PaisService serv;
		
		if(action.equals("/inserir")) {
			String pNome = request.getParameter("Nome");
			String pArea = request.getParameter("Area");
			String pPop = request.getParameter("Populacao");
			
			pais = new Pais(pNome,Long.parseLong(pPop),Double.parseDouble(pArea));
			
			serv = new PaisService();
			serv.criar(pais);
			
			serv.selectPais(pais);
			//enviar para jsp
			request.setAttribute("pais", pais);
			RequestDispatcher view = request.getRequestDispatcher("exibir_pais.jsp");
			view.forward(request, response);
		}
		
		else if(action.equals("/ManterPais.do")) {
			String pId = request.getParameter("id");
			
			pais = new Pais();
			pais.setId(Integer.parseInt(pId));
			serv = new PaisService();
			serv.selectPais(pais);
			
			PrintWriter out = response.getWriter();
			
			out.println("<html><head><title>Pais Cadastrado</title></head><body>");
			out.println( "Id: "+pais.getId()+"<br>");
			out.println( "Nome: "+pais.getNome()+"<br>");
			out.println( "Area: "+pais.getArea()+"<br>");
			out.println( "Populacao: "+pais.getPopulacao()+"<br>");
			out.println("</body></html>");
			
		}
		
	
	
	}

}
