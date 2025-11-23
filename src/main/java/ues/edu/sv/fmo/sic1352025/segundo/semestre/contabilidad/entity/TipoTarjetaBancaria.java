/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ues.edu.sv.fmo.sic1352025.segundo.semestre.contabilidad.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author jordi
 */
@Entity
@Table(name = "tipo_tarjeta_bancaria")
@NamedQueries({
    @NamedQuery(name = "TipoTarjetaBancaria.findAll", query = "SELECT t FROM TipoTarjetaBancaria t"),
    @NamedQuery(name = "TipoTarjetaBancaria.findByNombre", query = "SELECT t FROM TipoTarjetaBancaria t WHERE t.nombre = :nombre")})
public class TipoTarjetaBancaria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "id_tipo_tarjeta_bancaria")
    private Object idTipoTarjetaBancaria;
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(mappedBy = "idTipoTarjetaBancaria")
    private Collection<TarjetaBancaria> tarjetaBancariaCollection;

    public TipoTarjetaBancaria() {
    }

    public TipoTarjetaBancaria(Object idTipoTarjetaBancaria) {
        this.idTipoTarjetaBancaria = idTipoTarjetaBancaria;
    }

    public Object getIdTipoTarjetaBancaria() {
        return idTipoTarjetaBancaria;
    }

    public void setIdTipoTarjetaBancaria(Object idTipoTarjetaBancaria) {
        this.idTipoTarjetaBancaria = idTipoTarjetaBancaria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<TarjetaBancaria> getTarjetaBancariaCollection() {
        return tarjetaBancariaCollection;
    }

    public void setTarjetaBancariaCollection(Collection<TarjetaBancaria> tarjetaBancariaCollection) {
        this.tarjetaBancariaCollection = tarjetaBancariaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoTarjetaBancaria != null ? idTipoTarjetaBancaria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoTarjetaBancaria)) {
            return false;
        }
        TipoTarjetaBancaria other = (TipoTarjetaBancaria) object;
        if ((this.idTipoTarjetaBancaria == null && other.idTipoTarjetaBancaria != null) || (this.idTipoTarjetaBancaria != null && !this.idTipoTarjetaBancaria.equals(other.idTipoTarjetaBancaria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ues.edu.sv.fmo.sic1352025.segundo.semestre.contabilidad.entity.TipoTarjetaBancaria[ idTipoTarjetaBancaria=" + idTipoTarjetaBancaria + " ]";
    }
    
}
