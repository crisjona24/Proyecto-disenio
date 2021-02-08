/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.ControladorDao;

import Conexion.Conexion;
import Modelo.Jugador;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristobal Rios
 */
public class JugadorDao extends AdaptadorDao<Jugador> {

    private Jugador jugador;

    public JugadorDao() {
        super(Conexion.em(), Jugador.class);
    }

    public Jugador getJugador() {
        if (jugador == null) {
            jugador = new Jugador();
        }
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    /*sobrecargamos los metodos*/
    public boolean guardar() {
        boolean guardo = false;
        try {
            this.getManejador().getTransaction().begin();
            if (this.jugador.getId_juga() != null) {
                /*llamamos el metodo guardarA y pasamos el objeto de tipo torneo*/
                guardarA(jugador);
            } else {
                /*llamamos el metodo guardarA y pasamos el objeto de tipo torneo*/
                modificar(jugador);

            }
            guardo = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos de equipo", null, JOptionPane.ERROR_MESSAGE);
        }

        return guardo;
    }

}
