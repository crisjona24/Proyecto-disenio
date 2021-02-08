/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorJPA;


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


}
