/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.ControladorDao;

import Conexion.Conexion;
import Modelo.Equipo;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristobal Rios
 */
public class EquipoDao extends AdaptadorDao<Equipo> {

    private Equipo equipo;

    public EquipoDao() {
        super(Conexion.em(), Equipo.class);
    }

   public Equipo getEquipo() {
        if (equipo == null) {
            equipo = new Equipo();
        }
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    /*sobrecargamos los metodos*/
    public boolean guardarED() {
        boolean guardo = false;
        try {
            guardarA(equipo);
            guardo = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos de equipo"+e, null, JOptionPane.ERROR_MESSAGE);
        }

        return guardo;
    }
    /*sobrecargamos los metodos*/
    public boolean modificarED() {
        boolean guardo = false;
        try {
            modificar(equipo);
            guardo = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al modificar los datos de equipo"+e, null, JOptionPane.ERROR_MESSAGE);
        }

        return guardo;
    }
    /*sobrecargamos los metodos*/
    public boolean borrarED(Long id) {
        boolean guardo = false;
        try {
            borrar(id);
            guardo = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al modificar los datos de equipo"+e, null, JOptionPane.ERROR_MESSAGE);
        }

        return guardo;
    }
    
    /*sobrecargamos los metodos*/
    public Equipo obtenerED(Long id) {
        Equipo equipo = null;
        try {
            equipo = obtener(id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener los datos del equipo", null, JOptionPane.ERROR_MESSAGE);
        }

        return equipo;
    }
    
    /*sobrecargamos los metodos*/
    public Equipo obtenerNo(String nombre) {
        Equipo equipo = null;
        try {
            equipo = obtenernombre(nombre);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener los datos del equipo", null, JOptionPane.ERROR_MESSAGE);
        }

        return equipo;
    }

}
