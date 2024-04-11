package cliente.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import cliente.model.Cliente;

public class ClienteDao {
	
	public int cadastrarCliente(Cliente cliente) throws ClassNotFoundException{
		String INSERT_USERS_SQL = "INSERT INTO cliente(nome,sobrenome,login,senha,endereco,contato)"
				+ "VALUES (?,?,?,?,?,?);";
		
		int resultado = 0;
		Class.forName("com.mysql.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost/cadastro?useTimezone=true&serverTimezone=UTC";
		String usuario = "root";
		String senha = "senac";
		
		try(Connection connection = DriverManager.getConnection(url,usuario,senha);
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)){
			
			preparedStatement.setString(1, cliente.getNome());
			preparedStatement.setString(2, cliente.getSobrenome());
			preparedStatement.setString(3, cliente.getLogin());
			preparedStatement.setString(4, cliente.getSenha());
			preparedStatement.setString(5, cliente.getEndereco());
			preparedStatement.setString(6, cliente.getContato());
			
			System.out.println(preparedStatement);
			
			resultado = preparedStatement.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}return resultado;		
	}
}
