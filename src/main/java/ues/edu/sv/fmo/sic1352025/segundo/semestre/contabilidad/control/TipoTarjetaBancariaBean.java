package ues.edu.sv.fmo.sic1352025.segundo.semestre.contabilidad.control;

import java.io.Serializable;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import ues.edu.sv.fmo.sic1352025.segundo.semestre.contabilidad.entity.TipoTarjetaBancaria;

@Stateless
@LocalBean
public class TipoTarjetaBancariaBean extends AbstractDataPersist<TipoTarjetaBancaria> implements Serializable{
          
  @PersistenceContext(unitName = "ContabilidadPU")
    EntityManager em;
    
    public TipoTarjetaBancariaBean(){
        super(TipoTarjetaBancaria.class);
    }

    public EntityManager getEntityManager() {
        return em;
    }


}
