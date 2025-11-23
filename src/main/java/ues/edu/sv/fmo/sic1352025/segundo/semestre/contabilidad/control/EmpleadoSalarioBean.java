package ues.edu.sv.fmo.sic1352025.segundo.semestre.contabilidad.control;

import java.io.Serializable;

import javax.persistence.PersistenceContext;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import ues.edu.sv.fmo.sic1352025.segundo.semestre.contabilidad.entity.EmpleadoSalario;

@Stateless
@LocalBean
public class EmpleadoSalarioBean extends AbstractDataPersist<EmpleadoSalario> implements Serializable{
  
  @PersistenceContext(unitName = "ContabilidadPU")
    EntityManager em;
    
    public EmpleadoSalarioBean(){
        super(EmpleadoSalario.class);
    }

    public EntityManager getEntityManager() {
        return em;
    }
}
