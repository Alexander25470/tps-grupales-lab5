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
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==" crossorigin="anonymous" referrerpolicy="no-referrer" />


<title>Alta Biblioteca</title>

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

.buttonSuccess {
  background-color: #4CAF50; /* Green */
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

.buttonSuccess:hover {opacity: 1}


.alertSuccess {
  padding: 20px;
  background-color: #4CAF50;
  color: white;
}

.alertDanger {
  padding: 20px;
  background-color: #fc4040;
  color: white;
}

.closebtn {
  margin-left: 15px;
  color: white;
  font-weight: bold;
  float: right;
  font-size: 22px;
  line-height: 20px;
  cursor: pointer;
  transition: 0.3s;
}

.closebtn:hover {
  color: black;
}

</style>
</head>
<body>

	<div class="header">
		<h1>Alta Biblioteca</h1>
	</div>
	
	<div class="container p-5">
		<div class="row">
			<div class="col-12 d-flex justify-content-center p-2 mb-2">
				<form action="bibliotecas.html" method="get">
					<button class="buttonModulo" type="submit" value="Aceptar">Volver</button>
				</form>
			</div>
		</div>
		
		<form action="altaBibliotecaPost.html" method="get" id="formulario">
			<div class="row d-flex justify-content-center">
				<div class="col-6 d-flex justify-content-center">
					<div class="input-group mb-3">
						<span class="input-group-text" id="basic-addon1">Libro</span>
					  	<select class="form-select" name="ISBN">
						  	<c:forEach var="libro" items="${libros}">
								<option value="${libro.ISBN}">${libro.ISBN} ${libro.titulo}</option>
							</c:forEach>
						</select>
					</div>
				</div>
			</div>
			
			<div class="row d-flex justify-content-center">
				<div class="col-6 d-flex justify-content-center">
					<div class="input-group mb-3">
						<span class="input-group-text" id="basic-addon1">Fecha de Alta</span>
					  	<input class="form-control" type="date" name="fechaAlta">
					</div>
				</div>
			</div>
			
			<div class="row d-flex justify-content-center">
				<div class="col-6 d-flex justify-content-center">
					<input class="buttonSuccess" type="submit" name="btnAgregarPersona" value="Guardar" onclick="return fnValidarDatos()">
				</div>
			</div>
			
			<div class="row d-flex justify-content-center p-5">
				<div class="col-6 d-flex justify-content-center">
					<div class="${classEstado}" id="divAlert">
						<span class="closebtn" onclick="this.parentElement.style.display='none';">&times;</span>
						<div class="d-flex" id="alertMsj">
							${estadoAgregar}
						</div>
					</div>
				</div>
			</div>
		</form>
	</div>
</body>

<script>

function fnValidarDatos(){
	var form = document.getElementById('formulario');
	var data = new FormData(form);
	var container = document.getElementById('alertMsj');
	var text = '';
	
	for (var [key, value] of data) {
	    if(value == ''){
	    	document.getElementById("divAlert").classList.remove("alertDanger");
	    	document.getElementById("divAlert").classList.remove("alertSuccess");
	    	document.getElementById("divAlert").classList.add("alertDanger");
    		container.innerText = '';
    		text = document.createTextNode('Complete todos los campos');
	    	container.appendChild(text);
	    	document.getElementById("divAlert").removeAttribute("style");
	    	
	    	return false;
	    }
	}
	
	return true;
}

</script>

</html>