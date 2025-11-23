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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author jordi
 */
@Entity
@Table(name = "socio")
@NamedQueries({
    @NamedQuery(name = "Socio.findAll", query = "SELECT s FROM Socio s"),
    @NamedQuery(name = "Socio.findByDocumentoFiscal", query = "SELECT s FROM Socio s WHERE s.documentoFiscal = :documentoFiscal")})
public class Socio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Lob
    @Column(name = "id_socio")
    private Object idSocio;
    @Column(name = "documento_fiscal")
    private String documentoFiscal;
    @OneToMany(mappedBy = "idSocio")
    private Collection<CreditoSocio> creditoSocioCollection;
    @JoinColumn(name = "id_persona", referencedColumnName = "id_persona")
    @ManyToOne
    private Persona idPersona;
    @OneToMany(mappedBy = "idSocio")
    private Collection<CuentaBancaria> cuentaBancariaCollection;

    public Socio() {
    }

    public Socio(Object idSocio) {
        this.idSocio = idSocio;
    }

    public Object getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(Object idSocio) {
        this.idSocio = idSocio;
    }

    public String getDocumentoFiscal() {
        return documentoFiscal;
    }

    public void setDocumentoFiscal(String documentoFiscal) {
        this.documentoFiscal = documentoFiscal;
    }

    public Collection<CreditoSocio> getCreditoSocioCollection() {
        return creditoSocioCollection;
    }

    public void setCreditoSocioCollection(Collection<CreditoSocio> creditoSocioCollection) {
        this.creditoSocioCollection = creditoSocioCollection;
    }

    public Persona getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Persona idPersona) {
        this.idPersona = idPersona;
    }

    public Collection<CuentaBancaria> getCuentaBancariaCollection() {
        return cuentaBancariaCollection;
    }

    public void setCuentaBancariaCollection(Collection<CuentaBancaria> cuentaBancariaCollection) {
        this.cuentaBancariaCollection = cuentaBancariaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSocio != null ? idSocio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Socio)) {
            return false;
        }
        Socio other = (Socio) object;
        if ((this.idSocio == null && other.idSocio != null) || (this.idSocio != null && !this.idSocio.equals(other.idSocio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ues.edu.sv.fmo.sic1352025.segundo.semestre.contabilidad.entity.Socio[ idSocio=" + idSocio + " ]";
    }
    
}
