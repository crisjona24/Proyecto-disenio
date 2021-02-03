/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Clase Equipo donde se especifican los atributos 
 * que seran manejados 
 * @author Cristobal Rios 
 */
@Entity
public class Equipo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    /* Se estable los datos que se manejaran dentro de la 
    base da datos
     */
    @Column(length = 50)
    private String nombreEquipo;
    @Column(length = 50)
    private String aliasEquipo;
    @Column(length = 50)
    private String entrnadorEquipo;
    /*Se establece la relacion entre las tablas identificando la tabla fuerte y la 
    debil*/
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(referencedColumnName = "id" , name = "id_Torneo")
    private Torneo torneo;
    
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getAliasEquipo() {
        return aliasEquipo;
    }

    public void setAliasEquipo(String aliasEquipo) {
        this.aliasEquipo = aliasEquipo;
    }

    public String getEntrnadorEquipo() {
        return entrnadorEquipo;
    }

    public void setEntrnadorEquipo(String entrnadorEquipo) {
        this.entrnadorEquipo = entrnadorEquipo;
    }

    public Torneo getTorneo() {
        return torneo;
    }

    public void setTorneo(Torneo torneo) {
        this.torneo = torneo;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equipo)) {
            return false;
        }
        Equipo other = (Equipo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Equipo[ id=" + id + " ]";
    }
    
}
