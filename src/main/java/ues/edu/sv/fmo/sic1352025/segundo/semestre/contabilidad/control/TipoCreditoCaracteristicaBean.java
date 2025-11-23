package ues.edu.sv.fmo.sic1352025.segundo.semestre.contabilidad.control;


import java.io.Serializable;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import ues.edu.sv.fmo.sic1352025.segundo.semestre.contabilidad.entity.TipoCreditoCaracteristica;

@Stateless
@LocalBean
public class TipoCreditoCaracteristicaBean extends AbstractDataPersist<TipoCreditoCaracteristica> implements Serializable{
          
  @PersistenceContext(unitName = "ContabilidadPU")
    EntityManager em;
    
    public TipoCreditoCaracteristicaBean(){
        super(TipoCreditoCaracteristica.class);
    }

    public EntityManager getEntityManager() {
        return em;
    }


}