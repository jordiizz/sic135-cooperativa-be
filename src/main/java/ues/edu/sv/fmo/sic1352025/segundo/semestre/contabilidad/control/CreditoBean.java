package ues.edu.sv.fmo.sic1352025.segundo.semestre.contabilidad.control;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import java.io.Serializable;
import javax.persistence.PersistenceContext;
import ues.edu.sv.fmo.sic1352025.segundo.semestre.contabilidad.entity.Credito;

/**
 *
 * @author jordi
 */
@Stateless
@LocalBean
public class CreditoBean extends AbstractDataPersist<Credito> implements Serializable {
    
  @PersistenceContext(unitName = "ContabilidadPU")
    EntityManager em;
    
    public CreditoBean(){
        super(Credito.class);
    }

    public EntityManager getEntityManager() {
        return em;
    }
}
