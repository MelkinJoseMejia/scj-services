package co.gov.scj.web.beans;


import co.gov.scj.ejb.entity.scj.Cliente;
import co.gov.scj.ejb.entity.scj.Turno;
import co.gov.scj.ejb.facade.IClienteFacadeLocal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


@ManagedBean(name = ClienteBean.MANAGE_BEAN )
@ViewScoped
public class ClienteBean {
    
    public static final String MANAGE_BEAN = "clienteBean";
    
    @EJB(beanName = "ClienteFacade")
    IClienteFacadeLocal clienteFacade;
     
    private Cliente cliente;
    
    private List<Turno> turno;
    
    private Turno turnoInsertar;
    
    @PostConstruct
    public void inicializar(){
        cliente = new Cliente();
        turno = new ArrayList();
        turnoInsertar = new Turno();

    }
    
    public Cliente crearCliente(){
        clienteFacade.registrarCliente(cliente);
        
        Turno max = this.clienteFacade.getTurnoMax();
        turnoInsertar.setConsecutivoTurno(max.getConsecutivoTurno()+1);
        turnoInsertar.setIdentificacionTurno(cliente.getIdentificacion());
        turnoInsertar.setIdEstado(1);
        turnoInsertar.setTipoServicio(cliente.getTipoServicio());
        turnoInsertar.setFechaEstadoTurno(LocalDateTime. now());
        
        Turno insert = clienteFacade.registrarTurno(turnoInsertar);
        
        return cliente;
    }
    
    public void getTurnosByCedula(String cedula) {
   
        try {
           this.turno = this.clienteFacade.getListTurnosByCedula(cedula);

        }
         catch (Exception e) {
          e.printStackTrace();
        } 
  }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
  
}
