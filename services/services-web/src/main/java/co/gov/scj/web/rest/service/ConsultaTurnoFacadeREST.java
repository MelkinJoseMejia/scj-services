package co.gov.scj.web.rest.service;

import co.gov.scj.ejb.entity.scj.Turno;
import co.gov.scj.ejb.facade.IClienteFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;


@Stateless
@Path("consultaturno")
public class ConsultaTurnoFacadeREST
{
  @EJB(beanName = "ClienteFacade")
    IClienteFacadeLocal clienteFacade;
  
  @GET
  @Path("{identificacion}")
  @Produces({"application/json"})
  public List<Turno> get(@PathParam("identificaion") String identificacion) {
     return this.clienteFacade.getListTurnosByCedula(identificacion);
  }
}
