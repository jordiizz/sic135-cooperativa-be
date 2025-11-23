package ues.edu.sv.fmo.sic1352025.segundo.semestre.contabilidad.control;

import java.io.Serializable;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import ues.edu.sv.fmo.sic1352025.segundo.semestre.contabilidad.entity.TipoEmpleado;

@Stateless
@LocalBean
public class TipoEmpleadoBean extends AbstractDataPersist<TipoEmpleado> implements Serializable{
          
  @PersistenceContext(unitName = "ContabilidadPU")
    EntityManager em;
    
    public TipoEmpleadoBean(){
        super(TipoEmpleado.class);
    }

    public EntityManager getEntityManager() {
        return em;
    }


}
