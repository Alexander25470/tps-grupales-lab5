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

<h1>Alta biblioteca</h1>
<form action="clientes.html" method="get">
	<button type="submit" value="Aceptar">Volver</button>
</form>

<form action="agregarBiblioteca.html" method="get">
	Seleccione libro:<br/>
	<select type="text" name="txtLibro">
		<option id="1">23434 - libro 1</option>
	</select><br/>
	Ingrese fecha de alta:<br/>
	<input type="date" name="txtfechaAlta"><br/><br/>
	<input type="submit" name="btnAgregarPersona" value="Aceptar">
</form>

${estadoAgregarPersona}

</body>
</html>