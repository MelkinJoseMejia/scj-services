package co.gov.scj.ejb.entity.scj;

import java.io.Serializable;
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
@Table(name = "CLIENTE", schema = "SCJ")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c")})
public class Cliente
        implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDENTIFICACION")
    private String identificacion;
    
    @Column(name = "NOMBRES")
    private String nombres;
    
    @Column(name = "APELLIDOS")
    private String apellidos;
    
    @Column(name = "EDAD")
    private Integer edad;
    
    @Column(name = "SEXO")
    private String sexo;
    
    @Column(name = "TIPO_IDENTIFICACION")
    private String tipoIdentificacion;
    
    @Column(name = "DEPARTAMENTO")
    private String departamento;
    
    @Column(name = "CIUDAD")
    private String ciudad;
    
    @Column(name = "BARRIO")
    private String barrio;
    
    @Column(name = "DIRECCION")
    private String direccion;
    
    @Column(name = "ESTADO")
    private String estado;
    
    @Column(name = "TIPO_SERVICIO")
    private long tipoServicio;

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public long getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(long tipoServicio) {
        this.tipoServicio = tipoServicio;
    }
    
      
}