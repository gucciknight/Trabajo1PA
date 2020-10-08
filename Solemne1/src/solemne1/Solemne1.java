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
        Empleados[2] = new Vendedor("RM", "124562346", "vendedor", "primero" , 02, 03, 04, "Tecnico en informatica San Sebastian");
        Empleados[3] = new Vendedor("RM", "124562346", "vendedor", "segundo" , 02, 05, 04, "Tecnico en informatica U Catolica");
        Empleados[4] = new Vendedor("Zona Norte", "124562346", "vendedor", "tercero", 02, 06,04, "Tecnico en informatica Inacap");
        Empleados[5] = new Vendedor("Zona Sur", "124562346", "vendedor", "cuarto", 02, 07, 04, "Tecnico en informatica AIEP");
        Empleados[6] = new ObreroProduccion(true, false, false,"124562346", "Obrero", "Primero", 25, 05,04, "Educacion Media Completa" );
        Empleados[7] = new ObreroProduccion(true, false, false,"124562346", "Obrero", "Segundo", 25, 05,04, "Educacion Media Completa" );
        Empleados[8] = new ObreroProduccion(false, true, false,"124562346", "Obrero", "Tercero", 25, 05,04, "Educacion Media Completa" );
        Empleados[9] = new ObreroProduccion(false, true, false,"124562346", "Obrero", "Cuarto", 25, 05,04, "Educacion Media Completa" );
        Empleados[10] = new ObreroProduccion(false, false, true,"124562346", "Obrero", "Quinto", 25, 05,04, "Educacion Media Completa" );
        Empleados[11] = new ObreroProduccion(false, false, true,"124562346", "Obrero", "Primero", 25, 05,04, "Educacion Media Completa" );
        Empleados[12] = new Gerente("13467567k", "Emilio", "Silva", 01, 02, 1993, "Universitario");
        Empleados[13] = new ResponsableNomina("13467567k", "Emilio", "Silva", 01, 02, 1993, "Universitario");
        Empleados[14] = new Contador("13467567k", "Emilio", "Silva", 01, 02, 1993, "Universitario");
        Empleados[15] = new Asistente("18392821k", "agustin", "rodriguez", 01, 02, 1993, "Universitario");
        Empleados[16] = new Asistente("123456789", "asistente", "segundo", 02, 02, 2002, "Universitario");
        System.out.println(Empleados[13].nombre);
    }
    
}
