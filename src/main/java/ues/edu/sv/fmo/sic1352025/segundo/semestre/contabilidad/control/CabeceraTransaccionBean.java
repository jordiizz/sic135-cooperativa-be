package ues.edu.sv.fmo.sic1352025.segundo.semestre.contabilidad.control;


import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import java.io.Serializable;
import jakarta.persistence.PersistenceContext;
import ues.edu.sv.fmo.sic1352025.segundo.semestre.contabilidad.entity.CabeceraTransaccion;


/**
 *
 * @author jordi
 */

@Stateless
@LocalBean
public class CabeceraTransaccionBean extends AbstractDataPersist<CabeceraTransaccion> implements Serializable{
    
    @PersistenceContext(unitName = "ContabilidadPU")
    EntityManager em;
    
    public CabeceraTransaccionBean(){
        super(CabeceraTransaccion.class);
    }

    public EntityManager getEntityManager() {
        return em;
    }

}