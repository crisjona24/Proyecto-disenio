/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Conexion.Conexion;

/**
 *
 * @author PC
 */
public class Controlador {
    public static void main(String[] args) {
        Conexion c = Conexion.getInstance();
        System.out.println("222222222222222222222222");
        Conexion.getInstance().en();
    }
}
