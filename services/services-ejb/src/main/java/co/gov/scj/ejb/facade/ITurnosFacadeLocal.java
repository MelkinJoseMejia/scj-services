package co.gov.scj.ejb.facade;

import co.gov.scj.ejb.entity.scj.Turno;
import java.util.List;
import javax.ejb.Local;

@Local
public interface ITurnosFacadeLocal {
  
    List<Turno> getListTurnos();
    
    List<Turno> getListTurnosByArea(String ID);  
  
}

