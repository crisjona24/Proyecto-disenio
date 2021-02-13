/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorJPA;


import Modelo.NodoPlanilla;
import Modelo.Planilla;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Clase que contiene un objeto del tipo JPA para llamar a los metodos de
 * interaccion con la BD Clase que interactura directamente con la vista
 *
 * @author Cristobal Rios
 */
public class ControladorPlanilla {
    PlanillaJpaController planilla = new PlanillaJpaController();
    NodoPlanilla inicio;

    public ControladorPlanilla() {
        inicio = null;
    }
          
    public boolean vacio() {
        return inicio == null;
    }
    
    /*metodo para crear un nuevo Equipo*/
    public boolean crearPlanilla(Planilla plani) {
        boolean creo = false;
        try {
            planilla.create(plani);
            creo = true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al crear planilla " + ex);
        }
        return creo;
    }
    /*metodo para eliminar un nuevo Equipo*/

    public boolean eliminarPlanilla(Long equi) {
        boolean elimino = false;

        try {
            planilla.destroy(equi);
            elimino = true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar planilla " + ex);
        }
        return elimino;
    }

    public boolean editarPlanilla(Planilla plani) {
        boolean edi = false;
        try {
            planilla.edit(plani);
            edi = true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar planilla " + ex);
        }
        return edi;
    }
    /*metodo para listar un nuevo Equipo*/

    public List<Planilla> listarPlanilla() {
        List<Planilla> listaPlanilla = null;
        try {
            listaPlanilla = planilla.findPlanillaEntities();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener planilla " + e);
        }
        return listaPlanilla;
    }

    public Planilla obtenerPlanilla(Long id) {
        Planilla equi = null;
        try {
            equi = planilla.findPlanilla(id);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al obteber planilla " + ex);
        }
        return equi;
    }
    
      /**
     * 
     * @param nombre
     * @return Un objeto Planilla buscado por los nombres de las equipos enfrentados
     */
    public Planilla obtenerPlanillaespecifico(String nombre, String n1) {
        List<Planilla> plani = null;
        Planilla p = null;
        plani = listarPlanilla();
        try {
            
            for (Planilla equi1 : plani) {       
                NodoPlanilla nuevo = new NodoPlanilla();
                nuevo.setPlanilla((Planilla)equi1);
                if (vacio()) {                    
                    inicio = nuevo;
                }else{
                    NodoPlanilla aux = inicio;
                    while(aux.getSiquiente()!=null){
                        aux = aux.getSiquiente();
                    }
                    aux.setSiquiente(nuevo);
                }
                
            }        
            /*una vez pasada la lista a una lista de nodos, buscamos dentro a traves del nombre*/
            NodoPlanilla auxi = inicio;
            boolean salir = false;
            
            while(auxi!=null && salir == false){
                if((String.valueOf(auxi.getPlanilla().getNombreEquipo()).equalsIgnoreCase(nombre))
                        &&(String.valueOf(auxi.getPlanilla().getNombreEquipo1()).equalsIgnoreCase(nombre))){
                    Long id = auxi.getPlanilla().getId_plani();
                    p = obtenerPlanilla(id);
                    p.setId_plani(id);
                    
                    salir = true;
                }
                auxi = auxi.getSiquiente();
            }
            
           
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al obteber equipo " + ex);
        }
        return p;
    }

}
