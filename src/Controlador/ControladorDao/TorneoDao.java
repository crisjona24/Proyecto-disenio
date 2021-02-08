/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.ControladorDao;

import Conexion.Conexion;
import Modelo.Torneo;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristobal Rios
 */
public class TorneoDao extends AdaptadorDao<Torneo> {

    private Torneo torneo;

    public TorneoDao() {
        super(Conexion.em(), Torneo.class);
    }

    public Torneo getTorneo() {
        if (torneo == null) {
            torneo = new Torneo();
        }
        return torneo;
    }

    public void setTorneo(Torneo torneo) {
        this.torneo = torneo;
    }

    /*sobrecargamos los metodos*/
    public boolean guardar() {
        boolean guardo = false;
        try {
            this.getManejador().getTransaction().begin();
            if (this.torneo.getId_tor() != null) {
                /*llamamos el metodo guardarA y pasamos el objeto de tipo torneo*/
                guardarA(torneo);
            } else {
                /*llamamos el metodo guardarA y pasamos el objeto de tipo torneo*/
                modificar(torneo);

            }
            guardo = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos de torneo", null, JOptionPane.ERROR_MESSAGE);
        }

        return guardo;
    }

}
