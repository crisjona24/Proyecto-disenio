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
 * Clase que contiene un objeto del tipo JPA para llamar a los metodos de
 * interaccion con la BD Clase que interactura directamente con la vista
 *
 * @author Cristobal Rios
 */
public class ControladorEquipo {

    EquipoJpaController equipo = new EquipoJpaController();
    Nodo inicio;

    public ControladorEquipo() {
        inicio = null;
    }

    public boolean vacio() {
        return inicio == null;
    }

    /*metodo para crear un nuevo Equipo*/
    public boolean crearEquipo(Equipo equi) {
        boolean creo = false;
        try {
            equipo.create(equi);
            creo = true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al crear equipo " + ex);
        }
        return creo;
    }
    /*metodo para eliminar un nuevo Equipo*/

    public boolean eliminarEquipo(Long equi) {
        boolean elimino = false;

        try {
            equipo.destroy(equi);
            elimino = true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar equipo " + ex);
        }
        return elimino;
    }

    public boolean editarEquipo(Equipo equip) {
        boolean edi = false;
        try {
            equipo.edit(equip);
            edi = true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar equipo " + ex);
        }
        return edi;
    }
    /*metodo para listar un nuevo Equipo*/

    public List<Equipo> listarEquipo() {
        List<Equipo> listaequipos = null;
        try {
            listaequipos = equipo.findEquipoEntities();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener equipo " + e);
        }
        return listaequipos;
    }

    public Equipo obtenerEquipo(Long id) {
        Equipo equi = null;
        try {
            equi = equipo.findEquipo(id);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al obteber equipo " + ex);
        }
        return equi;
    }

    public Equipo obtenerEquipoEspecifico(String nombre) {
        List<Equipo> equi = null;
        Equipo e = new Equipo();
        equi = listarEquipo();
        try {
            for (Equipo equi1 : equi) {
                Nodo nuevo = new Nodo();
                nuevo.setEquipo((Equipo)equi1);
                if (vacio()) {                    
                    inicio = nuevo;
                }else{
                    Nodo aux = inicio;
                    while(aux.getSiquiente()!=null){
                        aux = aux.getSiquiente();
                    }
                    aux.setSiquiente(nuevo);
                }
                
            }
            
            System.out.println("Si paso todo");
            
             Nodo auxi = inicio;
            boolean salir = false;
            
            while(auxi!=null && salir == false){
                if(String.valueOf(auxi.getEquipo().getNombreEquipo()).equals(nombre)){
                    Long id = auxi.getEquipo().getId_equi();
                    e = obtenerEquipo(id);
                    e.setId_equi(id);
                    
                    System.out.println("Si busca ");
                    salir = true;
                }
                auxi = auxi.getSiquiente();
            }
            
           
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al obteber equipo " + ex);
        }
        return e;
    }

}
