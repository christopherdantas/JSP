<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cliente</title>
</head>
<body>
	
	
	<div align ="center">
	
		<h1>Edição de Usuário</h1>
	
		<form action="<%=request.getContextPath()%>/registra" method="post">
				<table style= "width=80%">
					<tr>
						<td>Login</td>
						<td><input type="text" name="login"></td>
					</tr>
					<tr>
						<td>Senha</td>
						<td><input type="password" name="senha"></td>
					</tr>
				</table>
		</form>
	</div>
		
	
</body>
</html>