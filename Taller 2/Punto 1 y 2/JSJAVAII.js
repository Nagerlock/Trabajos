	 
	function suma()
	{
	
	let valor = document.getElementById("Primero").value;
	let valo2 = document.getElementById("Segundo").value;
	let valor3 = Number(valor) + Number(valo2);
	document.getElementById("Sumado").innerHTML = valor3;
	}

	function contador()
	 {
		
		 document.getElementById("CantidadNum").innerHTML = textarea.value.length;
	 }