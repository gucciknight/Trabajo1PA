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
        Asistente asistente1 = new Asistente("18392821k", "agustin", "rodriguez", 01, 02, 1993, "Universitario");
        Asistente asistente2 = new Asistente("123456789", "asistente", "segundo", 02, 02, 2002, "Universitario");
        Vendedor vendedor1 = new Vendedor("RM", "124562346", "vendedor", "primero" , 02, 03, 04, "Tecnico en informatica San Sebastian");
        Vendedor vendedor2 = new Vendedor("RM", "124562346", "vendedor", "segundo" , 02, 05, 04, "Tecnico en informatica U Catolica");
        Vendedor vendedor3 = new Vendedor("Zona Norte", "124562346", "vendedor", "tercero", 02, 06,04, "Tecnico en informatica Inacap");
        Vendedor vendedor4 = new Vendedor("Zona Sur", "124562346", "vendedor", "cuarto", 02, 07, 04, "Tecnico en informatica AIEP");
        ObreroProduccion obreroProd1 = new ObreroProduccion(true, false, false,"124562346", "Obrero", "Primero", 25, 05,04, "Educacion Media Completa" );
        ObreroProduccion obreroProd2 = new ObreroProduccion(true, false, false,"124562346", "Obrero", "Segundo", 25, 05,04, "Educacion Media Completa" );
        ObreroProduccion obreroProd3 = new ObreroProduccion(false, true, false,"124562346", "Obrero", "Tercero", 25, 05,04, "Educacion Media Completa" );
        ObreroProduccion obreroProd4 = new ObreroProduccion(false, true, false,"124562346", "Obrero", "Cuarto", 25, 05,04, "Educacion Media Completa" );
        ObreroProduccion obreroProd5 = new ObreroProduccion(false, false, true,"124562346", "Obrero", "Quinto", 25, 05,04, "Educacion Media Completa" );
        ObreroProduccion obreroProd6 = new ObreroProduccion(false, false, true,"124562346", "Obrero", "Primero", 25, 05,04, "Educacion Media Completa" );
    }
    
}
