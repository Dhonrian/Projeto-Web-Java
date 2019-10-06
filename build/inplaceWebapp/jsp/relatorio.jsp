<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<title> Relatório </title>
		<meta charset="utf-8">
	</head>
	<body>
		<div>
			<a href="index"> Busca </a>
			<a href="estoque"> Estoque </a>
		</div>

		<div> 
			<h2> Relatório do Estoque </h2>
		</div>

		<div>
			<table>
				<tr>
					<th>ID</th>
					<th>Produto</th>
					<th>Quantidade</th>
					<th>Unidade </th>
					<th> Preço </th>
					<th colspan="2">Descrição</th>

				</tr>
				<tr>
					<td> 0 </td>
					<td> Agua  </td>
					<td> 4 </td>
					<td> L </td>
					<td> 2.50 <td>
					<td> Água mineral pra voce ficar legal </td>	

				</tr>
				<tr>
					<td> 1 </td>
					<td> Chocolate  </td>
					<td> 4 </td>
					<td> g </td>
					<td> 2.00 <td>
					<td> Cioccolata </td>

				</tr>
			</table>
		</div>
		<div>
			<b> Preço total: 18.50</b>
			<b> Total de itens: 8 </b>
		</div>
		
	</body>
</html>