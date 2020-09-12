package fidelizacionClientes.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name = "cliente")

public class Cliente  implements Serializable {
    @Id
    @Column(name = "id")
    @Basic (optional = false)
    @GeneratedValue(generator = "cliente_id_seq",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "cliente_id_seq", sequenceName = "cliente_id_seq", allocationSize = 0)
    private Integer id;

    @Column(name = "nombre", length = 20)
    @Basic (optional = false)
    private String nombre;

    @Column(name = "apellido", length = 20)
    @Basic (optional = false)
    private String apellido;

    @Column(name = "numero_documento")
    @Basic (optional = false)
    private Integer numeroDocumento;

    @Column(name = "tipo_documento", length = 30)
    @Basic (optional = false)
    private String tipoDocumento;

    @Column(name = "nacionalidad", length = 30)
    @Basic (optional = false)
    private String nacionalidad;

    @Column(name = "email", length = 30)
    @Basic (optional = false)
    private String email;

    @Column(name = "telefono", length = 30)
    @Basic (optional = false)
    private String telefono;

    @Column(name = "fecha_nacimiento")
    @Basic (optional = false)
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;

    //lista de asignacion cliente
    @OneToMany(cascade= CascadeType.ALL, mappedBy = "id_cliente")
    private List<Asignacion> listaAsignacion;

    //lista de bolsa de puntos
    @OneToMany(cascade= CascadeType.ALL, mappedBy = "id_cliente")
    private List<Bolsapuntos> listabolsapuntos;

    //lista de uso de puntos cabecera
    @OneToMany(cascade= CascadeType.ALL, mappedBy = "id_cliente")
    private List<Usopuntoscabecera> listapuntoscab;

    public Cliente() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(Integer numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public List<Asignacion> getListaAsignacion() {
        return listaAsignacion;
    }

    public void setListaAsignacion(List<Asignacion> listaAsignacion) {
        this.listaAsignacion = listaAsignacion;
    }

    public List<Bolsapuntos> getListabolsapuntos() {
        return listabolsapuntos;
    }

    public void setListabolsapuntos(List<Bolsapuntos> listabolsapuntos) {
        this.listabolsapuntos = listabolsapuntos;
    }

    public List<Usopuntoscabecera> getListapuntoscab() {
        return listapuntoscab;
    }

    public void setListapuntoscab(List<Usopuntoscabecera> listapuntoscab) {
        this.listapuntoscab = listapuntoscab;
    }
}
