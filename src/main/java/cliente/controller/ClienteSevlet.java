package cliente.controller;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cliente.dao.ClienteDao;
import cliente.model.Cliente;

@WebServlet("/registra")
public class ClienteSevlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	private ClienteDao clienteDao;
	
	public void init() {
		clienteDao = new ClienteDao();
				
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws IOException{
		String nome = request.getParameter("nome");
		String sobrenome = request.getParameter("sobrenome");
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		String endereco = request.getParameter("endereco");
		String contato = request.getParameter("contato");
		
		Cliente cliente = new Cliente();
		cliente.setNome(nome);
		cliente.setNome(sobrenome);
		cliente.setNome(login);
		cliente.setNome(senha);
		cliente.setNome(endereco);
		cliente.setNome(contato);
		
		try {
			clienteDao.cadastrarCliente(cliente);
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("clientedetalhes.jsp");
	}
	
	
}
