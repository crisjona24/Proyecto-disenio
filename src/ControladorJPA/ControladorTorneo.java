/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorJPA;

import Modelo.Torneo;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Clase que contiene un objeto del tipo JPA para llamar a los metodos de
 * interaccion con la BD Clase que interactura directamente con la vista
 *
 * @author Cristobal Rios
 */
public class ControladorTorneo {

    TorneoJpaController torneo = new TorneoJpaController();

    /*metodo para crear un nuevo Torneo*/
    public void crearTorneo(Torneo tor) {
        try {
            torneo.create(tor);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al crear torneo " + ex);
        }

    }
    /*metodo para eliminar un nuevo Torneo*/

    public void eliminarTorneo(Long id) {
        try {
            torneo.destroy(id);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al borrar torneo " + ex);
        }

    }

    /*metodo para listar un nuevo Torneo*/
    public List<Torneo> listarTorneo() {
        List<Torneo> listaTorneo = null;
        try {
            listaTorneo = torneo.findTorneoEntities();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obteber torneo " + e);
        }

        return listaTorneo;
    }
    
    //metodo para obtener un equipo en concreto
    public Torneo obtenerTorneo(Long id){
        Torneo tor = null;
        try {
            tor = torneo.findTorneo(id);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al obteber torneo " + ex);
        }
        return tor;
    }
}
