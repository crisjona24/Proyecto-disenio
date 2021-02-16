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
        
        ControladorEquipo c = new ControladorEquipo();
        Equipo equipo = c.obtenerEquipoEspecifico("lala");
        equipo.setTorneo(null);
        c.editarEquipo(equipo);
        System.out.println("Se obtuvo : " + equipo.getNombreEquipo());
        String i = "4";
        Long id = Long.parseLong(i);
        System.out.println("El id es " + String.valueOf(id));
        c.eliminarEquipo(id);
        //System.out.println("se elimino");
    }

    public static Integer factorial(int numero) {
        if (numero == 0) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }
    }

}
