package co.gov.scj.ejb.entity.scj;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "TURNO", schema = "SCJ")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Turno.findAll", query = "SELECT t FROM Turno t"),
    @NamedQuery(name = "Turno.findMax", query = "SELECT max(t) FROM Turno t"),
    @NamedQuery(name = "Turno.findByCedula", query = "SELECT t FROM Turno t WHERE t.identificacionCliente = :identificacionCliente"),
    @NamedQuery(name = "Turno.findByTipoServicio", query = "SELECT t FROM Turno t WHERE t.tipoServicio = :tipoServicio")})
public class Turno
        implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CONSECUTIVO_TURNO")
    private long consecutivoTurno;
    
    @Column(name = "IDENTIFICACION_CLIENTE")
    private String identificacionTurno;
    
    @Column(name = "TIPO_SERVICIO")
    private long tipoServicio;
    
    @Column(name = "ID_ESTADO")
    private long idEstado;
    
    @Column(name = "FECHA_ESTADO_TURNO")
    private LocalDateTime fechaEstadoTurno;

    public long getConsecutivoTurno() {
        return consecutivoTurno;
    }

    public void setConsecutivoTurno(long consecutivoTurno) {
        this.consecutivoTurno = consecutivoTurno;
    }

    public String getIdentificacionTurno() {
        return identificacionTurno;
    }

    public void setIdentificacionTurno(String identificacionTurno) {
        this.identificacionTurno = identificacionTurno;
    }

    public long getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(long tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public long getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(long idEstado) {
        this.idEstado = idEstado;
    }

    public LocalDateTime getFechaEstadoTurno() {
        return fechaEstadoTurno;
    }

    public void setFechaEstadoTurno(LocalDateTime fechaEstadoTurno) {
        this.fechaEstadoTurno = fechaEstadoTurno;
    }
    
    
    
   
}