/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ues.edu.sv.fmo.sic1352025.segundo.semestre.contabilidad.control;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import java.io.Serializable;
import jakarta.persistence.PersistenceContext;
import ues.edu.sv.fmo.sic1352025.segundo.semestre.contabilidad.entity.CuentaContable;

/**
 *
 * @author jordi
 */
@Stateless
@LocalBean
public class CuentaContableBean extends AbstractDataPersist<CuentaContable> implements Serializable {

      @PersistenceContext(unitName = "ContabilidadPU")
    EntityManager em;
    
    public CuentaContableBean(){
        super(CuentaContable.class);
    }

    public EntityManager getEntityManager() {
        return em;
    }
}
