/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solemne1;
/**
 *
 * @author Emilio
 */
public class Empleado {
    public String rut;
    public String nombre;
    public String apellido;
    public int diaFdN; //fecha de nacimiento
    public int mesFdN;
    public int anoFdN;
    public String nivelEducativo;
    public Boolean esAdministrador;
    
    public Empleado(){}
    
    public Empleado(String rut, String nombre, String apellido, int diaFdN, int mesFdN, int anoFdN, String nivelEducativo ){
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.diaFdN = diaFdN;
        this.mesFdN = mesFdN;
        this.anoFdN = anoFdN;
        this.nivelEducativo = nivelEducativo;
        this.esAdministrador = esAdministrador;
    }
     public double getSueldo(){
        double sueldo = 0;
        if(esAdministrador == true){
            sueldo = 700000;
            }
        return sueldo;
     }
}   
