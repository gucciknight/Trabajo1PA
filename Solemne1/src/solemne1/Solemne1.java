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
        Gerente elGerente = new Gerente("13467567k", "Emilio", "Silva", 01, 02, 1993, "Universitario");
        
        ResponsableNomina elResponsabledeNomina = new ResponsableNomina("13467567k", "Emilio", "Silva", 01, 02, 1993, "Universitario");
        
        Contador contador = new Contador("13467567k", "Emilio", "Silva", 01, 02, 1993, "Universitario");
        
        Asistente asistente = new Asistente("18392821k", "agustin", "rodriguez", 01, 02, 1993, "Universitario");
        
        Vendedor Vendedores[] = new Vendedor[4];
        Vendedores[0] = new Vendedor("RM", "124562346", "vendedor", "primero" , 02, 03, 04, "Tecnico en informatica San Sebastian");
        Vendedores[1] = new Vendedor("RM", "124562346", "vendedor", "segundo" , 02, 05, 04, "Tecnico en informatica U Catolica");
        Vendedores[2] = new Vendedor("Zona Norte", "124562346", "vendedor", "tercero", 02, 06,04, "Tecnico en informatica Inacap");
        Vendedores[3] = new Vendedor("Zona Sur", "124562346", "vendedor", "cuarto", 02, 07, 04, "Tecnico en informatica AIEP");
        
        ObreroProduccion obrerosProduccion[] = new ObreroProduccion[6]; 
        obrerosProduccion[0] = new ObreroProduccion(true, false, false,"124562346", "Obrero", "Primero", 25, 05,04, "Educacion Media Completa" );
        obrerosProduccion[1] = new ObreroProduccion(true, false, false,"124562346", "Obrero", "Segundo", 25, 05,04, "Educacion Media Completa" );
        obrerosProduccion[2] = new ObreroProduccion(false, true, false,"124562346", "Obrero", "Tercero", 25, 05,04, "Educacion Media Completa" );
        obrerosProduccion[3] = new ObreroProduccion(false, true, false,"124562346", "Obrero", "Cuarto", 25, 05,04, "Educacion Media Completa" );
        obrerosProduccion[4] = new ObreroProduccion(false, false, true,"124562346", "Obrero", "Quinto", 25, 05,04, "Educacion Media Completa" );
        obrerosProduccion[5] = new ObreroProduccion(false, false, true,"124562346", "Obrero", "Primero", 25, 05,04, "Educacion Media Completa" );
        
        System.out.println(obrerosProduccion[4].getSueldo());
        //responsable de nomina, crea nomina
        
        elResponsabledeNomina.crearNomina(1);
    }
    
}
