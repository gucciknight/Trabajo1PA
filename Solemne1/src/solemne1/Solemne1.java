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
        Vendedor vendedor1 = new Vendedor("valparaiso", "124562346", "vendedor", "primero" , 02, 03, 04, "Tectico en invformatica San Sebastian");
        Vendedor vendedor2 = new Vendedor("valparaiso", "124562346", "vendedor", "segundo" , 02, 05, 04, "Tectico en invformatica U catolica");

    }
    
}
