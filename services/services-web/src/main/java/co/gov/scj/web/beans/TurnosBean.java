package co.gov.scj.web.beans;

import co.gov.scj.ejb.entity.scj.Turno;
import co.gov.scj.ejb.facade.ITurnosFacadeLocal;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.apache.commons.lang3.StringUtils;


@ManagedBean
@SessionScoped
public class TurnosBean
  implements Serializable
{
  
  @EJB(beanName = "TurnosFacadeLocal")
  ITurnosFacadeLocal turnosFacadeLocal;
  
  private List<Turno> turno;
  
  
  @PostConstruct
  public void init() {
     getClientesByArea("");
  }


  public void getClientesByArea(String ID) {
      if (StringUtils.isEmpty(ID)) {
          this.turno = this.turnosFacadeLocal.getListTurnos();
      }
    
    try {
       this.turno = this.turnosFacadeLocal.getListTurnosByArea(ID);
    
    }
     catch (Exception e) {
      e.printStackTrace();
    } 
  }

  
  public List<Turno> getTurno() {
     return this.turno;
  }
  
  public void setTurno(List<Turno> turno) {
     this.turno = turno;
  }

}
