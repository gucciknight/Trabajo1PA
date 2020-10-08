/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solemne1;
import solemne1.Asistente;
/**
 *
 * @author Cristian
 */
public class Solemne1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se crean a los empleados
        Empleado Empleados[] = new Empleado[15];
        Empleados[0] = new Gerente("13467567k", "Emilio", "Silva", 01, 02, 1993, "Universitario");
        Empleados[1] = new ResponsableNomina("13467567k", "Emilio", "Silva", 01, 02, 1993, "Universitario");
        Empleados[2] = new Contador("13467567k", "Emilio", "Silva", 01, 02, 1993, "Universitario");
        Empleados[3] = new Asistente("18392821k", "agustin", "rodriguez", 01, 02, 1993, "Universitario");
        Empleados[4] = new Vendedor("RM", "124562346", "vendedor", "primero" , 02, 03, 04, "Tecnico en informatica San Sebastian");
        Empleados[5] = new Vendedor("RM", "124562346", "vendedor", "segundo" , 02, 05, 04, "Tecnico en informatica U Catolica");
        Empleados[6] = new Vendedor("Zona Norte", "124562346", "vendedor", "tercero", 02, 06,04, "Tecnico en informatica Inacap");
        Empleados[7] = new Vendedor("Zona Sur", "124562346", "vendedor", "cuarto", 02, 07, 04, "Tecnico en informatica AIEP");
        Empleados[8] = new ObreroProduccion(true, false, false,"124562346", "Obrero", "Primero", 25, 05,04, "Educacion Media Completa" );
        Empleados[9] = new ObreroProduccion(true, false, false,"124562346", "Obrero", "Segundo", 25, 05,04, "Educacion Media Completa" );
        Empleados[10] = new ObreroProduccion(false, true, false,"124562346", "Obrero", "Tercero", 25, 05,04, "Educacion Media Completa" );
        Empleados[11] = new ObreroProduccion(false, true, false,"124562346", "Obrero", "Cuarto", 25, 05,04, "Educacion Media Completa" );
        Empleados[12] = new ObreroProduccion(false, false, true,"124562346", "Obrero", "Quinto", 25, 05,04, "Educacion Media Completa" );
        Empleados[13] = new ObreroProduccion(false, false, true,"124562346", "Obrero", "Primero", 25, 05,04, "Educacion Media Completa" );
  
        
        //System.out.println(Empleados[13].nombre);
    }
    
}
