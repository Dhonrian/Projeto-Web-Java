function adicionar(e){
		e.preventDefault();
		var id = document.getElementById("idProd").value;	
		console.log(id);
		const URL_TO_FETCH = 'getProduto?id=' + id;
		 fetch(URL_TO_FETCH, { 
		  method: 'get' 
		  })
		.then(function(response) { 
		  response.json()
		  .then(function(result){ 
		    console.log(result); 
		    appendTabela(result);
		  })
		})
		.catch(function(err) { console.error(err); });
	}

function appendTabela(produto){
  var table = document.getElementById("carrinho");
  var row = table.insertRow(-1);
  var cellId = row.insertCell(0);
  var cellPNome = row.insertCell(1);
  var cellQntd = row.insertCell(2);
  var cellUn = row.insertCell(3);
  var cellPre = row.insertCell(4);
  var cellDesc= row.insertCell(5);

  cellId.innerHTML = produto.id;
  cellPNome.innerHTML = produto.prodnome;
  cellQntd.innerHTML = produto.quantidade;
  cellUn.innerHTML = produto.unidade;
  cellPre.innerHTML = produto.preco.toFixed(2);
  cellDesc.innerHTML = produto.descricao;
}


