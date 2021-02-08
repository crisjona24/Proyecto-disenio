/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorJPA;

import Modelo.Jugador;
import java.util.List;
import javax.swing.JOptionPane;
import org.jboss.logging.Logger;

/**
 * Clase que contiene un objeto del tipo JPA para llamar a los metodos 
 * de interaccion con la BD 
 * Clase que interactura directamente con la vista
 * @author Cristobal Rios 
 */
public class ControladorJugador {
    JugadorJpaController jugador = new JugadorJpaController();
    
     /*metodo para crear un nuevo Jugador*/
    public void crearJugador( Jugador juga){
        try {
            jugador.create(juga);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al crear equipo "+ ex);
        }
        
    }
    
     /*metodo para eliminar un nuevo Jugador*/
    public void eliminarJugador( Long id){
        try {
            jugador.destroy(id);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al borrar torneo "+ ex);
        }
        
    }
    
     /*metodo para listar un nuevo Jugador*/
    public List<Jugador> listarJugador(Jugador juga) {
        List<Jugador> listajuga = null;
        try {
            listajuga = jugador.findJugadorEntities();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al obteber jugador " + ex);
        }  
        return listajuga;
    }
    
    
    public Jugador obtenerJugador(Long id) {
        Jugador juga = null;
        try {
            juga = jugador.findJugador(id);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al obteber jugador " + ex);
        }
        return juga;
    }
}
