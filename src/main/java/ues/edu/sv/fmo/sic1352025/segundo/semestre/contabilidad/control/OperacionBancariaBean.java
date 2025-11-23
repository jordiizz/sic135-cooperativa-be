package ues.edu.sv.fmo.sic1352025.segundo.semestre.contabilidad.control;

import java.io.Serializable;

import javax.persistence.PersistenceContext;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import ues.edu.sv.fmo.sic1352025.segundo.semestre.contabilidad.entity.OperacionBancaria;

@Stateless
@LocalBean
public class OperacionBancariaBean extends AbstractDataPersist<OperacionBancaria> implements Serializable{

      
  @PersistenceContext(unitName = "ContabilidadPU")
    EntityManager em;
    
    public OperacionBancariaBean(){
        super(OperacionBancaria.class);
    }

    public EntityManager getEntityManager() {
        return em;
    }

}
