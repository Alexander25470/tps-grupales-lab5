<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib
    prefix="c"
    uri="http://java.sun.com/jsp/jstl/core" 
%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
	<input type="number" name="txtDni" value="${cliente.dni}"> <br/>
	Ingrese nombre:<br/>
	<input type="text" name="txtNombre" value="${cliente.nombre}"><br/>
	Ingrese apellido:<br/>
	<input type="text" name="txtApellido" value="${cliente.apellido}"><br/>
	Seleccione nacionalidad:<br/>
	<select type="text" name="txtNacionalidad" value="${cliente.nacionalidad.id}">
		<option id="1">Argentina</option>
	</select><br/>
	Ingrese Email:<br/>
	<input type="text" name="txtEmail" value="${cliente.email}"><br/>
	Ingrese localidad:<br/>
	<input type="text" name="txtLocalidad" value="${cliente.localidad}"><br/>
	Ingrese fecha de nacimiento:<br/>
	<input type="date" name="txtfechaNacimiento" value="<fmt:formatDate value="${cliente.fechaNacimiento}" pattern="yyyy-MM-dd" />"><br/><br/>
	<input type="submit" name="btnAgregarPersona" value="Aceptar">
</form>

${estadoAgregarPersona}

</body>
</html>