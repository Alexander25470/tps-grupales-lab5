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
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==" crossorigin="anonymous" referrerpolicy="no-referrer" />

<title>ABML Clientes</title>

<style type="text/css">
body { 
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

.header {
  overflow: hidden;
  background-color: #f1f1f1;
  padding: 20px 10px;
}

.buttonModulo {
  background-color: #f4511e;
  border: none;
  color: white;
  padding: 16px 32px;
  text-align: center;
  font-size: 16px;
  margin: 4px 2px;
  opacity: 0.6;
  transition: 0.3s;
  display: inline-block;
  text-decoration: none;
  cursor: pointer;
}

.buttonModulo:hover {opacity: 1}

.buttonEdit {
  background-color: #1e62f4;
  border: none;
  color: white;
  padding: 8px 24px;
  text-align: center;
  font-size: 16px;
  margin: 4px 2px;
  opacity: 0.6;
  transition: 0.3s;
  display: inline-block;
  text-decoration: none;
  cursor: pointer;
}

.buttonEdit:hover {opacity: 1}

.buttonDelete {
  background-color: #f41e1e;
  border: none;
  color: white;
  padding: 8px 24px;
  text-align: center;
  font-size: 16px;
  margin: 4px 2px;
  opacity: 0.6;
  transition: 0.3s;
  display: inline-block;
  text-decoration: none;
  cursor: pointer;
}

.buttonDelete:hover {opacity: 1}

</style>
</head>
<body>
<div class="header">
	<h1>ABML Clientes</h1>
</div>
	
	<div class="container p-5">
		<div class="row">
			<div class="col-12 d-flex justify-content-center p-2">
				<a href="inicio.html">
					<button class="buttonModulo">Inicio</button>
				</a>
				<a href="altaCliente.html">
					<button class="buttonModulo" type="submit" value="Aceptar">Alta cliente</button>
				</a>
			</div>
		</div>
		<div class="row d-flex justify-content-center p-4">
			<div class="col-12 d-flex justify-content-end pb-2">
				<form class="d-flex flex-row" action="clientes.html" name="get">
					<input class="form-control" placeholder="Ingrese nombre del cliente..." name="nombreCliente"/>
					<button class="p-2 input-group-text" type="submit"><i class="fa-solid fa-magnifying-glass"></i></button>
				</form>
			</div>
			<div class="col-12">
				<table class="table table-bordered">
					<thead class="table-dark">
						<tr>
							<th>ID</th>
							<th>DNI</th>
							<th>Nombre</th>
							<th>Apellido</th>
							<th>Nacionalidad</th>
							<th>Email</th>
							<th>Direcci�n</th>
							<th>Localidad</th>
							<th>Tel�fono</th>
							<th>Fecha Nacimiento</th>
							<th>Accion</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="cliente" items="${clientes}">
							<tr>
								<td>${cliente.id}</td>
								<td>${cliente.dni}</td>
								<td>${cliente.nombre}</td>
								<td>${cliente.apellido}</td>
								<td>${cliente.nacionalidad.descripcion}</td>
								<td>${cliente.email}</td>
								<td>${cliente.direccion}</td>
								<td>${cliente.localidad}</td>
								<td>${cliente.telefono}</td>
								<td>
								<fmt:formatDate value="${cliente.fechaNacimiento}" pattern="yyyy-MM-dd" />
								</td>
								<td>
									<form action="eliminarCliente.html" method="get">
										<button class="buttonDelete" name="idCliente" value="${cliente.id}" type="submit" >Eliminar</button>
									</form>
									<a href="modificarCliente.html?idCliente=${cliente.id}">
										<button class="buttonEdit"  >Editar</button>
									</a>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				
				<h2>${mensaje}</h2>
			</div>
		</div>
	</div>
</body>
</html>