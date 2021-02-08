/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControladorJPA;

import Modelo.Equipo;

/**
 *
 * @author PC
 */
public class Nodo {
    Equipo equipo;
    Nodo siquiente;

    public Nodo() {
        this.equipo = equipo;
        this.siquiente = siquiente;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Nodo getSiquiente() {
        return siquiente;
    }

    public void setSiquiente(Nodo siquiente) {
        this.siquiente = siquiente;
    }
    
    
    
}
