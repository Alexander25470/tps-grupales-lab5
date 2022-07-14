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

<form action="modificarClientePut.html" method="get">
	Id cliente: ${cliente.id} <br/>
	<input name="idCliente" value="${cliente.id}" style="display: none"/>
	Ingrese dni: <br/>
	<input type="number" name="dni" value="${cliente.dni}"> <br/>
	Ingrese nombre:<br/>
	<input type="text" name="nombre" value="${cliente.nombre}"><br/>
	Ingrese apellido:<br/>
	<input type="text" name="apellido" value="${cliente.apellido}"><br/>
	Seleccione nacionalidad:<br/>
	<select type="text" name="idNacionalidad" value="${cliente.nacionalidad.id}">
		<c:forEach var="nacionalidad" items="${nacionalidades}">
			<option value="${nacionalidad.id}">${nacionalidad.descripcion}</option>
		</c:forEach>
	</select><br/>
	Ingrese Email:<br/>
	<input type="text" name="email" value="${cliente.email}"><br/>
	Ingrese localidad:<br/>
	<input type="text" name="localidad" value="${cliente.localidad}"><br/>
	Ingrese direccion:<br/>
	<input type="text" name="direccion" value="${cliente.direccion}"><br/>
	Ingrese telefono:<br/>
	<input type="text" name="telefono" value="${cliente.telefono}"><br/>
	Ingrese fecha de nacimiento:<br/>
	<input type="date" name="fechaNacimiento" value="<fmt:formatDate value="${cliente.fechaNacimiento}" pattern="yyyy-MM-dd" />"><br/><br/>
	<button type="submit">Aceptar</button>
</form>

${estadoModificarPersona}

</body>
</html>