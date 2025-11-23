/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ues.edu.sv.fmo.sic1352025.segundo.semestre.contabilidad.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author jordi
 */
@Entity
@Table(name = "credito_socio")
@NamedQueries({
    @NamedQuery(name = "CreditoSocio.findAll", query = "SELECT c FROM CreditoSocio c"),
    @NamedQuery(name = "CreditoSocio.findByActivo", query = "SELECT c FROM CreditoSocio c WHERE c.activo = :activo")})
public class CreditoSocio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "id_credito_socio")
    private Object idCreditoSocio;
    @Column(name = "activo")
    private Boolean activo;
    @JoinColumn(name = "id_credito", referencedColumnName = "id_credito")
    @ManyToOne
    private Credito idCredito;
    @JoinColumn(name = "id_socio", referencedColumnName = "id_socio")
    @ManyToOne
    private Socio idSocio;

    public CreditoSocio() {
    }

    public CreditoSocio(Object idCreditoSocio) {
        this.idCreditoSocio = idCreditoSocio;
    }

    public Object getIdCreditoSocio() {
        return idCreditoSocio;
    }

    public void setIdCreditoSocio(Object idCreditoSocio) {
        this.idCreditoSocio = idCreditoSocio;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Credito getIdCredito() {
        return idCredito;
    }

    public void setIdCredito(Credito idCredito) {
        this.idCredito = idCredito;
    }

    public Socio getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(Socio idSocio) {
        this.idSocio = idSocio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCreditoSocio != null ? idCreditoSocio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CreditoSocio)) {
            return false;
        }
        CreditoSocio other = (CreditoSocio) object;
        if ((this.idCreditoSocio == null && other.idCreditoSocio != null) || (this.idCreditoSocio != null && !this.idCreditoSocio.equals(other.idCreditoSocio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ues.edu.sv.fmo.sic1352025.segundo.semestre.contabilidad.entity.CreditoSocio[ idCreditoSocio=" + idCreditoSocio + " ]";
    }
    
}
