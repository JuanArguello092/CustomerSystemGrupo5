package fidelizacionClientes.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name = "bolsa_puntos")
public class Bolsapuntos  implements Serializable {
    @Id
    @Column(name = "id")
    @Basic(optional = false )
    @GeneratedValue(generator = "bolsa_puntos_id_seq",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "bolsa_puntos_id_seq", sequenceName = "bolsa_puntos_id_seq", allocationSize = 0)
    private Integer id;

    //id perteneciente a la tabla de cliente
    @JoinColumn(name = "id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Cliente id_cliente;

    @Column(name = "fecha_asignacion_puntaje")
    @Basic (optional = false)
    @Temporal(TemporalType.DATE)
    private Date fecha_asignacion_puntaje;

    @Column(name = "fecha_caducidad_puntaje")
    @Basic (optional = false)
    @Temporal(TemporalType.DATE)
    private Date fecha_caducidad_puntaje;

    @Column(name = "puntaje_asignado")
    @Basic (optional = false)
    private Integer puntaje_asignado;

    @Column(name = "puntaje_utilizado")
    @Basic (optional = false)
    private Integer puntaje_utilizado;

    @Column(name = "saldo_punto")
    @Basic (optional = false)
    private Integer saldo_punto;

    @Column(name = "monto_operacion")
    @Basic (optional = false)
    private Integer monto_operacion;

    //lista de uso de puntos detalle
    @OneToMany(cascade= CascadeType.ALL, mappedBy = "id_bolsa_puntos")
    private List<Usopuntosdetalle> listausopuntos;

    public Bolsapuntos() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha_asignacion_puntaje() {
        return fecha_asignacion_puntaje;
    }

    public void setFecha_asignacion_puntaje(Date fecha_asignacion_puntaje) {
        this.fecha_asignacion_puntaje = fecha_asignacion_puntaje;
    }

    public Date getFecha_caducidad_puntaje() {
        return fecha_caducidad_puntaje;
    }

    public void setFecha_caducidad_puntaje(Date fecha_caducidad_puntaje) {
        this.fecha_caducidad_puntaje = fecha_caducidad_puntaje;
    }

    public Integer getPuntaje_asignado() {
        return puntaje_asignado;
    }

    public void setPuntaje_asignado(Integer puntaje_asignado) {
        this.puntaje_asignado = puntaje_asignado;
    }

    public Integer getPuntaje_utilizado() {
        return puntaje_utilizado;
    }

    public void setPuntaje_utilizado(Integer puntaje_utilizado) {
        this.puntaje_utilizado = puntaje_utilizado;
    }

    public Integer getSaldo_punto() {
        return saldo_punto;
    }

    public void setSaldo_punto(Integer saldo_punto) {
        this.saldo_punto = saldo_punto;
    }

    public Integer getMonto_operacion() {
        return monto_operacion;
    }

    public void setMonto_operacion(Integer monto_operacion) {
        this.monto_operacion = monto_operacion;
    }

    public Cliente getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Cliente id_cliente) {
        this.id_cliente = id_cliente;
    }

    public List<Usopuntosdetalle> getListausopuntos() {
        return listausopuntos;
    }

    public void setListausopuntos(List<Usopuntosdetalle> listausopuntos) {
        this.listausopuntos = listausopuntos;
    }
}
