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
public class Vendedor extends Empleado{
    public String region;
    private int ventasmes;
    
    public Vendedor(String Region , int ventasMes, String rut, String nombre, String apellido, int diaFdN, int mesFdN, int anoFdN, String nivelEducativo, Boolean esAdministrador){
    super(rut, nombre, apellido, diaFdN, mesFdN, anoFdN, nivelEducativo, esAdministrador); 
    this.region = Region;
    this.ventasmes = ventasMes;
    this.esAdministrador = false;
    }
}
