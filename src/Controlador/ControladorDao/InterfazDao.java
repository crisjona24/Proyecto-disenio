/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.ControladorDao;

import java.util.List;

/**
 *
 * @author Cristobal Rios
 */
public interface InterfazDao <T> {
    /*creacion de los metodos que nos permiten manejar las funciones 
    para poder manejar los datos*/
    public void guardarA(T objetoCreado)throws Exception;
    public void modificar(T objetoCreado)throws Exception;
    public T obtener (Long id);
    public T obtenernombre (String nombre);
    public List<T> listar();
    public void borrar(Long id)throws Exception;
}
