<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="model.Produto"%>
<%@page import ="java.util.List"%>

<!DOCTYPE html>
<html>
	<head>
		<title> Estoque </title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
		<link rel="stylesheet"  href="static/css/estilos.css"/>
	</head>		
	<body>
		<div>
			<ul>
				<li><a href="home"> Busca </a></li>
				<li><a href="estoque"> Estoque </a></li>
			</ul>	
		</div>
			<h2> Estoque</h2>
			<a href="relatorio"> Gerar relatório </a>	
		<div>
			<table>
				<tr>
					<th>ID</th>
					<th>Produto</th>
					<th>Quantidade</th>
					<th>Unidade </th>
					<th>Preço</th>
					<th colspan="2">Descrição</th>
				</tr>

 			<% 
 				List<Produto> produtos = (List)request.getAttribute("produtos");
                for(Produto p: produtos){
                	out.print("<tr>");
                	out.print("<td>" + p.getId() + "</td>");
                	out.print("<td>" + p.getProdnome() + "</td>");
                	out.print("<td>" + p.getQuantidade() + "</td>");
                	out.print("<td>" + p.getPreco() + "</td>");
                	out.print("<td>" + p.getUnidade() + "</td>");
                	out.print("<td>" + p.getDescricao() + "</td>");
                	out.print("<td> <button id='editar'  value='editar'> Editar </button> </td>");
                	out.print("<td> <button id='remover' onclick=remover("+p.getId()+") value='remover'> X </button> </td>");
                	out.print("</tr>");
                }%>
			</table>
		</div>

		<div>
			<button id="addProd" onclick="window.location.href = 'AddProduto';">Adicionar Produto</button>
		</div>

	<script type="text/javascript">
		function remover(id){
			console.log('Remover?id='+ id)
			window.location.href = 'Remover?id='+ id;
		}
	</script> 
	</body>
</html>

