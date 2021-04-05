
package noc1;


public class Tren {
   
   private int año;
   private String id, marca, modelo;
   private boolean AltV = false;
   
   public Tren(String id, String marca, String modelo, int año, boolean AltV){
       
       this.id = id;
       this.marca = marca;
       this.modelo = modelo;
       this.año = año; 
       this.AltV = AltV;
   
   }

    public int getAño() {
        return año;
    }

    public String getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean isAltV() {
        return AltV;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAltV(boolean AltV) {
        this.AltV = AltV;
    }
   public void Modelo(int año){
       if (año>=2022){
           this.modelo = "Modelo Futuro";
       }
       else 
           if (año==2021){
               this.modelo = "Ultimo modelo";
           }
       else
               if(año==2020){
                   this.modelo = "Nuevo modelo";
               }
       else
                   if(año>2017 || año<2019){
                       this.modelo = "Reciente modelo";
                   }
       else
                       if(año<=2016){
                           this.modelo = "Re Old mk";
                       }
   }
   
   
}
