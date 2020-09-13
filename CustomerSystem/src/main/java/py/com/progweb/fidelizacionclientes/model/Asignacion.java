package py.com.progweb.fidelizacionclientes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "asignacion")
public class Asignacion {

    @Id
    @Column(name = "id_asignacion")
    @Basic (optional = false)
    @GeneratedValue(generator = "asignacion_id_seq",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "asignacion_id_seq", sequenceName = "asignacion_id_seq", allocationSize = 0)
    private Integer id_asignacion;


    @Column(name = "limite_inferior")
    @Basic (optional = false)
    private Integer limite_inferior;

    @Column(name = "limite_superior")
    @Basic (optional = false)
    private Integer limite_superior;

    @Column(name = "monto")
    @Basic (optional = false)
    private Integer monto;

    //id perteneciente a la tabla de cliente
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    @ManyToOne(optional = false)
    private Cliente cliente;

    //id perteneciente a la tabla de puntos
    @JoinColumn(name = "id_puntos", referencedColumnName = "id_puntos")
    @ManyToOne(optional = false)
    private Puntos puntos;

    public Asignacion() {

    }

    public Integer getId_asignacion() {
        return id_asignacion;
    }

    public void setId_asignacion(Integer id_asignacion) {
        this.id_asignacion = id_asignacion;
    }


    public Integer getLimite_inferior() {
        return limite_inferior;
    }

    public void setLimite_inferior(Integer limite_inferior) {
        this.limite_inferior = limite_inferior;
    }

    public Integer getLimite_superior() {
        return limite_superior;
    }

    public void setLimite_superior(Integer limite_superior) {
        this.limite_superior = limite_superior;
    }

    public Integer getMonto() {
        return monto;
    }

    public void setMonto(Integer monto) {
        this.monto = monto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Puntos getPuntos() {
        return puntos;
    }

    public void setPuntos(Puntos puntos) {
        this.puntos = puntos;
    }
}
