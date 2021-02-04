/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.ControladorServicios;

import Controlador.ControladorDao.EquipoDao;
import Modelo.Equipo;
import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 * Clase servicio la cual interactua directamente con la vista 
 * Permite implementar los metodos para interacturar con la BD
 * desde codigo
 * 
 * @author Cristobal Rios
 */
public class ServicioEquipo implements Serializable {

    private EquipoDao dao = new EquipoDao();
    private Equipo equipo;

    public Equipo getEquipo() {
        if (equipo == null) {
            equipo = new Equipo();
        }
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public void guardar() {
        dao.setEquipo(equipo);
        String mensaje = (equipo.getId_equi() != null) ? "Se ha guardado bien " : "No se ha guardado";
        if (dao.guardar()) {
            /*mensaje de confirmacion*/
            JOptionPane.showMessageDialog(null, mensaje);
            setEquipo(null);
        }
    }
}
