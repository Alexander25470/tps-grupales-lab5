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

<h3>Alta cliente</h3>
<form action="clientes.html" method="get">
	<button type="submit" value="Aceptar">Volver</button>
</form>

<form action="altaClientePost.html" method="get">
	Ingrese dni: <br/>
	<input type="number" name="dni"> <br/>
	Ingrese nombre:<br/>
	<input type="text" name="nombre"><br/>
	Ingrese apellido:<br/>
	<input type="text" name="apellido"><br/>
	Seleccione nacionalidad:<br/>
	<select type="text" name="idNacionalidad">
		<option value="1">Argentina</option>
	</select><br/>
	Ingrese Email:<br/>
	<input type="text" name="email"><br/>
	Ingrese localidad:<br/>
	<input type="text" name="localidad"><br/>
	Ingrese fecha de nacimiento:<br/>
	<input type="text" name="direccion"><br/>
	Ingrese direccion:<br/>
	<input type="text" name="telefono"><br/>
	Ingrese telefono:<br/>
	<input type="date" name="fechaNacimiento"><br/><br/>
	<button type="submit">Aceptar</button>
</form>

${estadoAgregarPersona}

</body>
</html>