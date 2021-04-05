
package noc1;

import javax.swing.JOptionPane;
public class Noc1 {

    
    public static void main(String[] args) {
        
        
      //multiplicacion();
    potencia();  
      //Crear();
     
    }
    
    public static void multiplicacion(){
        int mult = 0;
        int mult2 = 0;
        int res = 0;
        
        mult = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        mult2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        
        for (int i=0; i<mult2; i++){
            
            res += mult ;
            
        }
        
        JOptionPane.showMessageDialog(null, res);
    }
    
    public static void potencia(){
        int base = 0;
        int exp = 0;
        int aux = 0;
        int res = 0;
        
        base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base"));
        exp = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el exponente"));
        aux = base;
        for (int i=1; i<=exp; i++){
           res=0;
           for(int b=1; b<=aux;b++){
               res = res+base;
           }
           JOptionPane.showMessageDialog(null, base);
            base=res;
        }
        
    }
    
    static public void Crear(){
        Tren a = new Tren("24fz", "mx","xd", 2017, false );
        JOptionPane.showMessageDialog(null, a.getModelo());
    }
}
