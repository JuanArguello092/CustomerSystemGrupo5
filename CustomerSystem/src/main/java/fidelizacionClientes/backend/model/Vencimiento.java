package fidelizacionClientes.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name = "vencimiento")
public class Vencimiento  implements Serializable {
    @Id
    @Column(name = "id")
    @Basic(optional = false )
    @GeneratedValue(generator = "vencimiento_id_seq",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "vencimiento_id_seq", sequenceName = "vencimiento_id_seq", allocationSize = 0)
    private Integer id;

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

    @JoinColumn(name='id',referencedColumnName = 'id')
    @OneToOne(optional='false')
    private Puntos puntos;

    @OneToOne(cascade= CascadeType.ALL, mappedBy = "vencimiento1")
    private Puntos puntos1;

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

    public Puntos getPuntos() {
        return puntos;
    }

    public void setPuntos(Puntos puntos) {
        this.puntos = puntos;
    }

    public Puntos getPuntos1() {
        return puntos1;
    }

    public void setPuntos1(Puntos puntos1) {
        this.puntos1 = puntos1;
    }
}
