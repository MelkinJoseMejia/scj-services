/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.scj.ejb.facade;


import co.gov.scj.ejb.entity.scj.Cliente;
import co.gov.scj.ejb.entity.scj.Turno;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Melkin Jose Mejia
 */
@Local
public interface IClienteFacadeLocal {
    
    List<Turno> getListTurnosByCedula(String identificacion);
    
    Turno getTurnoMax();
    
    Cliente registrarCliente(Cliente cliente);
    
    Turno registrarTurno(Turno turno);
    
}
