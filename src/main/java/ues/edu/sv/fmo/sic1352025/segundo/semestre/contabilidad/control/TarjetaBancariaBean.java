package ues.edu.sv.fmo.sic1352025.segundo.semestre.contabilidad.control;

import java.io.Serializable;

import jakarta.persistence.PersistenceContext;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import ues.edu.sv.fmo.sic1352025.segundo.semestre.contabilidad.entity.TarjetaBancaria;

@Stateless
@LocalBean
public class TarjetaBancariaBean extends AbstractDataPersist<TarjetaBancaria> implements Serializable{
      
  @PersistenceContext(unitName = "ContabilidadPU")
    EntityManager em;
    
    public TarjetaBancariaBean(){
        super(TarjetaBancaria.class);
    }

    public EntityManager getEntityManager() {
        return em;
    }

}
