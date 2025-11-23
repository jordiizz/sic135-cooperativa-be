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
import ues.edu.sv.fmo.sic1352025.segundo.semestre.contabilidad.entity.CreditoSocio;

/**
 *
 * @author jordi
 */
@Stateless
@LocalBean
public class CreditoSocioBean extends AbstractDataPersist<CreditoSocio> implements Serializable{
      @PersistenceContext(unitName = "ContabilidadPU")
    EntityManager em;
    
    public CreditoSocioBean(){
        super(CreditoSocio.class);
    }

    public EntityManager getEntityManager() {
        return em;
    }
}
