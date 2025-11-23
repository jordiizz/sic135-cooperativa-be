package ues.edu.sv.fmo.sic1352025.segundo.semestre.contabilidad.control;

import java.io.Serializable;

import javax.persistence.PersistenceContext;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import ues.edu.sv.fmo.sic1352025.segundo.semestre.contabilidad.entity.Persona;

@Stateless
@LocalBean
public class PersonaBean extends AbstractDataPersist<Persona> implements Serializable {

      
  @PersistenceContext(unitName = "ContabilidadPU")
    EntityManager em;
    
    public PersonaBean(){
        super(Persona.class);
    }

    public EntityManager getEntityManager() {
        return em;
    }
}
