package fidelizacionClientes.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name = "asignacion")
public class Asignacion  implements Serializable {

    //id perteneciente a la tabla de cliente
    @JoinColumn(name = "id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Cliente id_cliente;

    //id perteneciente a la tabla de puntos
    @JoinColumn(name = "id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Puntos id_puntos;

    @Column(name = "fecha_inicio_validez")
    @Basic (optional = false)
    @Temporal(TemporalType.DATE)
    private Date fecha_inicio_validez;

    @Column(name = "fecha_fin_validez")
    @Basic (optional = false)
    @Temporal(TemporalType.DATE)
    private Date fecha_fin_validez;

    @Column(name = "dias_duracion")
    @Basic (optional = false)
    private Integer dias_duracion;



    public Vencimiento() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha_inicio_validez() {
        return fecha_inicio_validez;
    }

    public void setFecha_inicio_validez(Date fecha_inicio_validez) {
        this.fecha_inicio_validez = fecha_inicio_validez;
    }

    public Date getFecha_fin_validez() {
        return fecha_fin_validez;
    }

    public void setFecha_fin_validez(Date fecha_fin_validez) {
        this.fecha_fin_validez = fecha_fin_validez;
    }

    public Integer getDias_duracion() {
        return dias_duracion;
    }

    public void setDias_duracion(Integer dias_duracion) { this.dias_duracion = dias_duracion;
    }

    public Cliente getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Cliente id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Cliente getId_puntos() {
        return id_puntos;
    }

    public void setId_puntos(Cliente id_puntos) {
        this.id_puntos = id_puntos;
    }
}
