/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasdejava;

/**
 *
 * @author User
 */
public class Estudiante {
    private String Cedula,Nombre,Apellidos,Direccion;
    private boolean Becado = false;
    private double Matricula;
    public Estudiante(String Cedula, String Nombre, String Apellidos, String Direccion, boolean Becado,double Matricula) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Direccion = Direccion;
        this.Becado = Becado;
        setMatricula(Matricula);
    }

    public Estudiante() {
    }

    public String getCedula() {
        return Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public String getDireccion() {
        return Direccion;
    }

    public boolean isBecado() {
        return Becado;
    }

    public double getMatricula() {
        return Matricula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setBecado(boolean Becado) {
        this.Becado = Becado;
    }

    public void setMatricula(double Matricula) {
        if(!Becado){
        this.Matricula = Matricula;    
        }
        else
        {
        this.Matricula = Matricula * 0.10;   
        }
        
    }
    
    
}
