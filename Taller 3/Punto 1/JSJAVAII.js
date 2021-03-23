	 
	function suma()
	{
	let valor = document.getElementById("Primero").value;
	let valo2 = document.getElementById("Segundo").value;
	let valor3 = Number(valor) + Number(valo2);
	document.getElementById("Sumado").innerHTML = valor3;
	}
	
	function Restar()
	{
	let valor = document.getElementById("Primero").value;
	let valo2 = document.getElementById("Segundo").value;
	let valor3 = Number(valor) - Number(valo2);
	document.getElementById("Sumado").innerHTML = valor3;
	} 

	function Multiplicar() 
	{
	let valor = document.getElementById("Primero").value;
	let valo2 = document.getElementById("Segundo").value;
	let valor3 = Number(valor) * Number(valo2);
	document.getElementById("Sumado").innerHTML = valor3;
	}

	function Dividir()
	{
	let valor = document.getElementById("Primero").value;
	let valo2 = document.getElementById("Segundo").value;
	let valor3 = Number(valor) / Number(valo2);
	document.getElementById("Sumado").innerHTML = valor3;
	} 

	function Potencia()
	{
	let valor = document.getElementById("Primero").value;
	let valo2 = document.getElementById("Segundo").value;
	let aux = valor;
	for(let i = 1;i<valo2;i++)
	{
	 valor *= aux ;
	}
	let valor3 = Number(valor)
	document.getElementById("Sumado").innerHTML = valor3;
	}

	function contador()
	 {
		
		 document.getElementById("CantidadNum").innerHTML = textarea.value.length;
	 }
