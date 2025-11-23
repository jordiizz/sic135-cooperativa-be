package ues.edu.sv.fmo.sic1352025.segundo.semestre.contabilidad.control;

import java.io.Serializable;

import jakarta.persistence.PersistenceContext;
import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import ues.edu.sv.fmo.sic1352025.segundo.semestre.contabilidad.entity.CuentaOperacion;

@Stateless
@LocalBean
public class CuentaOperacionBean extends AbstractDataPersist<CuentaOperacion> implements Serializable{
      
  @PersistenceContext(unitName = "ContabilidadPU")
    EntityManager em;
    
    public CuentaOperacionBean(){
        super(CuentaOperacion.class);
    }

    public EntityManager getEntityManager() {
        return em;
    }

}
