/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.ControladorServicios;


import Controlador.ControladorDao.JugadorDao;
import Modelo.Jugador;
import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 * Clase servicio la cual interactua directamente con la vista 
 * Permite implementar los metodos para interacturar con la BD
 * desde codigo
 * 
 * @author Cristobal Rios
 */
public class ServicioJugador implements Serializable {

    private JugadorDao dao = new JugadorDao();
    private Jugador jugador;

   public Jugador getJugador() {
        if (jugador == null) {
            jugador = new Jugador();
        }
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public void guardar() {
        dao.setJugador(jugador);
        String mensaje = (jugador.getId_juga() != null) ? "Se ha guardado bien " : "No se ha guardado";
        if (dao.guardar()) {
            /*mensaje de confirmacion*/
            JOptionPane.showMessageDialog(null, mensaje);
            setJugador(null);
        }
    }
}
