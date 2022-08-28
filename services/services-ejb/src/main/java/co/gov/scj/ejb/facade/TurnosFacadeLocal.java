package co.gov.scj.ejb.facade;


import co.gov.scj.ejb.entity.scj.Turno;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Stateless
public class TurnosFacadeLocal implements ITurnosFacadeLocal {

    @PersistenceContext(unitName = "scj")
    private EntityManager em;


    public List<Turno> getListTurnos() {
        List<Turno> results = new ArrayList<Turno>();

        try {
            TypedQuery<Turno> query = this.em.createNamedQuery("Turno.findAll", Turno.class);
            results = query.getResultList();
        } catch (Exception e) {
            System.out.println("Error");
        }

        return results;
    }
    
    public List<Turno> getListTurnosByArea(String ID) {
        List<Turno> results = new ArrayList<Turno>();

        try {
            TypedQuery<Turno> query = this.em.createNamedQuery("Turno.findByTipoServicio", Turno.class);
            query.setParameter("tipoServicio", ID);
            results = query.getResultList();
        } catch (Exception e) {
            System.out.println("Error");
        }

        return results;
    }

   
    
}
