package ues.edu.sv.fmo.sic1352025.segundo.semestre.contabilidad.control;

import java.io.Serializable;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import ues.edu.sv.fmo.sic1352025.segundo.semestre.contabilidad.entity.Empleado;

@Stateless
@LocalBean
public class EmpleadoBean  extends AbstractDataPersist<Empleado> implements Serializable{
  
   @PersistenceContext(unitName = "ContabilidadPU")
    EntityManager em;
    
    public EmpleadoBean(){
        super(Empleado.class);
    }

    public EntityManager getEntityManager() {
        return em;
    }
}
