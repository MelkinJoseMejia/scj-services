package co.gov.scj.ejb.facade;

import co.gov.scj.ejb.entity.scj.Cliente;
import co.gov.scj.ejb.entity.scj.Turno;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Stateless
public class ClienteFacade implements IClienteFacadeLocal {

    @PersistenceContext(unitName = "scj")
    private EntityManager em;

    
    public List<Turno> getListTurnosByCedula(String identificacion) {
        List<Turno> results = new ArrayList<Turno>();

        try {
            TypedQuery<Turno> query = this.em.createNamedQuery("Turno.findByCedula", Turno.class);
            query.setParameter("identificacionCliente", identificacion);
            results = query.getResultList();
        } catch (Exception e) {
            System.out.println("Error");
        }

        return results;
    }
    
    public Turno getTurnoMax() {
        Turno results = new Turno();

        try {
            TypedQuery<Turno> query = this.em.createNamedQuery("Turno.findMax", Turno.class);
            results = query.getResultList().get(0);
        } catch (Exception e) {
            System.out.println("Error");
        }

        return results;
    }

    
    public Cliente registrarCliente(Cliente cliente)  {
            em.persist(cliente);
        return cliente;    
    }
    
    public Turno registrarTurno(Turno turno)  {
            em.persist(turno);
        return turno;    
    }
}
