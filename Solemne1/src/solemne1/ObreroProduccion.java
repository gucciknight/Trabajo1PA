/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solemne1;

/**
 *
 * @author arluna
 */
public class ObreroProduccion extends Empleado{
    public Boolean turnoDia;
    public Boolean turnoTarde;
    public Boolean turnoNoche;
    
    public ObreroProduccion(Boolean turnoDia, Boolean turnoTarde, Boolean turnoNoche, String rut, String nombre, String apellido, int diaFdN, int mesFdN, int anoFdN, String nivelEducativo){
    super(rut, nombre, apellido, diaFdN, mesFdN, anoFdN, nivelEducativo); 
    this.turnoDia = turnoDia;
    this.turnoTarde = turnoTarde;
    this.turnoNoche = turnoNoche;   
    this.esAdministrador = false;
    }
    
    public double getSueldo(){
        double sueldo = 0;
        if(turnoDia = true){
            sueldo = 250000;
        }
        if(turnoTarde = true){
            sueldo = 350000;
        }
        if(turnoNoche =  true){
            sueldo = 450000;
        }
        return sueldo;
    }
}
