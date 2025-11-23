package ues.edu.sv.fmo.sic1352025.segundo.semestre.contabilidad.control;

import java.io.Serializable;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import ues.edu.sv.fmo.sic1352025.segundo.semestre.contabilidad.entity.Transaccion;

@Stateless
@LocalBean
public class TransaccionBean extends AbstractDataPersist<Transaccion> implements Serializable{
          
  @PersistenceContext(unitName = "ContabilidadPU")
    EntityManager em;
    
    public TransaccionBean(){
        super(Transaccion.class);
    }

    public EntityManager getEntityManager() {
        return em;
    }


}
