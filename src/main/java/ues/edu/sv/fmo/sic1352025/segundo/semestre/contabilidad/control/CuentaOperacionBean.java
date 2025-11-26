package ues.edu.sv.fmo.sic1352025.segundo.semestre.contabilidad.control;

import java.io.Serializable;

import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.Query;
import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import ues.edu.sv.fmo.sic1352025.segundo.semestre.contabilidad.entity.CuentaContable;
import ues.edu.sv.fmo.sic1352025.segundo.semestre.contabilidad.entity.CuentaOperacion;
import java.util.logging.Logger;
import java.util.logging.Level;

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

    /**
     * NAMED QUERIE NATURALEZA
     */
        public String findNaturalezaCuentaOperacion(final String nombreOperacion, final CuentaContable cuentaContable) {
        try {
            // Usar query nativa SQL para evitar problemas con JPA
            String sql = "SELECT co.naturaleza FROM cuenta_operacion co " +
                        "JOIN operacion_bancaria ob ON co.id_operacion_bancaria = ob.id_operacion_bancaria " +
                        "WHERE co.id_cuenta_contable = ?1 AND ob.nombre = ?2";
            
            Query q = em.createNativeQuery(sql);
            q.setParameter(1, cuentaContable.getIdCuentaContable());
            q.setParameter(2, nombreOperacion);
            q.setMaxResults(1);
            return (String) q.getSingleResult();
        }catch (Exception e) {
           Logger.getLogger(getClass().getName()).log(Level.SEVERE,e.getMessage(),e);
        }
        return null;
    }


}
