<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html> 
<html>
	<head>
		<title> Vendas </title>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bulma@0.8.0/css/bulma.min.css"/> 
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
			<h2 class="title is-2"> Busca </h2>	
		</div>

		<div>
			<form id="envio_prod" onsubmit="adicionar(event)" method="get">
				<input id="idProd" type="number" name="produto" placeholder="Produto ID"/>
				<input id="qntProd" type="number" name="quantidade" required/>
				<input type="submit" value="Adicionar">
			</form>
		</div>
			<table class="tabelaEstoque" id="carrinho">
				<tr>
					<th>ID</th>
					<th>Produto</th>
					<th>Quantidade</th>
					<th>Unidade </th>
					<th>Preço</th>
					<th colspan="2">Descrição</th>
				</tr>
			</table>

		<div>

		</div>
		<div>
			<form id="Fechar_Compra" action="Finalizacao" method="post">
				<input type="submit" name="fechar_compra" value="Finalizacao">
			</form> 
		</div>
		<script src="<%=request.getContextPath()%>/js/Methods.js"></script>
	</body>
</html>