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
public class ResponsableNomina extends Empleado {
   
    public ResponsableNomina(String rut, String nombre, String apellido, int diaFdN, int mesFdN, int anoFdN, String nivelEducativo){
            super(rut, nombre, apellido, diaFdN, mesFdN, anoFdN, nivelEducativo);
                this.esAdministrador = false;
    }
    
    public static void crearNomina(int mes) {
        
        Nomina nuevaNomina = new Nomina(mes, false);
        System.out.println("la nomina ha sido creada");
} 
    
}