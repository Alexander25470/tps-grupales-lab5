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
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
<title>Inicio</title>

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

.buttonSuccess {
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 10px 27px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
  -webkit-transition-duration: 0.4s; /* Safari */
  transition-duration: 0.4s;
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

.buttonSuccess:hover {
  box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24),0 17px 50px 0 rgba(0,0,0,0.19);
}

.footer {
   position: fixed;
   left: 0;
   bottom: 0;
   width: 100%;
   background-color: #f4511e9e;
   color: black;
   text-align: center;
}

</style>

</head>
<body>
<div class="header">
  <h1>Sistema de administración de bibliotecas</h1>
</div>

<c:if test="${usuario == null}">
	<form action="iniciarSesion.html" method="get">
		<div class="container p-5">
			<div class="row">
				<div class="col-12 d-flex justify-content-center p-2">
					<h3>Iniciar sesión</h3>
				</div>
			</div>
			<div class="row d-flex justify-content-center">
				<div class="col-6">
					<div class="input-group mb-3">
					  <span class="input-group-text" id="basic-addon1">Usuario</span>
					  <input class="form-control type="text" name="user">
					</div>
				</div>
			</div>
			<div class="row d-flex justify-content-center">
				<div class="col-6">
					<div class="input-group mb-3">
					  <span class="input-group-text" id="basic-addon1">Contraseña</span>
					  <input class="form-control" type="password" name="password">
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-12 d-flex justify-content-center p-2">
					<input class="buttonSuccess" type="submit" value="Aceptar">
				</div>
			</div>
		</div>
		
		
	</form>
</c:if>

<c:if test="${usuario != null}">
	<div class="container p-5">
		<div class="row">
			<div class="col-12 d-flex justify-content-center p-2">
				<h3>Modulos</h3>
			</div>
		</div>
		<div class="row d-flex justify-content-center">
			<div class="col-6 d-flex justify-content-center">
				<form action="clientes.html" method="get">
					<button class="buttonModulo" type="submit" value="Aceptar">ABML Clientes</button>
				</form>
			</div>
		</div>
		
		<div class="row d-flex justify-content-center">
			<div class="col-6 d-flex justify-content-center">
				<form action="bibliotecas.html" method="get">
					<button class="buttonModulo" type="submit" value="Aceptar">ABML Biblioteca</button>
				</form>
			</div>
		</div>
		
		<div class="row d-flex justify-content-center">
			<div class="col-6 d-flex justify-content-center">
				<form action="prestamos.html" method="get">
					<button class="buttonModulo" type="submit" value="Aceptar">Alta y devolución de Prestamos</button>
				</form>
			</div>
		</div>
	</div>
	
	<div class="footer">
		<p><h2>Bienvenido/a: ${usuario}</h2></p>
	</div>
</c:if>

</body>
</html>