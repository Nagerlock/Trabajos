function Verificar()
{
   let uno = document.getElementById("catetoa").value;
   let dos = document.getElementById("catetob").value;
   if(uno != "" && dos !="")
   {
        if(uno == parseFloat(uno) && dos == parseFloat(dos))
        {
            return true;
        }
        else{
           alert("Sin letras >:v");
           return false;    
        }
   }
   else{
       alert("Campos vacios");
       return false;
   }
}


