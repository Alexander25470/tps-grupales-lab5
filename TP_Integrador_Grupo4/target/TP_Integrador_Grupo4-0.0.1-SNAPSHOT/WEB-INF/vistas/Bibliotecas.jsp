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
	<h1>Bibliotecas</h1>
	<a href="inicio.html">
		<button>Inicio</button>
	</a>
	<a href="altaBiblioteca.html">
		<button type="submit" value="Aceptar">Alta biblioteca</button>
	</a>
	<br/>
	<br/>
	<form target="bibliotecas.html">
		Seleccione estado de biblioteca
		<select name="estadoBiblioteca">
			<option value="0">Todos</option>
			<option value="1">En biblioteca</option>
			<option value="2">Prestado</option>
		</select>
		<button type="submit">Buscar</button>
	</form>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>ISBN</th>
				<th>Nombre libro</th>
				<th>Fecha alta</th>
				<th>Estado</th>
				<th>Accion</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>ID</td>
				<td>ISBN</td>
				<td>Nombre libro</td>
				<td>Fecha alta</td>
				<td>Estado</td>
				<td>
					<button>Eliminar</button>
					<a href="modificarBiblioteca.html?idBiblioteca=1">
						<button>Editar</button>
					</a>
				</td>
			</tr>
			<tr>
				<td>ID</td>
				<td>ISBN</td>
				<td>Nombre libro</td>
				<td>Fecha alta</td>
				<td>Estado</td>
				<td>
					<button>Eliminar</button>
					<a href="modificarBiblioteca.html?idBiblioteca=1">
						<button>Editar</button>
					</a>
				</td>
			</tr>
			<tr>
				<td>ID</td>
				<td>ISBN</td>
				<td>Nombre libro</td>
				<td>Fecha alta</td>
				<td>Estado</td>
				<td>
					<button>Eliminar</button>
					<a href="modificarBiblioteca.html?idBiblioteca=1">
						<button>Editar</button>
					</a>
				</td>
			</tr>
			<tr>
				<td>ID</td>
				<td>ISBN</td>
				<td>Nombre libro</td>
				<td>Fecha alta</td>
				<td>Estado</td>
				<td>
					<button>Eliminar</button>
					<a href="modificarBiblioteca.html?idBiblioteca=1">
						<button>Editar</button>
					</a>
				</td>
			</tr>
		</tbody>
	</table>
</body>
</html>