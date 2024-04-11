<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cliente</title>
</head>
<body>
	
	<div align="center">
		<h1>Formulário de Cadastro de Cliente</h1>
		<form action="<%=request.getContextPath()%>/registra" method="post">
			<table style= "width=80%">
				<tr>
					<td>Nome</td>
					<td><input type="text" name="nome"></td>
				</tr>
				<tr>
					<td>Sobrenome</td>
					<td><input type="text" name="Sobrenome"></td>
				</tr>
				<tr>
					<td>Login</td>
					<td><input type="text" name="Login"></td>
				</tr>
				<tr>
					<td>Senha</td>
					<td><input type="password" name="Senha"></td>
				</tr>
				<tr>
					<td>Endereço</td>
					<td><input type="text" name="Endereco"></td>
				</tr>
				<tr>
					<td>Contato</td>
					<td><input type="text" name="contato"></td>
				</tr>
			</table>
			
			<input type="submit" Value="Submit"/>
		</form>
	</div>
</body>
</html>
