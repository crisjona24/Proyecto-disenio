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
    public boolean guardar() {
        boolean guardo = false;
        try {
            this.getManejador().getTransaction().begin();
            if (this.equipo.getId_equi() != null) {
                /*llamamos el metodo guardar y pasamos el objeto de tipo torneo*/
                guardar(equipo);
            } else {
                /*llamamos el metodo guardar y pasamos el objeto de tipo torneo*/
                modificar(equipo);

            }
            guardo = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos de equipo", null, JOptionPane.ERROR_MESSAGE);
        }

        return guardo;
    }

}
