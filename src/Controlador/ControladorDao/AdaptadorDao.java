/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.ControladorDao;

import Conexion.Conexion;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristobal Rios
 */
public class AdaptadorDao<T> implements InterfazDao<T> {
    /*creamos los objetos del tipo conexion para poder llamar a una nueva conexion*/
    /*creamos un objeto de tipo Clase para permitir invocar a una clase en especifico 
    en la vista*/
    private Conexion conexion;
    private Class clase;

    public AdaptadorDao(Conexion conexion, Class clase) {
        this.conexion = conexion;
        this.clase = clase;
    }
    /*llamamos a los metodos y a traves del entity manager nos permite realizar 
    el mapero dentro de la BD*/
    @Override
    public void guardar(T objetoCreado) throws Exception {

        EntityManager en = this.conexion.en();
        try {
            en.getTransaction().begin();
            en.persist(objetoCreado);
            en.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos ", null, JOptionPane.ERROR_MESSAGE);
            en.getTransaction().rollback();
            en.close();
        } finally {
            en.close();
        }
    }

    @Override
    public List<T> listar() {
        List<T> lista = new ArrayList<>();
        EntityManager en = this.conexion.en();

        try {
            Query query = en.createQuery("Select p" + clase.getSimpleName() + "p");
            lista = query.getResultList();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al listar los datos ", null, JOptionPane.ERROR_MESSAGE);
        }
        return lista;
    }

    @Override
    public void modificar(T objetoCreado) throws Exception {
        EntityManager en = this.conexion.en();
        try {
            en.getTransaction().begin();
            en.merge(objetoCreado);
            en.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al editar los datos ", null, JOptionPane.ERROR_MESSAGE);
            en.getTransaction().rollback();
            en.close();
        } finally {
            en.close();
        }
    }

    @Override
    public T obtener(Long id) {
        EntityManager en = this.conexion.en();
        T objeto = null;
        try {
            objeto = (T) en.find(clase, id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al obtener los datos ", null, JOptionPane.ERROR_MESSAGE);
        }
        return objeto;
    }

    public Conexion getConexion() {
        return conexion;
    }
    
    
}
