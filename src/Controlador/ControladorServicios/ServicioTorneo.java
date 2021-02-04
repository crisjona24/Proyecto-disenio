/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.ControladorServicios;

import Controlador.ControladorDao.TorneoDao;
import Modelo.Torneo;
import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 * Clase servicio la cual interactua directamente con la vista 
 * Permite implementar los metodos para interacturar con la BD
 * desde codigo
 * 
 * @author Cristobal Rios
 */

public class ServicioTorneo implements Serializable{
    
    /*private TorneoDao dao = new TorneoDao();
    
    public Torneo obtenerTorneo (){
        return dao.getTorneo();
    }
    */
    
    private TorneoDao dao = new TorneoDao();
    private Torneo torneo;
    
     public Torneo getTorneo() {
        if (torneo == null) {
            torneo = new Torneo();
        }
        return torneo;
    }

    public void setTorneo(Torneo torneo) {
        this.torneo = torneo;
    }
    
    public void guardar(){
        dao.setTorneo(torneo);
        String mensaje = (torneo.getId_tor()!=null) ? "Se ha guardado bien " : "No se ha guardado";
        if(dao.guardar()){
            //mensaje de confirmacion
            JOptionPane.showMessageDialog(null, mensaje);
            setTorneo(null);
        }
    }
}
