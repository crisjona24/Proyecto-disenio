/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorJPA;

import Modelo.Equipo;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Clase que contiene un objeto del tipo JPA para llamar a los metodos 
 * de interaccion con la BD 
 * Clase que interactura directamente con la vista
 * @author Cristobal Rios 
 */
public class ControladorEquipo {
    EquipoJpaController equipo = new EquipoJpaController();
    
     /*metodo para crear un nuevo Equipo*/
    public void crearEquipo( Equipo equi){
        try {
            equipo.create(equi);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al crear equipo "+ ex);
        }
        
    }
    /*metodo para eliminar un nuevo Equipo*/
    public void eliminarEquipo( Long equi){
        try {
            equipo.destroy(equi);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al crear equipo "+ ex);
        }
    }
    
    /*metodo para listar un nuevo Equipo*/
    public List<Equipo> listarTorneo(Equipo equi) {

        List<Equipo> listaequipos = equipo.findEquipoEntities();
        return listaequipos;
    }
}
