<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html> 
<html>
	<head>
		<title> Vendas </title>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/estilos.css">
	</head>	

	<body>
		<div>
			<ul>
				<li><a href="home"> Busca </a></li>
				<li><a href="estoque"> Estoque </a></li>
			</ul>	
		</div>
		
		<div>
			<h2> Busca </h2>	
		</div>

		<div>
			<form id="envio_prod" action="" method="get">
				<input type="number" name="produto" placeholder="Produto ID"/>
				<input type="number" name="quantidade"/>
				<input type="submit" value="Adicionar">
			</form>
		</div>

		<div>

		</div>
		<div>
			<form id="Fechar_Compra" action="Finalizacao" method="post">
				<input type="submit" name="fechar_compra" value="Finalizacao">
			</form> 
		</div>
	</body>
</html>