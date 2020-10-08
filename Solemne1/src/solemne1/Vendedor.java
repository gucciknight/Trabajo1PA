/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solemne1;
import java.util.Random;
/**
 *
 * @author Emilio
 */
public class Vendedor extends Empleado{
    public String region;
    private int ventasmes;
    
    public Vendedor(String Region , String rut, String nombre, String apellido, int diaFdN, int mesFdN, int anoFdN, String nivelEducativo){
    super(rut, nombre, apellido, diaFdN, mesFdN, anoFdN, nivelEducativo); 
    this.region = Region;
    Random rand = new Random();
    this.ventasmes = rand.nextInt(20);
    this.esAdministrador = false;
    }
     public double getSueldo(){
        double sueldo = 0;
        if(region == "Zona Norte"){
            sueldo = 450000;
        }
        if(region == "RM"){
            sueldo = 350000;
        }
        if(region ==  "Zona Sur"){
            sueldo = 500000;
        }
        return sueldo;
    }
}
