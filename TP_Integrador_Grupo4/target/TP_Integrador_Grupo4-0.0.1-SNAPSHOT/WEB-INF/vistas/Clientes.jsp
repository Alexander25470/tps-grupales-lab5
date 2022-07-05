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
	<h1>Clientes</h1>
	<a href="inicio.html">
		<button>Inicio</button>
	</a>
	<a href="altaCliente.html">
		<button type="submit" value="Aceptar">Alta cliente</button>
	</a>
	
	<br/>
	<br/>
	<form target="clientes.html">
		Ingrese nombre de cliente
		<input name="nombreCliente"/>
		<button type="submit">Buscar</button>
	</form>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>DNI</th>
				<th>Nombre</th>
				<th>Apellido</th>
				<th>Nacionalidad</th>
				<th>Email</th>
				<th>Dirección</th>
				<th>Localidad</th>
				<th>Teléfono</th>
				<th>Fecha Nacimiento</th>
				<th>Accion</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>ID</td>
				<td>DNI</td>
				<td>Nombre</td>
				<td>Apellido</td>
				<td>Nacionalidad</td>
				<td>Email</td>
				<td>Dirección</td>
				<td>Localidad</td>
				<td>Teléfono</td>
				<td>Fecha Nacimiento</td>
				<td>
					<button>Eliminar</button>
					<a href="modificarCliente.html?idCliente=1">
						<button>Editar</button>
					</a>
				</td>
			</tr>
			<tr>
				<td>ID</td>
				<td>DNI</td>
				<td>Nombre</td>
				<td>Apellido</td>
				<td>Nacionalidad</td>
				<td>Email</td>
				<td>Dirección</td>
				<td>Localidad</td>
				<td>Teléfono</td>
				<td>Fecha Nacimiento</td>
				<td>
					<button>Eliminar</button>
					<a href="modificarCliente.html?idCliente=1">
						<button>Editar</button>
					</a>
				</td>
			</tr>
			<tr>
				<td>ID</td>
				<td>DNI</td>
				<td>Nombre</td>
				<td>Apellido</td>
				<td>Nacionalidad</td>
				<td>Email</td>
				<td>Dirección</td>
				<td>Localidad</td>
				<td>Teléfono</td>
				<td>Fecha Nacimiento</td>
				<td>
					<button>Eliminar</button>
					<a href="modificarCliente.html?idCliente=1">
						<button>Editar</button>
					</a>
				</td>
			</tr>
			<tr>
				<td>ID</td>
				<td>DNI</td>
				<td>Nombre</td>
				<td>Apellido</td>
				<td>Nacionalidad</td>
				<td>Email</td>
				<td>Dirección</td>
				<td>Localidad</td>
				<td>Teléfono</td>
				<td>Fecha Nacimiento</td>
				<td>
					<button>Eliminar</button>
					<a href="modificarCliente.html?idCliente=1">
						<button>Editar</button>
					</a>
				</td>
			</tr>
		</tbody>
	</table>
	
</body>
</html>