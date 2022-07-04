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

<h3>Modificar cliente</h3>
<form action="clientes.html" method="get">
	<button type="submit" value="Aceptar">Volver</button>
</form>

<form action="modificarCliente.html" method="get">
	Id cliente: 123 <br/>
	Ingrese dni: <br/>
	<input type="number" name="txtDni" value="34764123"> <br/>
	Ingrese nombre:<br/>
	<input type="text" name="txtNombre" value="persona 1"><br/>
	Ingrese apellido:<br/>
	<input type="text" name="txtApellido" value="apellido"><br/>
	Seleccione nacionalidad:<br/>
	<select type="text" name="txtNacionalidad">
		<option id="1">Argentina</option>
	</select><br/>
	Ingrese Email:<br/>
	<input type="text" name="txtEmail" value="test@email.com"><br/>
	Ingrese localidad:<br/>
	<input type="text" name="txtLocalidad" value="localidad 1"><br/>
	Ingrese fecha de nacimiento:<br/>
	<input type="date" name="txtfechaNacimiento" value="03/07/2022"><br/><br/>
	<input type="submit" name="btnAgregarPersona" value="Aceptar">
</form>

${estadoAgregarPersona}

</body>
</html>