<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<title> Adicionar Produto </title>
		<meta charset="utf8"> 
	</head>
	<body>
		<div>
			<a href="index"> Busca </a>
			<a href="estoque"> Estoque </a>
		</div>

		<h2> Adicionar Produtos </h2>

		<form id="add_prod" action="" method="get">
			<div>
				<input type="number" name="id" placeholder="id" disabled>
			</div>
			<div>
				<input type="text" name="produto" placeholder="Produto">
			</div>
			<div>
				<input type="number" name="quantidade" placeholder="Quantidade">
			</div>
			<div>
				<input type="text" name="unidade" placeholder="Unidade">
			</div>
			<div>	
				<input type="number" name="preco" placeholder="Preço">
			</div>
			<div>
				<input type="submit" value="Adicionar">
				<input type="reset" value="Cancelar" >
			</div>
		</form>

	</body>
</html>