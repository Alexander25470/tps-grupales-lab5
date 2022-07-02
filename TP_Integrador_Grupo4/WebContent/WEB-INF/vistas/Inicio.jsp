<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib
    prefix="c"
    uri="http://java.sun.com/jsp/jstl/core" 
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Sistema de administración de bibliotecas</h1>

<c:if test="${usuario == null}">
	<h2>Iniciar sesion</h2>
	<form action="iniciarSesion.html" method="get">
		Ingrese Usuario: <br/><input type="text" name="user"> <br/>
		Ingrese Contraseña: <br/><input type="password" name="password"> <br/><br/>
		<input type="submit" value="Aceptar">
	</form>
</c:if>

<c:if test="${usuario != null}">
	<h2>Modulos</h2>
	<p>Bienvenido: ${usuario}</p>
	<form action="clientes.html" method="get">
		<button type="submit" value="Aceptar">ABML clientes</button>
	</form>
	<form action="bibliotecas.html" method="get">
		<button type="submit" value="Aceptar">ABML biblioteca</button>
	</form>
	<form action="prestamos.html" method="get">
		<button type="submit" value="Aceptar">Alta y devolucion de prestamos</button>
	</form>
</c:if>

</body>
</html>