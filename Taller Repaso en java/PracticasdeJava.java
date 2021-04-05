/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasdejava;
import javax.swing.JOptionPane;
import  java.util.Random;
/**
 *
 * @author User
 */
public class PracticasdeJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //Mayor();
     //palíndromo();
     Crear();
   
    }
    static public void Crear()
    {
        Estudiante a = new Estudiante("a","b","c","e",true,10);
        Estudiante s = new Estudiante("s","f","3","2",false,12);
        Estudiante d = new Estudiante("a","3","2","1",true,10);
        Estudiante e = new Estudiante("2","3","t","h",false,20);
        Estudiante r = new Estudiante("1","2","m","n",true,30);
          System.out.print(s.getMatricula() + s.getApellidos());
    }
    static public void Mayor(){
       int aux;
       aux = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de numeros a comparar:"));
       int mayor[] = new int[aux];
       for(int c =0;c<aux;c++)
       {
         mayor[c] = Integer.parseInt(JOptionPane.showInputDialog("Numero"));  
       }
       int auxm = 0;
       for(int c=0;c<mayor.length;c++)
       {
           
           if(auxm < mayor[c])
           {
               auxm = mayor[c];
               
           }
           
            aux = auxm;
       }
       JOptionPane.showMessageDialog(null,"Mayor es: " + aux);
    }
    public static void palíndromo(){
               String palabra;
       palabra = JOptionPane.showInputDialog("Ingrese palabra");
       String aux1="";
       String aux2="";
       int cont=0;
       char separado[];
       char alrevez[];
       separado=palabra.toCharArray();
       alrevez = palabra.toCharArray();
       for(int c=0;c<separado.length;c++){
       alrevez[c] = separado[separado.length-1-c];
       }
       for(int c=0;c<alrevez.length;c++){
       aux1 += separado[c] +"";
       aux2 += alrevez[c]+"";
       if(aux1.equals(aux2))
       {
          cont+=1; 
       } 
       }
       if(cont==separado.length)
       {
           JOptionPane.showMessageDialog(null, " Es palíndromo " + aux1);
       }
       else{
          JOptionPane.showMessageDialog(null, " No es palíndromo " + aux1); 
       }
    }

    
}
