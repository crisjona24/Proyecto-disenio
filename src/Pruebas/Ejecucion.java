/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import ControladorJPA.ControladorEquipo;
import ControladorJPA.ControladorPlanilla;
import Modelo.Equipo;

import Modelo.Planilla;
import java.util.Date;
import java.util.List;

/**
 *
 * @author PC
 */
public class Ejecucion {

    public static void main(String[] args) {

        /* ControladorPlanilla c = new ControladorPlanilla();
        
         Planilla plani = new Planilla();
         plani.setNombreEquipo("FC Barcelona");
         plani.setNombreEquipo1("Real madrid");     
         plani.setLugar("Loja");
         plani.setNombreArbitro("Maria");
        
         c.crearPlanilla(plani);
         System.out.println("Creo planilla");*/
        int numero = 6;
        int c = (factorial(numero))/(factorial((numero-2))*factorial(2));
        System.out.println("El factorial es : " + c);
    }

    public static Integer factorial(int numero) {
        if (numero == 0) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }
    }

}
