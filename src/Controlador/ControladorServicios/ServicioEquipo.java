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

    public void guardarSE() {
        dao.setEquipo((equipo));  
        if (dao.guardarED()) {
            //mensaje de confirmacion
            JOptionPane.showMessageDialog(null, "Se ha guardado con exito");
            setEquipo(null);
        }else{
            //mensaje de confirmacion
            JOptionPane.showMessageDialog(null, "Se ha producido un error");
        }
    }

     public void modificarSE() {
        dao.setEquipo((equipo));  
        if (dao.modificarED()) {
            //mensaje de confirmacion
            JOptionPane.showMessageDialog(null, "Se ha guardado con exito");
            setEquipo(null);
        }else{
            //mensaje de confirmacion
            JOptionPane.showMessageDialog(null, "Se ha producido un error");
        }
    }
     
      public void borrarSE(Long id) { 
        if (dao.borrarED(id)) {
            //mensaje de confirmacion
            JOptionPane.showMessageDialog(null, "Se ha borrado con exito");
            
        }else{
            //mensaje de confirmacion
            JOptionPane.showMessageDialog(null, "Se ha producido un error al borrar");
        }
    }
    
     public Equipo obtenerN(String nombre) {
          Equipo equipo = null;
         try {
             equipo = dao.obtenerNo(nombre);
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Error al obtener los datos del equipo" , null, JOptionPane.ERROR_MESSAGE);
         }

         return equipo;
    }
     
     public Equipo obtener(Long id) {
         Equipo equipo = null;
         try {
             equipo = dao.obtenerED(id);
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Error al obtener los datos del equipo" , null, JOptionPane.ERROR_MESSAGE);
         }

         return equipo;
    }
}
